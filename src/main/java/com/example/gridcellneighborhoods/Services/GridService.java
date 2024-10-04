package com.example.gridcellneighborhoods.Services;

import com.example.gridcellneighborhoods.Models.Grid;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class GridService {
    private Grid currentGrid = new Grid();

    public Grid createGrid(Grid grid) {
        currentGrid = grid;
        return currentGrid;
    }

    public Integer getNeighborsByDistance(Integer distance) {
        return findPositiveValues(currentGrid, distance);
    }

    public Integer findPositiveValues(Grid grid, Integer distance) {
        //not sure why I'm passing in height and width they should be calculated from the data one less place for error
        //I'm not checking overflow errors
        if(grid == null || grid.getHeight() == null || grid.getWidth() == null || grid.getValues() == null)
            return 0;
        if (grid.getWidth() < 1 || grid.getHeight() < 1) return 0;
        Set<String> uniqueCells = new HashSet<>();  //Create a hash set to store unique cells we can use this size to return the value
        int numberOfOverlaps = 0;
        int outOfBoundCells = 0;
        for (int y = 0; y < grid.getHeight(); y++) {
            if (grid.getValues()[y].length != grid.getWidth()) {
                System.out.println("jagged array");
                return 0;
            }
            for (int x = 0; x < grid.getWidth(); x++) {
                if (grid.getValues()[y][x] > 0) { //find a positive value
                    if (distance > grid.getWidth() && distance > grid.getHeight()) {
                        System.out.println("Short Circuited");
                        return grid.getHeight() * grid.getWidth();
                    }
                    for (int dy = -distance; dy <= distance; dy++) {
                        for (int dx = -distance; dx <= distance; dx++) {
                            // Check for overflow
                            if (willAdditionOverflow(y, dy) || willAdditionOverflow(x, dx)) {
                                //I don't have a good way of testing this, if distance is set to max int it will short circuit unless data is the same length
                                //creating a row of data that's of max size requires more heap than I have allocated
                                throw new ArithmeticException("Integer overflow occurred.");
                            }
                            //Calculate Manhattan distance
                            if (Math.abs(dy) + Math.abs(dx) <= distance) {    //cell within range
                                int newY = y + dy;
                                int newX = x + dx;
                                //check for inbounds
                                if (newY >= 0 && newY < grid.getHeight() && newX >= 0 && newX < grid.getWidth()) {
                                    String temp = newY + "," + newX;
                                    if (uniqueCells.contains(temp)) numberOfOverlaps++;
                                    else uniqueCells.add(temp);
                                } else outOfBoundCells++;
                            }
                        }
                    }
                }
            }
        }
        System.out.println("numberOfOverlaps = " + numberOfOverlaps);
        System.out.println("outOfBoundCells = " + outOfBoundCells);
        return uniqueCells.size();
    }

    public static boolean willAdditionOverflow(int a, int b) {
        if (b > 0 && a > Integer.MAX_VALUE - b) {
            return true; // Overflow
        } else return b < 0 && a < Integer.MIN_VALUE - b; // Underflow
    }
}

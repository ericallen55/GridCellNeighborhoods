package com.example.gridcellneighborhoods.Services;

import com.example.gridcellneighborhoods.Models.Grid;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GridServiceTest {
    private final GridService gridService = new GridService();
    @Test
    public void testCountUniqueNeighborhoodCells_OnePositiveCell_Middle() {
        Integer[][] gridValues = {
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};
        Grid grid = new Grid(11, 11, gridValues);
        int result = gridService.findPositiveValues(grid, 3);
        assertEquals(25, result);
    }

    @Test
    public void testCountUniqueNeighborhoodCells_OnePositiveCell_Side() {
        Integer[][] gridValues = {
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};        Grid grid = new Grid(11, 11, gridValues);
        int result = gridService.findPositiveValues(grid, 3);
        assertEquals(21, result);
    }

    @Test
    public void testCountUniqueNeighborhoodCells_OnePositiveCell_Corner() {
        Integer[][] gridValues = {
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};        Grid grid = new Grid(11, 11, gridValues);
        int result = gridService.findPositiveValues(grid, 3);
        assertEquals(10, result);
    }

    //odd sized 3,11
    @Test
    public void testCountUniqueNeighborhoodCells_OnePositiveCell_OddSized_Middle() {
        Integer[][] gridValues = {
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};        Grid grid = new Grid(3, 11, gridValues);
        int result = gridService.findPositiveValues(grid, 2);
        assertEquals(11, result);
    }
    @Test
    public void testCountUniqueNeighborhoodCells_OnePositiveCell_OddSized_Side() {
        Integer[][] gridValues = {
                {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};        Grid grid = new Grid(3, 11, gridValues);
        int result = gridService.findPositiveValues(grid, 2);
        assertEquals(9, result);
    }
    @Test
    public void testCountUniqueNeighborhoodCells_OnePositiveCell_OddSized_Corner() {
        Integer[][] gridValues = {
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}};        Grid grid = new Grid(3, 11, gridValues);
        int result = gridService.findPositiveValues(grid, 2);
        assertEquals(6, result);
    }

    @Test
    public void testCountUniqueNeighborhoodCells_TowPositiveCell_NoOverlap_OneCorner() {
        //15 for corner
        //41 for middle
        Integer[][] gridValues = {
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};
        Grid grid = new Grid(11, 11, gridValues);
        int result = gridService.findPositiveValues(grid, 4);
        assertEquals(56, result);
    }

    @Test
    public void testCountUniqueNeighborhoodCells_TowPositiveCell_Overlap_Middle() {
        //41 + 9
        Integer[][] gridValues = {
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};
        Grid grid = new Grid(11, 11, gridValues);
        int result = gridService.findPositiveValues(grid, 4);
        assertEquals(50, result);
    }
    @Test
    public void testCountUniqueNeighborhoodCells_TowPositiveCell_Overlap_Corner() {
        //15
        //39
        //54 total
        //overlap 3 + 3 + 3 + 2 + 1
        //54 - 12 = 42
        Integer[][] gridValues = {
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};
        Grid grid = new Grid(11, 11, gridValues);
        int result = gridService.findPositiveValues(grid, 4);
        assertEquals(42, result);
    }

    @Test
    public void testCountUniqueNeighborhoodCells_TowPositiveCell_NoOverlap_MiddleExampleSet() {
        Integer[][] gridValues = {
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};
        Grid grid = new Grid(11, 11, gridValues);
        int result = gridService.findPositiveValues(grid, 2);
        assertEquals(26, result);
    }
    @Test
    public void testCountUniqueNeighborhoodCells_TowPositiveCell_Overlap_MiddleExampleSet() {
        Integer[][] gridValues = {
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};
        Grid grid = new Grid(11, 11, gridValues);
        int result = gridService.findPositiveValues(grid, 2);
        assertEquals(22, result);
    }

    @Test
    public void testCountUniqueNeighborhoodCells_OnePositiveCell_Corner_distance_Equal_to_size() {
        Integer[][] gridValues = {
                {1, 0, 0,},
                {0, 0, 0,},
                {0, 0, 0,}};
        Grid grid = new Grid(3, 3, gridValues);
        int result = gridService.findPositiveValues(grid, 3);
        assertEquals(8, result);
    }
    @Test
    public void testCountUniqueNeighborhoodCells_OnePositiveCell_Corner_distance_GreaterThan_size() {
        //Should short circuit
        Integer[][] gridValues = {
                {1, 0, 0,},
                {0, 0, 0,},
                {0, 0, 0,}};
        Grid grid = new Grid(3, 3, gridValues);
        int result = gridService.findPositiveValues(grid, 4);
        assertEquals(9, result);
    }

    @Test
    public void testCountUniqueNeighborhoodCells_OnePositiveCell_Corner_distance_Much_GreaterThan_size() {
        //Should short circuit compare times to previous to see that the distance doesn't matter as long as it runs through short circuit case
        Integer[][] gridValues = {
                {1, 0, 0,},
                {0, 0, 0,},
                {0, 0, 0,}};
        Grid grid = new Grid(3, 3, gridValues);
        int result = gridService.findPositiveValues(grid, 4000);
        assertEquals(9, result);
    }

    @Test
    public void testCountUniqueNeighborhoodCells_NoPositiveCell_And_Doesnt_ShortCircuit() {
        Integer[][] gridValues = {
                {0, 0, 0,},
                {0, 0, 0,},
                {0, 0, 0,}};
        Grid grid = new Grid(3, 3, gridValues);
        int result = gridService.findPositiveValues(grid, 4);
        assertEquals(0, result);
    }

    @Test
    public void testCountUniqueNeighborhoodCells_NoPositiveCell_Jagged_array1() {
        Integer[][] gridValues = {
                {1, 0, 0,},
                {0, 0, 0,},
                {0, 0, 0, 0}};
        Grid grid = new Grid(3, 3, gridValues);
        int result = gridService.findPositiveValues(grid, 2);
        assertEquals(0, result);
    }
    @Test
    public void testCountUniqueNeighborhoodCells_NoPositiveCell_Jagged_array2() {
        Integer[][] gridValues = {
                {1, 0, 0,},
                {0, 0, 0,},
                {0, 0,}};
        Grid grid = new Grid(3, 3, gridValues);
        int result = gridService.findPositiveValues(grid, 2);
        assertEquals(0, result);
    }

    @Test
    public void testCountUniqueNeighborhoodCells_OnePositiveCell_Corner_distance_0() {
        Integer[][] gridValues = {
                {1, 0, 0,},
                {0, 0, 0,},
                {0, 0, 0,}};
        Grid grid = new Grid(3, 3, gridValues);
        int result = gridService.findPositiveValues(grid, 0);
        assertEquals(1, result);
    }

    @Test
    public void testCountUniqueNeighborhoodCells_OnePositiveCell_Corner_negative_distance() {
        Integer[][] gridValues = {
                {1, 0, 0,},
                {0, 0, 0,},
                {0, 0, 0,}};
        Grid grid = new Grid(3, 3, gridValues);
        int result = gridService.findPositiveValues(grid, -1);
        assertEquals(0, result);
    }

    @Test
    public void testCountUniqueNeighborhoodCells_null_grid() {
        int result = gridService.findPositiveValues(null, 1);
        assertEquals(0, result);
    }

    @Test
    public void testCountUniqueNeighborhoodCells_null_height() {
        Integer[][] gridValues = {
                {1, 0, 0,},
                {0, 0, 0,},
                {0, 0, 0,}};
        Grid grid = new Grid(null, 3, gridValues);
        int result = gridService.findPositiveValues(grid, 1);
        assertEquals(0, result);
    }

    @Test
    public void testCountUniqueNeighborhoodCells_null_width() {
        Integer[][] gridValues = {
                {1, 0, 0,},
                {0, 0, 0,},
                {0, 0, 0,}};
        Grid grid = new Grid(3, null, gridValues);
        int result = gridService.findPositiveValues(grid, 1);
        assertEquals(0, result);
    }

    @Test
    public void testCountUniqueNeighborhoodCells_null_distance() {
        Integer[][] gridValues = {
                {1, 0, 0,},
                {0, 0, 0,},
                {0, 0, 0,}};
        Grid grid = new Grid(3, null, gridValues);
        int result = gridService.findPositiveValues(grid, null);
        assertEquals(0, result);
    }

//    @Test
//    public void testCountUniqueNeighborhoodCells_Overflow() {
//        Integer[] maxLength = new Integer[Integer.MAX_VALUE];
//        for(int i = 0; i < maxLength.length; i++)
//            maxLength[i] = 1;
//        Integer[][] gridValues = {
//                maxLength};
//        Grid grid = new Grid(1, Integer.MAX_VALUE, gridValues);
//        int result = gridService.findPostiveValues(grid, 1000);
//        assertEquals(1, result);
//    }
}
package com.example.gridcellneighborhoods.Controllers;

import com.example.gridcellneighborhoods.Models.Grid;
import com.example.gridcellneighborhoods.Services.GridService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class GridCellController {
    @Autowired
    GridService gridService;
    @GetMapping("getNeighborsByDistance/{distance}")
    Integer getNeighborsByDistance(@PathVariable("distance") Integer distance){
        return gridService.getNeighborsByDistance(distance);
    }


    @PostMapping("createGrid")
    public Grid createGrid(@RequestBody Grid grid){
        return gridService.createGrid(grid);
    }
}

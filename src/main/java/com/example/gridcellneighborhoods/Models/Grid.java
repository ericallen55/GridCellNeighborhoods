package com.example.gridcellneighborhoods.Models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Grid {
    Integer height;
    Integer width;
    Integer[][] values;

}

package com.github.wangxianzhuo.factorio.calculator.model;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * description: IndustrialMaterial
 * date: 2021/5/11 13:51
 *
 * @author: shangjie
 * @version: 1.0
 */
@NoArgsConstructor
@Data
public class IndustrialMaterial {
    private Recipe recipe;
    private double requireQuantity;
}

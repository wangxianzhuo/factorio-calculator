package com.github.wangxianzhuo.factorio.calculator.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * description: Recipe
 * date: 2021/5/11 13:49
 *
 * @author: shangjie
 * @version: 1.0
 */
@NoArgsConstructor
@Data
public class Recipe {
    private int id;
    private String name;
    private List<IndustrialMaterial> industrialMaterials;
    private double productionTime;
    private double yield;
    private double productionSpeedPerSecond;
    private ProducerType producerType;

    public Recipe(int id, String name, List<IndustrialMaterial> industrialMaterials, double productionTime, double yield, ProducerType producerType) {
        this.id = id;
        this.name = name;
        this.industrialMaterials = industrialMaterials;
        this.productionTime = productionTime;
        this.yield = yield;
        this.producerType = producerType;
        this.productionSpeedPerSecond = yield / productionTime;
    }
}

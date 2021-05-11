package com.github.wangxianzhuo.factorio.calculator.model;

import com.github.wangxianzhuo.factorio.calculator.model.factory.Factory;
import com.github.wangxianzhuo.factorio.calculator.model.material.Material;
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
    private String name;
    private List<Material> materials;
    private double productionTime;
    private double yield;
    private double productionSpeedPerSecond;
    private List<Factory> factoryInstances;

    public Recipe(String name, List<Material> materials, double productionTime, double yield, Factory factory) {
        this.name = name;
        this.materials = materials;
        this.productionTime = productionTime;
        this.yield = yield;
        this.factoryInstances = factory.getFactoryInstances();
        this.productionSpeedPerSecond = yield / productionTime;
    }
}

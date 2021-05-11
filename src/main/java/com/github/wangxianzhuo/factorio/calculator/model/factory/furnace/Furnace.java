package com.github.wangxianzhuo.factorio.calculator.model.factory.furnace;

import com.github.wangxianzhuo.factorio.calculator.model.factory.Factory;

import java.util.ArrayList;
import java.util.List;

/**
 * description: Furnace
 * date: 2021/5/11 16:46
 *
 * @author: shangjie
 * @version: 1.0
 */
public class Furnace extends Factory {
    public Furnace() {
        this(0, 0, 0, 0, 0);
    }

    public Furnace(int pluginNumberMax, double baseEnergyConsumptionKWMax, double baseEnergyConsumptionKWMin, double baseSpeed, double basePollution) {
        super(pluginNumberMax, baseEnergyConsumptionKWMax, baseEnergyConsumptionKWMin, baseSpeed, basePollution);
    }

    public List<Factory> getFactoryInstances() {
        List<Factory> instance = new ArrayList<Factory>();
        instance.add(new ElectricFurnace());
        return instance;
    }
}

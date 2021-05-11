package com.github.wangxianzhuo.factorio.calculator.model.factory.drill;

import com.github.wangxianzhuo.factorio.calculator.model.factory.Factory;

import java.util.ArrayList;
import java.util.List;

/**
 * description: Drill
 * date: 2021/5/11 16:35
 *
 * @author: shangjie
 * @version: 1.0
 */
public class Drill extends Factory {
    public Drill() {
        this(0, 0, 0, 0, 0);
    }

    public Drill(int pluginNumberMax,
                 double baseEnergyConsumptionKWMax,
                 double baseEnergyConsumptionKWMin,
                 double baseSpeed,
                 double basePollution) {
        super(pluginNumberMax,
                baseEnergyConsumptionKWMax,
                baseEnergyConsumptionKWMin,
                baseSpeed, basePollution);
    }

    public List<Factory> getFactoryInstances() {
        List<Factory> instance = new ArrayList<Factory>();
        instance.add(new ElectricMiningDrill());
        return instance;
    }
}

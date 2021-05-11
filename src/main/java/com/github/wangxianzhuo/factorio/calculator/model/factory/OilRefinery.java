package com.github.wangxianzhuo.factorio.calculator.model.factory;

import java.util.ArrayList;
import java.util.List;

/**
 * description: OilRefinery
 * date: 2021/5/11 16:46
 *
 * @author: shangjie
 * @version: 1.0
 */
public class OilRefinery extends Factory {
    public OilRefinery() {
        this(3, 434, 14, 1, 6);
    }

    public OilRefinery(int pluginNumberMax, double baseEnergyConsumptionKWMax, double baseEnergyConsumptionKWMin, double baseSpeed, double basePollution) {
        super(pluginNumberMax, baseEnergyConsumptionKWMax, baseEnergyConsumptionKWMin, baseSpeed, basePollution);
    }

    @Override
    public List<Factory> getFactoryInstances() {
        List<Factory> instance = new ArrayList<Factory>();
        instance.add(new OilRefinery());
        return instance;
    }
}

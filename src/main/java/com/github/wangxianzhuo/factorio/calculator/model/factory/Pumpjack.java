package com.github.wangxianzhuo.factorio.calculator.model.factory;

import java.util.ArrayList;
import java.util.List;

/**
 * description: Pumpjack
 * date: 2021/5/11 16:46
 *
 * @author: shangjie
 * @version: 1.0
 */
public class Pumpjack extends Factory {
    public Pumpjack() {
        this(2, 90, 0, 1, 10);
    }

    public Pumpjack(int pluginNumberMax, double baseEnergyConsumptionKWMax, double baseEnergyConsumptionKWMin, double baseSpeed, double basePollution) {
        super(pluginNumberMax, baseEnergyConsumptionKWMax, baseEnergyConsumptionKWMin, baseSpeed, basePollution);
    }

    @Override
    public List<Factory> getFactoryInstances() {
        List<Factory> instance = new ArrayList<Factory>();
        instance.add(new Pumpjack());
        return instance;
    }
}

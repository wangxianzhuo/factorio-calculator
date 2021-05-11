package com.github.wangxianzhuo.factorio.calculator.model.factory;

import java.util.ArrayList;
import java.util.List;

/**
 * description: ChemicalPlant
 * date: 2021/5/11 16:47
 *
 * @author: shangjie
 * @version: 1.0
 */
public class ChemicalPlant extends Factory {
    public ChemicalPlant() {
        this(3, 217, 7, 1, 4);
    }

    public ChemicalPlant(int pluginNumberMax, double baseEnergyConsumptionKWMax, double baseEnergyConsumptionKWMin, double baseSpeed, double basePollution) {
        super(pluginNumberMax, baseEnergyConsumptionKWMax, baseEnergyConsumptionKWMin, baseSpeed, basePollution);
    }

    @Override
    public List<Factory> getFactoryInstances() {
        List<Factory> instance = new ArrayList<Factory>();
        instance.add(new ChemicalPlant());
        return instance;
    }
}

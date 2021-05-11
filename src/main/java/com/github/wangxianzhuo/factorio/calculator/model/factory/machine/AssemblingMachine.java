package com.github.wangxianzhuo.factorio.calculator.model.factory.machine;

import com.github.wangxianzhuo.factorio.calculator.model.factory.Factory;

import java.util.ArrayList;
import java.util.List;

/**
 * description: AssemblingMachine
 * date: 2021/5/11 16:45
 *
 * @author: shangjie
 * @version: 1.0
 */
public class AssemblingMachine extends Factory {
    public AssemblingMachine() {
        this(0, 0, 0, 0, 0);
    }

    public AssemblingMachine(int pluginNumberMax, double baseEnergyConsumptionKWMax, double baseEnergyConsumptionKWMin, double baseSpeed, double basePollution) {
        super(pluginNumberMax, baseEnergyConsumptionKWMax, baseEnergyConsumptionKWMin, baseSpeed, basePollution);
    }

    public List<Factory> getFactoryInstances() {
        List<Factory> instance = new ArrayList<Factory>();
        instance.add(new AssemblingMachine1());
        instance.add(new AssemblingMachine2());
        instance.add(new AssemblingMachine3());
        return instance;
    }
}

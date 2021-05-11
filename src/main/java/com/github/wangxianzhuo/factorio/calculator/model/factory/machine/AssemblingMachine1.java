package com.github.wangxianzhuo.factorio.calculator.model.factory.machine;

/**
 * description: AssemblingMachine1
 * date: 2021/5/11 16:59
 *
 * @author: shangjie
 * @version: 1.0
 */
public class AssemblingMachine1 extends AssemblingMachine {
    public AssemblingMachine1() {
        this(0, 77.5, 2.5, 0.5, 4);
    }

    public AssemblingMachine1(int pluginNumberMax, double baseEnergyConsumptionKWMax, double baseEnergyConsumptionKWMin, double baseSpeed, double basePollution) {
        super(pluginNumberMax, baseEnergyConsumptionKWMax, baseEnergyConsumptionKWMin, baseSpeed, basePollution);
    }
}

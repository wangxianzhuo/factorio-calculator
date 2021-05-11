package com.github.wangxianzhuo.factorio.calculator.model.factory.machine;

/**
 * description: AssemblingMachine2
 * date: 2021/5/11 16:59
 *
 * @author: shangjie
 * @version: 1.0
 */
public class AssemblingMachine2 extends AssemblingMachine {
    public AssemblingMachine2() {
        this(2, 155, 5, 0.75, 3);
    }

    public AssemblingMachine2(int pluginNumberMax, double baseEnergyConsumptionKWMax, double baseEnergyConsumptionKWMin, double baseSpeed, double basePollution) {
        super(pluginNumberMax, baseEnergyConsumptionKWMax, baseEnergyConsumptionKWMin, baseSpeed, basePollution);
    }
}

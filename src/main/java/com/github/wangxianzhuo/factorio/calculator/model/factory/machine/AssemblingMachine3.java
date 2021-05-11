package com.github.wangxianzhuo.factorio.calculator.model.factory.machine;

/**
 * description: AssemblingMachine3
 * date: 2021/5/11 16:59
 *
 * @author: shangjie
 * @version: 1.0
 */
public class AssemblingMachine3 extends AssemblingMachine {
    public AssemblingMachine3() {
        this(4, 388, 12.5, 1.25, 2);
    }

    public AssemblingMachine3(int pluginNumberMax, double baseEnergyConsumptionKWMax, double baseEnergyConsumptionKWMin, double baseSpeed, double basePollution) {
        super(pluginNumberMax, baseEnergyConsumptionKWMax, baseEnergyConsumptionKWMin, baseSpeed, basePollution);
    }
}

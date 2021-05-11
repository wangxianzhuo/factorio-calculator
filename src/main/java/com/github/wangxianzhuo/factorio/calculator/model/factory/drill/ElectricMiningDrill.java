package com.github.wangxianzhuo.factorio.calculator.model.factory.drill;

/**
 * description: ElectricMiningDrill
 * date: 2021/5/11 16:44
 *
 * @author: shangjie
 * @version: 1.0
 */
public class ElectricMiningDrill extends Drill {
    public ElectricMiningDrill() {
        this(3, 90, 0, 0.5, 10);
    }

    public ElectricMiningDrill(int pluginNumberMax, double baseEnergyConsumptionKWMax, double baseEnergyConsumptionKWMin, double baseSpeed, double basePollution) {
        super(pluginNumberMax, baseEnergyConsumptionKWMax, baseEnergyConsumptionKWMin, baseSpeed, basePollution);
    }
}

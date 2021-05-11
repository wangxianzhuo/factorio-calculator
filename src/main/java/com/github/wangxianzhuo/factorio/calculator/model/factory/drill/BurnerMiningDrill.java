package com.github.wangxianzhuo.factorio.calculator.model.factory.drill;

/**
 * description: BurnerMiningDrill
 * date: 2021/5/11 16:40
 *
 * @author: shangjie
 * @version: 1.0
 */
public class BurnerMiningDrill extends Drill {
    public BurnerMiningDrill() {
        this(0, 150, 0, 0.25, 12);
    }

    public BurnerMiningDrill(int pluginNumberMax, double baseEnergyConsumptionKWMax, double baseEnergyConsumptionKWMin, double baseSpeed, double basePollution) {
        super(pluginNumberMax, baseEnergyConsumptionKWMax, baseEnergyConsumptionKWMin, baseSpeed, basePollution);
    }
}

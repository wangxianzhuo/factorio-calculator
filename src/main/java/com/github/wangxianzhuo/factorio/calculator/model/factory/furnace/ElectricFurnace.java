package com.github.wangxianzhuo.factorio.calculator.model.factory.furnace;

/**
 * description: ElectricFurnace
 * date: 2021/5/11 16:55
 *
 * @author: shangjie
 * @version: 1.0
 */
public class ElectricFurnace extends Furnace {
    public ElectricFurnace() {
        this(2, 186, 6, 2, 1);
    }

    public ElectricFurnace(int pluginNumberMax, double baseEnergyConsumptionKWMax, double baseEnergyConsumptionKWMin, double baseSpeed, double basePollution) {
        super(pluginNumberMax, baseEnergyConsumptionKWMax, baseEnergyConsumptionKWMin, baseSpeed, basePollution);
    }
}

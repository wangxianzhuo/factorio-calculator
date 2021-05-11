package com.github.wangxianzhuo.factorio.calculator.model.factory.furnace;

/**
 * description: SteelFurnace
 * date: 2021/5/11 16:55
 *
 * @author: shangjie
 * @version: 1.0
 */
public class SteelFurnace extends Furnace {
    public SteelFurnace() {
        this(0, 90, 0, 2, 4);
    }

    public SteelFurnace(int pluginNumberMax, double baseEnergyConsumptionKWMax, double baseEnergyConsumptionKWMin, double baseSpeed, double basePollution) {
        super(pluginNumberMax, baseEnergyConsumptionKWMax, baseEnergyConsumptionKWMin, baseSpeed, basePollution);
    }
}

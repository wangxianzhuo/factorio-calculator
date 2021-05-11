package com.github.wangxianzhuo.factorio.calculator.model.factory.furnace;

/**
 * description: StoneFurnace
 * date: 2021/5/11 16:54
 *
 * @author: shangjie
 * @version: 1.0
 */
public class StoneFurnace extends Furnace {
    public StoneFurnace() {
        this(0, 90, 0, 1, 2);
    }

    public StoneFurnace(int pluginNumberMax, double baseEnergyConsumptionKWMax, double baseEnergyConsumptionKWMin, double baseSpeed, double basePollution) {
        super(pluginNumberMax, baseEnergyConsumptionKWMax, baseEnergyConsumptionKWMin, baseSpeed, basePollution);
    }
}

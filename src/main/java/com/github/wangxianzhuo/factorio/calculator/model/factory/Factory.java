package com.github.wangxianzhuo.factorio.calculator.model.factory;

import com.github.wangxianzhuo.factorio.calculator.model.plugin.Plugin;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * description: Factory
 * date: 2021/5/11 14:17
 *
 * @author: shangjie
 * @version: 1.0
 */
@Data
public abstract class Factory {
    private final int pluginNumberMax;
    private List<Plugin> plugins;

    private final double baseEnergyConsumptionKWMax;
    private final double baseEnergyConsumptionKWMin;
    private final double baseSpeed;
    private final double baseYield;
    private final double basePollution;

    private double energyConsumptionAddition;
    private double speedAddition;
    private double yieldAddition;
    private double polluteAddition;

    private double finalEnergyConsumptionKWMax;
    private double finalSpeed;
    private double finalYield;
    private double finalPollution;

    public Factory(int pluginNumberMax,
                   double baseEnergyConsumptionKWMax,
                   double baseEnergyConsumptionKWMin,
                   double baseSpeed,
                   double basePollution) {
        this.baseYield = 1;
        this.energyConsumptionAddition = 1;
        this.speedAddition = 1;
        this.yieldAddition = 1;
        this.polluteAddition = 1;

        this.pluginNumberMax = pluginNumberMax;
        this.plugins = new ArrayList<Plugin>();
        this.baseEnergyConsumptionKWMax = baseEnergyConsumptionKWMax;
        this.baseEnergyConsumptionKWMin = baseEnergyConsumptionKWMin;
        this.finalEnergyConsumptionKWMax = baseEnergyConsumptionKWMax;
        this.baseSpeed = baseSpeed;
        this.finalSpeed = baseSpeed;
        this.finalYield = baseYield;
        this.basePollution = basePollution;
        this.finalPollution = basePollution;
    }

    public void calculatePluginAddition() {
        for (Plugin plugin : this.plugins) {
            this.energyConsumptionAddition += plugin.getEnergyConsumptionAddition();
            this.speedAddition += plugin.getSpeedAddition();
            this.yieldAddition += plugin.getYieldAddition();
            this.polluteAddition += plugin.getPolluteAddition();
        }
    }

    public void calculateFinalPerformance() {
        this.finalEnergyConsumptionKWMax = this.baseEnergyConsumptionKWMax * this.energyConsumptionAddition;
        this.finalSpeed = this.baseSpeed * this.speedAddition;
        this.finalYield = this.baseYield * this.yieldAddition;
        this.finalPollution = this.basePollution * this.polluteAddition;
    }

    public abstract List<Factory> getFactoryInstances();

    enum FactoryType {
        Drill, AssemblingMachine, Pumpjack, Furnace, OilRefinery, ChemicalPlant,
    }
}

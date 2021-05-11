package com.github.wangxianzhuo.factorio.calculator.model;

import lombok.Data;

import java.util.List;

/**
 * description: Factory
 * date: 2021/5/11 14:17
 *
 * @author: shangjie
 * @version: 1.0
 */
@Data
public class Factory {
    private final int id;
    private final FactoryType type;
    private final int pluginNumberMax;
    private List<Plugin> plugins;

    private final double baseEnergyConsumptionKW;
    private final double baseSpeed;
    private final double baseYield = 1;
    private final double basePollution;

    private double finalEnergyConsumptionKW;
    private double finalSpeed;
    private double finalYield;
    private double finalPollution;

    public Factory(int id, FactoryType type, int pluginNumberMax, List<Plugin> plugins, double baseEnergyConsumptionKW, double finalEnergyConsumptionKW, double baseSpeed, double finalSpeed, double finalYield, double basePollution, double finalPollution) {
        this.id = id;
        this.type = type;
        this.pluginNumberMax = pluginNumberMax;
        this.plugins = plugins;
        this.baseEnergyConsumptionKW = baseEnergyConsumptionKW;
        this.finalEnergyConsumptionKW = finalEnergyConsumptionKW;
        this.baseSpeed = baseSpeed;
        this.finalSpeed = finalSpeed;
        this.finalYield = finalYield;
        this.basePollution = basePollution;
        this.finalPollution = finalPollution;
    }
}

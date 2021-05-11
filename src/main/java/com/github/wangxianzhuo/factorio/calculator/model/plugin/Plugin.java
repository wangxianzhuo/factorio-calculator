package com.github.wangxianzhuo.factorio.calculator.model.plugin;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * description: Plugin
 * date: 2021/5/11 14:27
 *
 * @author: shangjie
 * @version: 1.0
 */
@NoArgsConstructor
@Data
public class Plugin {
    private int id;
    private PluginType type;
    private double energyConsumptionAddition;
    private double speedAddition;
    private double yieldAddition;
    private double polluteAddition;

    public Plugin(int id, PluginType type, double energyConsumptionAddition, double speedAddition, double yieldAddition, double polluteAddition) {
        this.id = id;
        this.type = type;
        this.energyConsumptionAddition = energyConsumptionAddition;
        this.speedAddition = speedAddition;
        this.yieldAddition = yieldAddition;
        this.polluteAddition = polluteAddition;
    }

    public Plugin(int id, PluginType type) {
        this.id = id;
        this.type = type;
        this.energyConsumptionAddition = 0;
        this.speedAddition = 0;
        this.yieldAddition = 0;
        this.polluteAddition = 0;
    }
}

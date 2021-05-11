package com.github.wangxianzhuo.factorio.calculator;

import com.github.wangxianzhuo.factorio.calculator.model.Recipe;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * description: Produce
 * date: 2021/5/11 14:06
 *
 * @author: shangjie
 * @version: 1.0
 */
@Data
public class Produce {
    private final Recipe produceRecipe;
    private final double produceUnitYield;
    private List<ProductionPlan> productionPlans;
    private List<BaseMaterialSupplyPlan> baseMaterialSupplyPlans;

    private double totalEnergyConsumptionKW;
    private double totalPollution;

    public Produce(Recipe produceRecipe, double produceUnitYield) {
        this.produceRecipe = produceRecipe;
        this.produceUnitYield = produceUnitYield;
    }
}

package com.github.wangxianzhuo.factorio.calculator;

import com.github.wangxianzhuo.factorio.calculator.model.Recipe;
import com.github.wangxianzhuo.factorio.calculator.model.material.IndustrialMaterial;
import com.github.wangxianzhuo.factorio.calculator.model.material.Material;
import lombok.Data;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
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
    private final Recipe productionRecipe;
    private final double productionUnitYield;
    private List<ProductionPlan> productionPlans = new ArrayList<ProductionPlan>();
    private List<RawMaterialSupplyPlan> rawMaterialSupplyPlans = new ArrayList<RawMaterialSupplyPlan>();

    private double totalEnergyConsumptionKW;
    private double totalPollution;

    public Produce(Recipe productionRecipe, double productionUnitYield) {
        this.productionRecipe = productionRecipe;
        this.productionUnitYield = productionUnitYield;
    }

    public void produce() {
        parseProductionRecipeRequirement();
        parseProductionPlans();
        parseRawMaterialSupplyPlans();
    }

    private void parseProductionRecipeRequirement() {
        parseProductionRecipeRequirement(productionRecipe.getMaterials());
    }

    private void parseProductionRecipeRequirement(@NotNull List<Material> materials) {
        for (Material material : materials) {
            if (material.isRawMaterial()) {
                createRawMaterialSupplyPlan(material);
            } else {
                createProductionPlan(material);
                parseProductionRecipeRequirement(((IndustrialMaterial) material).getRecipe().getMaterials());
            }
        }
    }

    // TODO: 2021/5/11
    private void parseProductionPlans() {

    }

    // TODO: 2021/5/11
    private void parseRawMaterialSupplyPlans() {

    }

    // TODO: 2021/5/11
    private void createRawMaterialSupplyPlan(Material rawMaterial) {
        this.rawMaterialSupplyPlans.add(new RawMaterialSupplyPlan());
    }

    // TODO: 2021/5/11
    private void createProductionPlan(Material material) {
        this.productionPlans.add(new ProductionPlan());
    }

    // TODO: 2021/5/11
    public void printPlan() {

    }
}

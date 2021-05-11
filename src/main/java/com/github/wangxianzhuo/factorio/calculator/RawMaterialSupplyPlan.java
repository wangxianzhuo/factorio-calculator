package com.github.wangxianzhuo.factorio.calculator;

import com.github.wangxianzhuo.factorio.calculator.model.material.RawMaterial;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * description: RawMaterialSupplyPlan
 * date: 2021/5/11 14:57
 *
 * @author: shangjie
 * @version: 1.0
 */
@NoArgsConstructor
@Data
public class RawMaterialSupplyPlan extends BasePlan {
    private RawMaterial rawMaterial;
}

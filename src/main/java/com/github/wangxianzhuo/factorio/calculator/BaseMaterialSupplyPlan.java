package com.github.wangxianzhuo.factorio.calculator;

import com.github.wangxianzhuo.factorio.calculator.model.BaseMaterial;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * description: BaseMaterialSupplyPlan
 * date: 2021/5/11 14:57
 *
 * @author: shangjie
 * @version: 1.0
 */
@NoArgsConstructor
@Data
public class BaseMaterialSupplyPlan extends BasePlan {
    private BaseMaterial baseMaterial;
}

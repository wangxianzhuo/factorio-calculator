package com.github.wangxianzhuo.factorio.calculator;

import com.github.wangxianzhuo.factorio.calculator.model.Recipe;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * description: ProductionPlan
 * date: 2021/5/11 14:41
 *
 * @author: shangjie
 * @version: 1.0
 */
@NoArgsConstructor
@Data
public class ProductionPlan extends BasePlan {
    private Recipe recipe;
}

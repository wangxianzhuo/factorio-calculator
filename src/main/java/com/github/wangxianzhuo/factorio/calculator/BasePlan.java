package com.github.wangxianzhuo.factorio.calculator;

import com.github.wangxianzhuo.factorio.calculator.model.Factory;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * description: BasePlan
 * date: 2021/5/11 15:02
 *
 * @author: shangjie
 * @version: 1.0
 */
@NoArgsConstructor
@Data
public class BasePlan {
    private Factory factory;
    private int factoryNumber;
    private double energyConsumptionKW;
    private double usedFactoryCapacity;
    private double pollution;
}

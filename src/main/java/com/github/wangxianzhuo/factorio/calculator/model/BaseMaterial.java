package com.github.wangxianzhuo.factorio.calculator.model;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * description: BaseMaterial
 * date: 2021/5/11 14:46
 *
 * @author: shangjie
 * @version: 1.0
 */
@NoArgsConstructor
@Data
public class BaseMaterial {
    private BaseMaterialType type;
    private double supplyQuantityPerSecond;
}

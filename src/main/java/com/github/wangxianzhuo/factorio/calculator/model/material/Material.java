package com.github.wangxianzhuo.factorio.calculator.model.material;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * description: Material
 * date: 2021/5/11 16:14
 *
 * @author: shangjie
 * @version: 1.0
 */
@NoArgsConstructor
@Data
public abstract class Material {
    private double requireNumber;
    private double requireTime;
    private double requireNumberPerSecond;

    public Material(double requireNumber, double requireTime) {
        this.requireNumber = requireNumber;
        this.requireTime = requireTime;
        this.requireNumberPerSecond = requireNumber / requireTime;
    }

    public abstract boolean isRawMaterial();
}

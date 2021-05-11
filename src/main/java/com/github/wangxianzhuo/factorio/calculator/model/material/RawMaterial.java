package com.github.wangxianzhuo.factorio.calculator.model.material;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * description: RawMaterial
 * date: 2021/5/11 14:46
 *
 * @author: shangjie
 * @version: 1.0
 */
@NoArgsConstructor
@Data
public class RawMaterial extends Material {
    private RawMaterialType type;

    public boolean isRawMaterial() {
        return true;
    }

    enum RawMaterialType {
    }
}

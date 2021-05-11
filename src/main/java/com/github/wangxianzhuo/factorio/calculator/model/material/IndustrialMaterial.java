package com.github.wangxianzhuo.factorio.calculator.model.material;

import com.github.wangxianzhuo.factorio.calculator.model.Recipe;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * description: IndustrialMaterial
 * date: 2021/5/11 13:51
 *
 * @author: shangjie
 * @version: 1.0
 */
@NoArgsConstructor
@Data
public class IndustrialMaterial extends Material {
    private Recipe recipe;

    public boolean isRawMaterial() {
        return false;
    }
}

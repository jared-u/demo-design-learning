package com.jared.design;

import com.jared.design.ceilling.LevelOneCeiling;
import com.jared.design.ceilling.LevelTwoCeiling;
import com.jared.design.coat.DuluxCoat;
import com.jared.design.coat.LiBangCoat;
import com.jared.design.floor.ShengXiangFloor;
import com.jared.design.tile.DongPengTile;
import com.jared.design.tile.MarcoPoloTile;

/**
 * @author chenjialing
 * @time 2021/6/18 18:20
 */
public class Builder {
    public IMenu levelOne(Double area) {
        return new DecorationPackageMenu(area, "豪华欧式")
                .appendCeiling(new LevelTwoCeiling())    // 吊顶，二级顶
                .appendCoat(new DuluxCoat())             // 涂料，多乐士
                .appendFloor(new ShengXiangFloor());     // 地板，圣象
    }

    public IMenu levelTwo(Double area){
        return new DecorationPackageMenu(area, "轻奢田园")
                .appendCeiling(new LevelTwoCeiling())   // 吊顶，二级顶
                .appendCoat(new LiBangCoat())           // 涂料，立邦
                .appendTile(new MarcoPoloTile());       // 地砖，马可波罗
    }

    public IMenu levelThree(Double area){
        return new DecorationPackageMenu(area, "现代简约")
                .appendCeiling(new LevelOneCeiling())   // 吊顶，二级顶
                .appendCoat(new LiBangCoat())           // 涂料，立邦
                .appendTile(new DongPengTile());        // 地砖，东鹏
    }
}

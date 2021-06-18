package com.jared.design;

/**
 * @author chenjialing
 * @time 2021/6/18 18:20
 */
public interface IMenu {
    IMenu appendCeiling(Matter matter); // 吊顶

    IMenu appendCoat(Matter matter);    // 涂料

    IMenu appendFloor(Matter matter);   // 地板

    IMenu appendTile(Matter matter);    // 地砖

    String getDetail();                 // 明细
}

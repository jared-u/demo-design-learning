package com.jared.design;

import org.junit.Test;

import java.math.BigDecimal;

/**
 * @author chenjialing
 * @time 2021/6/18 18:14
 */
public class ApiTest {
    @Test
    public void test_DecorationPackageController(){
        DecorationPackageController decoration = new DecorationPackageController();
        // 豪华欧式
        System.out.println(decoration.getMatterList(new BigDecimal("132.52"),1));
        // 轻奢田园
        System.out.println(decoration.getMatterList(new BigDecimal("98.25"),2));
        // 现代简约
        System.out.println(decoration.getMatterList(new BigDecimal("85.43"),3));
    }
}

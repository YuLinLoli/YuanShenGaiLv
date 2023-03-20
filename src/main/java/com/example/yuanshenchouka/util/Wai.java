package com.example.yuanshenchouka.util;

import java.util.Random;

public class Wai {
    private static boolean waiLe = true;

    /**
     * 判断出金歪没歪
     * @param cc 上一发是否是大保底
     * @return 歪与没歪
     */
    public static boolean wai(Boolean cc){
        if (cc != null && cc){
            waiLe = true;
        }
        if (waiLe){
            waiLe = false;
            return true;
        }
        int a = new Random().nextInt(99);

//        System.out.println("抽卡随机数:" + a);
        boolean b = a < 50;
        if(!b){
            waiLe = true;
        }
        return b;
    }
}

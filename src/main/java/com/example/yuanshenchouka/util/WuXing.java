package com.example.yuanshenchouka.util;

import java.util.Random;

public class WuXing {
    private static int jiLv = 6;

    /**
     * 判断是否出5星
     * @param chouKaShu 距离上一个五星抽了几抽
     * @return 是否出金
     */
    public static boolean wuXing(int chouKaShu){

        int a = new Random().nextInt(999);
        //抽卡数等于90必出
        if (chouKaShu == 90){
            jiLv = 60;
            return true;
        }
        //抽卡数大于74每抽增加几率
        if (chouKaShu >= 74){
            jiLv = jiLv + 60;
            boolean b = a < jiLv;
            if (b){
                jiLv = 6;
            }
            return b;
        }
        //抽卡数小于74抽正常判断
        boolean c = a < 6;
        if (c){
            jiLv = 6;
        }

        return c;
    }
}

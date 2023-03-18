package com.example.yuanshenchouka;

import com.example.yuanshenchouka.util.Wai;
import com.example.yuanshenchouka.util.WuXing;

import java.math.BigDecimal;
import java.util.Scanner;

public class YuanShenMain {
    private static int ChuJinZhun = 0;
    private static int LingHuaShu = 0;
    private static int ChouKaShu = 0;
    private static int WaiLe = 0;
    private static double JieGuo3 = 0;
    private static double JieGuo4 = 0;
    private static double JieGuo5 = 0;
    private static double JieGuo6 = 0;
    private static double JieGuo7 = 0;
    private static double JieGuo8 = 0;
    private static double JieGuo9 = 0;
    private static double JieGuo10 = 0;
    private static double JieGuo11 = 0;
    private static double JieGuo12 = 0;
    private static double JieGuo13 = 0;
    private static double JieGuo14 = 0;
    private static double JieGuo15 = 0;


    public static void main(String[] args) {
        //运算次数输入
        double yunSuanCiShu = 10000000;
        //抽卡次数输入
        int chouKaCiShu = 380;
        //开始是否是大保底
        boolean bd = false;
        String si = "不是大保底";
        if(bd) {
            si = "是大保底";
        }

        for (int j = 1; j < yunSuanCiShu + 1; j++) {
            for (int i = 1; i < chouKaCiShu + 1; i++) {
                //抽卡次数添加
                ChouKaShu++;
//            System.out.println("第" + i + "抽");
//            System.out.println("从上个金开始计算：" + ChouKaShu);
                //判断抽卡是否为五星
                boolean wuXing = WuXing.wuXing(ChouKaShu);
                //判断抽卡角色歪不歪
                if (wuXing){
                    ChuJinZhun++;
                    ChouKaShu = 0;
                    if (Wai.wai(bd)){
                        LingHuaShu++;
//                    System.out.println("没歪！+++++++++++++++++++++++++++++++++");
                    }else {
                        WaiLe++;
//                    System.out.println("歪了！---------------------------------");
                    }
                }
//            else {
//                System.out.println("没出五星请再接再厉！");
//            }

//            int s = new Scanner(System.in).nextInt();
            }

            switch (LingHuaShu){
                case 3 -> JieGuo3++;
                case 4 -> JieGuo4++;
                case 5 -> JieGuo5++;
                case 6 -> JieGuo6++;
                case 7 -> JieGuo7++;
                case 8 -> JieGuo8++;
                case 9 -> JieGuo9++;
                case 10 -> JieGuo10++;
                case 11 -> JieGuo11++;
                case 12 -> JieGuo12++;
                case 13 -> JieGuo13++;
                case 14 -> JieGuo14++;
                case 15 -> JieGuo15++;
            }
            ChuJinZhun = 0;
            WaiLe = 0;
            LingHuaShu = 0;
            Wai.wai(true);
            System.out.println("运算执行完毕"+ j + "次");
        }
        double y = yunSuanCiShu / 100;
        double i3 = JieGuo3 / y;
        double i4 = JieGuo4 / y;
        double i5 = JieGuo5 / y;
        double i6 = JieGuo6 / y;
        double i7 = JieGuo7 / y;
        double i8 = JieGuo8 / y;
        double i9 = JieGuo9 / y;
        double i10 = JieGuo10 / y;
        double i11 = JieGuo11 / y;
        double i12 = JieGuo12 / y;
        double i13 = JieGuo13 / y;
        double i14 = JieGuo14 / y;
        double i15 = JieGuo15 / y;
        System.out.println("您选择了" + chouKaCiShu + "抽来抽绫华池子，开头第一发金" + si + "，结果如下：");
        System.out.println("最终抽中3只绫华的占比为：" + i3);
        System.out.println("最终抽中4只绫华的占比为：" + i4);
        System.out.println("最终抽中5只绫华的占比为：" + i5);
        System.out.println("最终抽中6只绫华的占比为：" + i6);
        System.out.println("最终抽中7只绫华的占比为：" + i7);
        System.out.println("最终抽中8只绫华的占比为：" + i8);
        System.out.println("最终抽中9只绫华的占比为：" + i9);
        System.out.println("最终抽中10只绫华的占比为：" + i10);
        System.out.println("最终抽中11只绫华的占比为：" + i11);
        System.out.println("最终抽中12只绫华的占比为：" + i12);
        System.out.println("最终抽中13只绫华的占比为：" + i13);
        System.out.println("最终抽中14只绫华的占比为：" + i14);
        System.out.println("最终抽中15只绫华的占比为：" + i15);










    }
}
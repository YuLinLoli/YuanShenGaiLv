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
    private static double JieGuo0 = 0;
    private static double JieGuo1 = 0;
    private static double JieGuo2 = 0;
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
    private static int LingShi = 0;
    private static int ShiEr = 0;
    private static int ErSan = 0;
    private static int SanSi = 0;
    private static int SiWu = 0;
    private static int WuLiu = 0;
    private static int LiuQi = 0;
    private static int QiBa = 0;
    private static int BaJiu = 0;

    public static void main(String[] args) {
        //运算次数输入
        double yunSuanCiShu = 1000000;
        //抽卡次数输入
        int chouKaCiShu = 30;
        //开始是否是大保底
        boolean bd = false;
        //垫了多少抽
        ChouKaShu = 0;
        //是否9折抽卡
        boolean jiuZhe = true;





        if (ChouKaShu >= 90){
            ChouKaShu = 0;
        }
        System.out.println("请等待结果：");
        System.out.println("抽卡数为：" + chouKaCiShu);
        String si = "不是大保底";
        if(bd) {
            si = "是大保底";
            //让上一发是大保底
            Wai.wai(bd);
        }
        if (jiuZhe){
            chouKaCiShu = (int) (chouKaCiShu + (chouKaCiShu - chouKaCiShu * 0.9));
            System.out.println("实际抽卡数为：（勾选九折抽卡后）" + chouKaCiShu);
        }
        System.out.println("已垫次数为：" + ChouKaShu);
        for (int j = 1; j < (int)yunSuanCiShu + 1; j++) {
            for (int i = 1; i < chouKaCiShu + 1; i++) {
                //抽卡次数添加
                ChouKaShu++;
//            System.out.println("第" + i + "抽");
//            System.out.println("从上个金开始计算：" + ChouKaShu);
                //判断抽卡是否为五星
                boolean wuXing = WuXing.wuXing(ChouKaShu);
                //判断抽卡角色歪不歪
                if (wuXing){

                    if (ChouKaShu <= 10){
                        LingShi++;
                    }else if (ChouKaShu <= 20 ){
                        ShiEr++;
                    }else if (ChouKaShu <= 30 ){
                        ErSan++;
                    }else if (ChouKaShu <= 40 ){
                        SanSi++;
                    } else if (ChouKaShu <= 50) {
                        SiWu++;
                    } else if (ChouKaShu <= 60) {
                        WuLiu++;
                    } else if (ChouKaShu <= 70) {
                        LiuQi++;
                    } else if (ChouKaShu <= 80) {
                        QiBa++;
                    }else {
                        BaJiu++;
                    }


                    ChuJinZhun++;
                    ChouKaShu = 0;
                    if (Wai.wai(null)){
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
                case 0 -> JieGuo0++;
                case 1 -> JieGuo1++;
                case 2 -> JieGuo2++;
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
            WaiLe = 0;
            LingHuaShu = 0;
//            System.out.println("运算执行完毕"+ j + "次");
        }
        int y = (int)(JieGuo0+JieGuo1+JieGuo2+JieGuo3+JieGuo4+JieGuo5+JieGuo6+JieGuo7+JieGuo8+JieGuo9+JieGuo10+JieGuo11+JieGuo12+JieGuo13+JieGuo14+JieGuo15);
        float i0 = (float) (JieGuo0 / y * 100);
        float i1 = (float) (JieGuo1 / y * 100);
        float i2 = (float) (JieGuo2 / y * 100);
        float i3 = (float) (JieGuo3 / y * 100);
        float i4 = (float) (JieGuo4 / y * 100);
        float i5 = (float) (JieGuo5 / y * 100);
        float i6 = (float) (JieGuo6 / y * 100);
        float i7 = (float) (JieGuo7 / y * 100);
        float i8 = (float) (JieGuo8 / y * 100);
        float i9 = (float) (JieGuo9 / y * 100);
        float i10 = (float) (JieGuo10 / y * 100);
        float i11 = (float) (JieGuo11 / y * 100);
        float i12 = (float) (JieGuo12 / y * 100);
        float i13 = (float) (JieGuo13 / y * 100);
        float i14 = (float) (JieGuo14 / y * 100);
        float i15 = (float) (JieGuo15 / y * 100);
        int z = ChuJinZhun;
        System.out.println("您选择了" + chouKaCiShu + "抽来抽绫华池子" + (int)yunSuanCiShu + "次，开头第一发金" + si + "，结果如下：");
        System.out.println("出金集中在多少发：");
        System.out.println("0-10只出金的概率是：" + (float)LingShi/z * 100 + "%");
        System.out.println("10-20只出金的概率是：" + (float)ShiEr/z * 100 + "%");
        System.out.println("20-30只出金的概率是：" + (float)ErSan/z * 100 + "%");
        System.out.println("30-40只出金的概率是：" + (float)SanSi/z * 100 + "%");
        System.out.println("40-50只出金的概率是：" + (float)SiWu/z * 100 + "%");
        System.out.println("50-60只出金的概率是：" + (float)WuLiu/z * 100 + "%");
        System.out.println("60-70只出金的概率是：" + (float)LiuQi/z * 100 + "%");
        System.out.println("70-80只出金的概率是：" + (float)QiBa/z * 100 + "%");
        System.out.println("80-90只出金的概率是：" + (float)BaJiu/z * 100 + "%");
        System.out.println("抽中绫华命座的占比为：");
        System.out.println("最终抽中0只绫华的占比为：" + i0 + "%");
        System.out.println("最终抽中1只绫华的占比为：" + i1 + "%");
        System.out.println("最终抽中2只绫华的占比为：" + i2 + "%");
        System.out.println("最终抽中3只绫华的占比为：" + i3 + "%");
        System.out.println("最终抽中4只绫华的占比为：" + i4 + "%");
        System.out.println("最终抽中5只绫华的占比为：" + i5 + "%");
        System.out.println("最终抽中6只绫华的占比为：" + i6 + "%");
        System.out.println("最终抽中7只绫华的占比为：" + i7 + "%");
        System.out.println("最终抽中8只绫华的占比为：" + i8 + "%");
        System.out.println("最终抽中9只绫华的占比为：" + i9 + "%");
        System.out.println("最终抽中10只绫华的占比为：" + i10 + "%");
        System.out.println("最终抽中11只绫华的占比为：" + i11 + "%");
        System.out.println("最终抽中12只绫华的占比为：" + i12 + "%");
        System.out.println("最终抽中13只绫华的占比为：" + i13 + "%");
        System.out.println("最终抽中14只绫华的占比为：" + i14 + "%");
        System.out.println("最终抽中15只绫华的占比为：" + i15 + "%");










    }
}
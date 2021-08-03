package com.itheima.test;

public class Test5 {
    /*
      王者荣耀中吕布的机制如下：
         1. 如果当前是武器附魔状态普攻为真实伤害，即无视敌方护甲物抗。此时对敌方英雄造成的伤害即为吕布的物攻伤害。
         2. 如果当前是武器没有附魔状态普攻为普通伤害，需要使用吕布的物攻减去敌方英雄的物抗。
            要求定义一个方法damage,来计算吕布当前能对敌方英雄造成的伤害。其中：
             是否真实伤害=isRealHarm
             吕布物攻=pDamage
             敌方物抗=pResistance
     */
    public static void main(String[] args) {

        int pDamage = 1000;
        int pResistance = 500;
        boolean isRealHarm = true;
        int damand = damand(isRealHarm, pDamage, pResistance);
        System.out.println("吕布对敌人造成的伤害为:" + damand);

    }

    public static int damand(boolean isRealHarm,int pDamage,int pResistance){
        int realHarm;
        if(isRealHarm){
            realHarm = pDamage;
        }else {
            realHarm = pDamage - pResistance;
        }
        return realHarm;

    }
}

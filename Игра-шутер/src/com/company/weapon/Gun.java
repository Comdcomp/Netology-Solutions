package com.company.weapon;

public class Gun extends Weapon {

    @Override
    public void shot() {
        System.out.println("Пистолет говорит: Бах-бах!");
    }
}
package com.company;

import com.company.weapon.AssaultRifle;
import com.company.weapon.Gun;
import com.company.weapon.Weapon;

public class Player {
    // Указываем тип данных Weapon, который будет храниться в "слотах игрока"
    private Weapon[] weaponSlots;

    public Player() {
        // Снаряжаем нашего игрока
        weaponSlots = new Weapon[] {
                // TODO заполнить слоты оружием
                // new BigGun(),
                // new WaterPistol()
                new Gun(),
                new AssaultRifle()
        };
    }

    public int getSlotsCount() {
        // length - позволяет узнать, сколько всего слотов с оружием у игрока
        return weaponSlots.length;
    }

    public void shotWithWeapon(int slot) {
        // TODO проверить на выход за границы
        // выбросить IllegalArgumentException,
        // если значение slot некорректно

        int size = getSlotsCount();
        if (slot >= size || slot < -1) {
            throw new IllegalArgumentException("Нет такого оружия");
        }

        // Получаем оружие из выбранного слота
        Weapon weapon = weaponSlots[slot];
        // Огонь!
        weapon.shot();
    }
}

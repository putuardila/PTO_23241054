package com.tutorial;

// superclass
public class Main {
    public static void main(String[] args) {
        // membuat objek dari superclass
        Hero hero1 = new Hero();
        hero1.nama = "Sunggokhong";
        System.out.println("Hero dari SuperClass");
        hero1.cetak();

        // membuat objek dari subclass
        HeroTank hero2 = new HeroTank();
        hero2.nama = "Super Dede";
        hero2.defencepower = 200;
        hero2.cetak();
    }
}

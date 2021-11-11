package com.company;

public class Main {

    public static void main(String[] args) {
        com.company.Boss munarbek = new com.company.Boss();
        ((com.company.Boss) munarbek).setHealth(1000);
        ((com.company.Boss) munarbek).setDamage(90);
        munarbek.setSchield("Барьер");
        System.out.println("munarbek " + ((com.company.Boss) munarbek).getHealth() + "XP" + ((com.company.Boss) munarbek).getDamage() + " DD " + munarbek.getSchield() + " PP");

        Hero[] batman = createHeroes();

        for (int i = 0; i < batman.length; i++) {

            System.out.println(batman[i].getName() + " " + batman[i].getDamage() + " " + batman[i].getHealth() + " " + batman[i].getPower());


        }
    }



    public static Hero[] createHeroes() {

        Hero superman = new Hero(300, 25, "electric trident", "superman");
        Hero hulk = new Hero(250, 30, "superpower", "hulk");
        Hero prinz_v_belom_kone = new Hero(350, 35, "invulnerability" ,",prinz_v_belom_kone");
        Hero[] batman = {superman, hulk, prinz_v_belom_kone};

        return batman;
    }
}

package com.example.recycleview;

import java.util.ArrayList;

public class HeroesData {
    private static String[] heroNames = {
            "Pemasukkan",
            "Pengeluaran",
            "Total"
    };

    private static String[] heroDetails = {
            "Pemasukkan keuangan dari alesandro adalah berjumlah Rp.150.000.000",
            "Pengeluaran keuangan dari alesandro adalah berjumlah Rp.120.000.000",
            "Total Pemasukan dan Pengeluaran keuangan alesandro adalah berjumlah Rp.30.000.000"

    };

    private static int[] heroesImages = {
            R.drawable.pemasukkan,
            R.drawable.pengeluaran,
            R.drawable.total
    };

    static ArrayList<Hero> getListData() {
        ArrayList<Hero> list = new ArrayList<>();
        for (int position = 0; position < heroNames.length; position++) {
            Hero hero = new Hero();
            hero.setName(heroNames[position]);
            hero.setDetail(heroDetails[position]);
            hero.setPhoto(heroesImages[position]);
            list.add(hero);
        }
        return list;
    }
}
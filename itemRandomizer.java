package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int item;
        item = Integer.parseInt(reader.readLine());

        String [] commonItems = {"Кусок ткани", "Деревянная палка", "2 медные монеты", "1 медная монета", "3 медные монеты", "яблоко", "Набор игральных карт", "1 стрела", "2 стрелы"};
        String [] rareItems = {"Кинжал", "Ключ", "7 медных монет", "1 серебрянная монета", "12 медных монет", "Рубин", "Веревка", "1 отравленная стрела", "Факел"};
        String [] epicItems = {"Магический меч", "Золотое кольцо", "4 серебрянные монеты", "1 золотая монета", "Томаз", "Золотое ожерелье", "Кожанные наручи", "Необычный сверток", "Карта"};

        int commonLength = commonItems.length;
        int rareLength = rareItems.length;
        int epicLength = epicItems.length;

        int rndm1 = (int) (Math.random() * commonLength);
        int rndm2 = (int) (Math.random() * rareLength);
        int rndm3 = (int) (Math.random() * epicLength);

        String common = commonItems[rndm1];
        String rare = rareItems[rndm2];
        String epic = epicItems[rndm3];

        if (item == 1)
            System.out.println(common);
        else if (item == 2)
            System.out.println(rare);
        else if (item == 3)
            System.out.println(epic);
    }
}

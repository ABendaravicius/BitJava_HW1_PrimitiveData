package com.arnas.hw1;

public class PrimitiveData {
    public static void main(String[] args) {
        // Maksimali neigiama ir teigiama (int) tipo kintamojo reikšmė yra -2,147,483,648 ir 2,147,483,647 imtinai.
        int maxInt = 2147483647;
        int minInt = -2147483648;
        System.out.println(maxInt);
        System.out.println(minInt);
        System.out.println("---- Klausimai ----");
        System.out.println("a. Ar galėtume sutalpinti visų žemėje gyvenančių žmonių skaičių į int?");
        String ats1 = "Ne";
        System.out.println("Atsakymas: " + ats1);
        System.out.println("-----------------");
        System.out.println("b. Ar galėtume saugoti lietuvišką asmens kodą int tipo kintamąjame? Jei ne, kokį reiktų pasirinkti?");
        String ats2 = "Taip";
        System.out.println("Atsakymas: " + ats2);
        System.out.println("-----------------");
        int overMax = maxInt + 1;
        System.out.println(overMax);
        System.out.println("Gaunamas neigiamas skaičius, nes įvyksta 'memory overflow', kuomet kintamajam bandoma suteikti didesnė reikšmė nei jo maksimali galima reikšmė");
    }
}
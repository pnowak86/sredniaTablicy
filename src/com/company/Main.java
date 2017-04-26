package com.company;

public class Main {


    public static int dlugosc = 100;
    public static int[] tablica = new int[dlugosc];
    public static double wynik= 0.0;
    public static int i = 0;

    public static void main(String[] args) {

        System.out.println("Zawartość tablicy:");
        for (int i = 0; i < dlugosc - 1; i++) {
            tablica[i] = i + 1;

            System.out.println(tablica[i]);
        }
        System.out.println("");
        obliczSrednia();
        //System.out.println(wynik);



    }
   public static void obliczSrednia() {
        double wynik =0;
        for (int i = 0; i < dlugosc; i++) {
         wynik = wynik + tablica[i];

        }
       System.out.println("Średnia arytmetyczna tablicy z setką indeksów wynosi: " + wynik/tablica.length);

   }

}

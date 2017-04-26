package com.company;

public class Main {


    public static int dlugosc = 100;
    //tworzymy tablice z 100 indeksow
    public static int[] tablica = new int[dlugosc];
   


    public static void main(String[] args) {


        System.out.println("Zawartość tablicy:");
        for (int i = 0; i < dlugosc - 1; i++) {
            //zapelnialniamy wartosciami od 1 do 99
            tablica[i] = i + 1;
            //drukujemy wartosci z tablicy
            System.out.println(tablica[i]);
        }
        System.out.println("");
        obliczSrednia();



    }

    //tworzymy metode obliczajaca srednia
    public static void obliczSrednia() {
        double wynik = 0;
        for (int i = 0; i < dlugosc; i++) {
            wynik = wynik + tablica[i];

        }
        System.out.println("Średnia arytmetyczna tablicy z setką indeksów wynosi: " + wynik / tablica.length);

    }

}

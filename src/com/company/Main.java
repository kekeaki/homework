package com.company;
import java.lang.*;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // write your code here

        int ochered = 1;
        int[][] tablica = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        int result = 0;
        Scanner s = new Scanner(System.in);
        int ax, ay;
        int chisloHodov=0;


        while (result == 0) {
            do {
                //вывод таблицы
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print(tablica[i][j]);
                    }
                    System.out.println();
                }
                System.out.println("Игрок " +ochered+" Введите первую координату");
                ax = s.nextInt();
                System.out.println("Введите вторую координату");
                ay = s.nextInt();
            } while ((ax > 2) || (ax < 0) || (ay > 2) || (ay < 0) || (tablica[ax][ay] > 0));
            tablica[ax][ay] = ochered;

            chisloHodov++;
            if(chisloHodov==9) {result=3;}

            if (ochered == 1) {
                ochered = 2;
            } else {
                ochered = 1;
            }
            for (int i = 0; i < 3; i++) {
                if (tablica[i][0] == 1 && tablica[i][1] == 1 && tablica[i][2] == 1) {
                    result = 1;
                }
                if (tablica[i][0] == 2 && tablica[i][1] == 2 && tablica[i][2] == 2) {
                    result = 2;
                }

            }
            for (int i = 0; i < 3; i++) {
                if (tablica[0][i] == 1 && tablica[1][i] == 1 && tablica[2][i] == 1) {
                    result = 1;
                }
                if (tablica[0][i] == 2 && tablica[1][i] == 2 && tablica[2][i] == 2) {
                    result = 2;
                }

            }
            if ((tablica[0][0] == 1 && tablica[1][1] == 1 && tablica[2][2] == 1) || (tablica[2][0] == 1 && tablica[1][1] == 1 && tablica[0][2] == 1)) {
                result = 1;
            }
            if (tablica[0][0] == 2 && tablica[1][1] == 2 && tablica[2][2] == 2 || (tablica[2][0] == 2 && tablica[1][1] == 2 && tablica[0][2] == 2)) {
                result = 2;
            }
        }
        if (result == 3) {System.out.print("ничья ");}

       else {System.out.print("победил игрок номер "+result);}
    }
}
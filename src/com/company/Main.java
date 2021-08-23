package com.company;

public class Main {

    public static void main(String[] args) {
        String vetorcidades[] = new String[10];
        String cidadequente = "teste";
        String cidadefria = "teste";
        vetorcidades[0] = "Londres";
        vetorcidades[1] = "Madrid";
        vetorcidades[2] = "NY";
        vetorcidades[3] = "Buenos Aires";
        vetorcidades[4] = "Asunción";
        vetorcidades[5] = "São Paulo";
        vetorcidades[6] = "Lima";
        vetorcidades[7] = "Santiago de Chile";
        vetorcidades[8] = "Lisboa";
        vetorcidades[9] = "Tokio";
        int matriztemp[][] = new int[10][2];
        matriztemp[0][0] = -2;
        matriztemp[0][1] = 33;
        matriztemp[1][0] = -3;
        matriztemp[1][1] = 32;
        matriztemp[2][0] = -8;
        matriztemp[2][1] = 27;
        matriztemp[3][0] = 4;
        matriztemp[3][1] = 37;
        matriztemp[4][0] = 6;
        matriztemp[4][1] = 42;
        matriztemp[5][0] = 5;
        matriztemp[5][1] = 43;
        matriztemp[6][0] = 0;
        matriztemp[6][1] = 39;
        matriztemp[7][0] = -7;
        matriztemp[7][1] = 26;
        matriztemp[8][0] = -1;
        matriztemp[8][1] = 31;
        matriztemp[9][0] = -10;
        matriztemp[9][1] = 35;
        int max = matriztemp[0][1], posmin = 0, posmax = 0, min = matriztemp[0][0], k, m;
        for (k = 0; k < 10; k++) {
            if (matriztemp[k][0] < min) {
                min = matriztemp[k][0];
                posmin = k;
            }
        }
        for (m = 0; m < 10; m++) {
            if (matriztemp[m][1] > max) {
                max = matriztemp[m][1];
                posmax = m;
            }
        }
        System.out.println("A cidade mais fria é: " + vetorcidades[posmin] + " e a cidade mais quente é: " + vetorcidades[posmax]);
    }
}
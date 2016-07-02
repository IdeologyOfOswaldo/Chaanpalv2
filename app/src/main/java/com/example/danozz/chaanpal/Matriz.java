package com.example.danozz.chaanpal;

/**
 * Created by dan on 5/1/16.
 */
public class Matriz {
    private byte[][] bebe;
    public Matriz() {
        bebe = new byte[12][31];
    }

    public void Insertar() {
        bebe[9][0] = 1;
        bebe[10][1] = 1;
        bebe[11][2] = 1;
        bebe[11][0] = 1;

        for (int a = 2; a < 10; a += 2) {
            for (int i = a; i <= 11; i++) {
                for (int j = 0; j <= 11; j++) {
                    if (i == j) {
                        bebe[i][j - a] = 1;
                    }
                }
            }
        }
        for (int i = 0; i < bebe.length; i++) {
            for (int j = 0; j < bebe[i].length; j++) {
                if (i == j) {
                    bebe[i][j] = 1;
                    for (int m = 1; m <= 13; m += 2) {
                        bebe[i][j + m] = 1;
                    }
                    for (int m = 14; m <= 18; m += 2) {
                        bebe[i][j + m] = 1;
                    }
                }
            }
        }
        for (int a = 0; a < 8; a += 2) {
            for (int i = a; i <= 10; i++) {
                for (int j = 0; j <= 10; j++) {
                    if (i == j) {
                        bebe[i - a][j + 20] = 1;
                    }
                }
            }
        }
        for (int a = 0; a < 4; a += 2) {
            for (int i = a; i <= 3; i++) {
                for (int j = 0; j <= 3; j++) {
                    if (i == j) {
                        bebe[i - a][j + 27] = 1;
                    }
                }
            }
        }
    }
    public String Algo(int f, int c) {
        String cad;
        if (bebe[f][c] == 1) {
            cad = "Niño";
        } else {
            cad = "Niña";
        }
        return cad;
    }
    @Override
    public String toString() {
        String cad = "";
        for (int i = 0; i < bebe.length; i++) {
            for (int j = 0; j < bebe[i].length; j++) {
                cad += bebe[i][j] + "  ";
            }
            cad += "\n";
        }
        return cad;
    }
}

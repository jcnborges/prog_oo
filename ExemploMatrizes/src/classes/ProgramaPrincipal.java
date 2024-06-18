/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classes;

import java.util.Random;

/**
 *
 * @author Aluno
 */
public class ProgramaPrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] a = new int[3][3];
        int[][] b = new int[3][3];
        int[][] soma = new int[3][3];
        int[][] subtr = new int[3][3];
        Random gerador = new Random();
        for (int i = 0; i < 3; i = i + 1) {
            for (int j = 0; j < 3; j = j + 1) {
                a[i][j] = gerador.nextInt(100) + 1;
                b[i][j] = gerador.nextInt(100) + 1;
            }
        }
        System.out.println("a = ");
        for (int i = 0; i < 3; i = i + 1) {
            for (int j = 0; j < 3; j = j + 1) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("\nb = ");
        for (int i = 0; i < 3; i = i + 1) {
            for (int j = 0; j < 3; j = j + 1) {
                System.out.print(b[i][j] + "\t");
            }
            System.out.println("");
        }
        for (int i = 0; i < 3; i = i + 1) {
            for (int j = 0; j < 3; j = j + 1) {
                soma[i][j] = a[i][j] + b[i][j];
                subtr[i][j] = a[i][j] - b[i][j];
            }
        }
        System.out.println("\nsoma = ");
        for (int i = 0; i < 3; i = i + 1) {
            for (int j = 0; j < 3; j = j + 1) {
                System.out.print(soma[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("\nsubtr = ");
        for (int i = 0; i < 3; i = i + 1) {
            for (int j = 0; j < 3; j = j + 1) {
                System.out.print(subtr[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Escreva uma função em Java que calcule o fatorial de um número inteiro N​
 * Teste sua função com os valores de N = 0, N = 1, N = 5, N = 7 e N = 10
 * @author Aluno
 */
public class Fatorial {
    
    public static int fatorial(int n) {
        int fat = 1;
        for (int i = 1; i <= n; i++) {
            fat = fat * i;
        }
        return fat;
    }
    
    public static void main(String[] args) {
        System.out.println("0! = " + fatorial(0));
        System.out.println("1! = " + fatorial(1));
        System.out.println("5! = " + fatorial(5));
        System.out.println("7! = " + fatorial(7));
        System.out.println("10! = " + fatorial(10));
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classes;

/**
 *
 * @author Aluno
 */
public class ProgramaPrincipal {
  
    public static int[][] somarMatrizes(int[][] a, int[][] b) {
        if (a.length != b.length || a[0].length != b[0].length) // verificar a dimensao das matrizes
            return null;
        int[][] soma = new int[a.length][a[0].length];
        for (int i = 0; i < soma.length; i++) {
            for (int j = 0; j < soma[i].length; j++) {
                soma[i][j] = a[i][j] + b[i][j];
            }
        }
        return soma;
    }
    
    public static void mostrarMatriz(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[][] a = {{1,2,3}, {4,5,6}, {7,8,9}};
        int[][] b = {{10,11,12}, {13,14,15}, {16,17,18}};
        
        System.out.println("a = ");
        mostrarMatriz(a);
        
        System.out.println("b = ");
        mostrarMatriz(b);
        
        int[][] soma = somarMatrizes(a, b);
        
        System.out.println("soma = ");
        mostrarMatriz(soma);
    }
    
}

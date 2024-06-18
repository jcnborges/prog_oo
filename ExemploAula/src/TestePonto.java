/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class TestePonto {
    
    public static void main(String[] args) {
        
        Ponto pt1 = new Ponto();
        Ponto pt2 = new Ponto(5, 10);
        Ponto pt3 = new Ponto(7, 10);

        System.out.println("pt1 = " + pt1);
        System.out.println("pt2 = " + pt2);
        System.out.println("pt3 = " + pt3);
        
        System.out.println("pt1 -> (0,0) = " + pt1.distancia());
        System.out.println("pt1 -> pt2 = " + pt1.distancia(pt2));
        System.out.println("pt2 -> pt3 = " + pt2.distancia(pt3));
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class TesteBiblioteca {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Autor Teste", 2023, 800, "978-65-990215-0-3", "Editora teste", 1, 1, "Titulo teste");
        System.out.println(livro1.toString());
        
        Revista revista1 = new Revista("15/05/2024", "Teste", "Reportagem teste", "Editora teste", 2, 2, "Revista teste");
        System.out.println(revista1.toString());
    }
}

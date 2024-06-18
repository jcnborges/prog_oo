
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class ProgramaPrincipal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o montante inicial:");
        double montanteInicial = input.nextDouble();
        
        System.out.println("Digite a taxa de juros mensal:");
        double taxaJuros = input.nextDouble();
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        input.nextLine();
        
        System.out.println("Digite a data de entrada (dd/mm/yyyy):");
        LocalDate dataEntrada = LocalDate.parse(input.nextLine(), formatter);
        
        System.out.println("Digite a data de resgate (dd/mm/yyyy):");
        LocalDate dataResgate = LocalDate.parse(input.nextLine(), formatter);
        
        CalculadoraInvestimento calculadora = new CalculadoraInvestimento(montanteInicial, taxaJuros, dataEntrada, dataResgate);
        
        try {
            System.out.println("Resultado a juros simples: " + calculadora.calcularResultado(CalculadoraInvestimento.OPCAO_JUROS.SIMPLES));
            System.out.println("Resultado a juros composto: " + calculadora.calcularResultado(CalculadoraInvestimento.OPCAO_JUROS.COMPOSTO));
        } catch (IllegalArgumentException | DateTimeException ex) {
            System.err.println(ex.getMessage());
        }
    }
}

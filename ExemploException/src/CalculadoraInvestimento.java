
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;




/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class CalculadoraInvestimento {
    private double montanteInicial;
    private double taxaJuros;
    private LocalDate dataEntrada;
    private LocalDate dataResgate;

    public CalculadoraInvestimento(double montanteInicial, double taxaJuros, LocalDate dataEntrada, LocalDate dataResgate) {
        this.montanteInicial = montanteInicial;
        this.taxaJuros = taxaJuros;
        this.dataEntrada = dataEntrada;
        this.dataResgate = dataResgate;
    }

    public void setMontanteInicial(double montanteInicial) {
        this.montanteInicial = montanteInicial;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public void setDataResgate(LocalDate dataResgate) {
        this.dataResgate = dataResgate;
    }

    public double getMontanteInicial() {
        return montanteInicial;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public LocalDate getDataResgate() {
        return dataResgate;
    }
    
    private void validarEntrada() throws IllegalArgumentException, DateTimeException {
        if (montanteInicial <= 0) {
            throw new IllegalArgumentException("Montante inicial deve ser maior que zero!");
        }
        
        if (taxaJuros <= 0) {
            throw new IllegalArgumentException("Taxa de juros deve ser maior que zero!");
        }
        if (calcularMeses() < 12) {
            throw new DateTimeException("O periodo de investimento deve ser no minimo 12 meses!");
        }
    }
    
    private int calcularMeses() {
        Period diff = Period.between(dataEntrada, dataResgate);
        return 12 * diff.getYears() + diff.getMonths();
    }
    
    public static enum OPCAO_JUROS {
        SIMPLES,
        COMPOSTO
    }
    
    public double calcularResultado(OPCAO_JUROS tipo) throws IllegalArgumentException, DateTimeException {
        validarEntrada();
        switch (tipo) {
            case SIMPLES: return montanteInicial + montanteInicial * taxaJuros * calcularMeses();
            case COMPOSTO: return montanteInicial * Math.pow(1 + taxaJuros, calcularMeses());
            default: throw new IllegalArgumentException("Tipo de juros invalido!");
        }
    }
}

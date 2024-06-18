/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class Aluno {
    private int RGM;
    private String nome;
    private int anoIngresso;

    public Aluno(int RGM, String nome, int anoIngresso) {
        this.RGM = RGM;
        this.nome = nome;
        this.anoIngresso = anoIngresso;
    }

    public int getRGM() {
        return RGM;
    }

    public void setRGM(int RGM) {
        this.RGM = RGM;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoIngresso() {
        return anoIngresso;
    }

    public void setAnoIngresso(int anoIngresso) {
        this.anoIngresso = anoIngresso;
    }

    @Override
    public String toString() {
        return String.format("RGM: %d, Nome: %s, AnoIngresso: %d", this.RGM, this.nome, this.anoIngresso);
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public abstract class Leitura extends Material {
    private String editora;
    private int edicao;

    public Leitura(String editora, int edicao, int codigo, String titulo) {
        super(codigo, titulo);
        this.editora = editora;
        this.edicao = edicao;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public int getEdicao() {
        return edicao;
    }

    @Override
    public String toString() {
        return super.toString() + ", " +
                String.format("editora: %s, edicao: %d", editora, edicao);
    }
    
}

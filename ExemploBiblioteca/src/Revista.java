/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class Revista extends Leitura {
    private String data;
    private String editorial;
    private String reportagemCapa;

    public Revista(String data, String editorial, String reportagemCapa, String editora, int edicao, int codigo, String titulo) {
        super(editora, edicao, codigo, titulo);
        this.data = data;
        this.editorial = editorial;
        this.reportagemCapa = reportagemCapa;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setReportagemCapa(String reportagemCapa) {
        this.reportagemCapa = reportagemCapa;
    }

    public String getReportagemCapa() {
        return reportagemCapa;
    }

    @Override
    public String toString() {
        return super.toString() + " ," +
            String.format("data: %s, editorial: %s, reportagemCapa: %s", 
                    data, editorial, reportagemCapa);
    }
    
    
}

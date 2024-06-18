/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class Livro extends Leitura {
    private String autor;
    private int anoPublicacao;
    private int numPaginas;
    private String ISNB;

    public Livro(String autor, int anoPublicacao, int numPaginas, String ISNB, String editora, int edicao, int codigo, String titulo) {
        super(editora, edicao, codigo, titulo);
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.numPaginas = numPaginas;
        this.ISNB = ISNB;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setISNB(String ISNB) {
        this.ISNB = ISNB;
    }

    public String getISNB() {
        return ISNB;
    }

    @Override
    public String toString() {
        return super.toString() + ", " +
            String.format("autor: %s, anoPublicacao: %d, numPaginas: %d, ISBN: %s",
                    autor, anoPublicacao, numPaginas, ISNB);
    }
     
}

package TrabWilson;
//permitir o cadastro de novos produtos, registrando seu código, nome e quantidade inicial no estoque.

public class Produto {
    private int codigo;
    private String nomeProduto;
    private int quantidade;
    int funcao;

    public Produto (int codigo, String nomeProduto, int quantidade) {
        this.codigo = codigo;
        this.nomeProduto = nomeProduto;
        this.quantidade = quantidade;
    }


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}

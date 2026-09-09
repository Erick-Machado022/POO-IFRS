package ex03;

public class EstoqueProduto {
    private String nome;
    private int quantidade;

    public EstoqueProduto(String nome, int quantidade){
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public String nome(){
        return nome;
    }

    public void entrada(int qtd){
        if(qtd >0){
            quantidade+=qtd;
        }
    }

    public boolean saida(int qtd){
        if (qtd > 0 && qtd <= quantidade) {
            quantidade -= qtd;
            return true;
        }
            return false;
        
    }

    public int quantidadeAtual(){
        return quantidade;
    }
}

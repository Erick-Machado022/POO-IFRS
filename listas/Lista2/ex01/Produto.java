package ex01;

import java.math.BigDecimal;

public class Produto {

    private final String nome;
    private final BigDecimal preco;
    private int quantidadeEmEstoque;
    
    public Produto(String nome, BigDecimal preco, int quantidadeEmEstoque){

        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome não pode ser vazio.");   
        }

        if(preco == null || preco.compareTo(BigDecimal.ZERO) <= 0){
            throw new IllegalArgumentException("Preco precisa ser maior do que zero");
        }

        if (quantidadeEmEstoque < 0) {
            throw new IllegalArgumentException("O estoque não pode ser negativo");
        }


        this.preco = preco;
        this.nome = nome;
        this.quantidadeEmEstoque = quantidadeEmEstoque;

    }

    public String getNome(){
        return nome;
    }

    public BigDecimal getPreco(){
        return preco;
    }

    public int getQuantidadeEmEstoque(){
        return quantidadeEmEstoque;
    }

    public void RegistrarEntrada(int valor){
        if(valor <=0){
            throw new IllegalArgumentException("O valor da entrada precisa ser maior do que zero");
        }

        quantidadeEmEstoque += valor;
    }

    public void RegistrarSaida(int valor){
        if (valor > quantidadeEmEstoque || valor <= 0) {
            throw new IllegalArgumentException("Quantidade de estoque insuficiente necessita ser maior do que zero");
        }

        quantidadeEmEstoque -= valor;
    }



}

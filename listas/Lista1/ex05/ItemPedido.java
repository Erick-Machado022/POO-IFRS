package ex05;

public class ItemPedido {
    private String nome;
    private double precoUnitario;
    private int quantidade;

    public ItemPedido(String nome, double precoUnitario, int quantidade){
        this.nome = nome;
        this.precoUnitario = precoUnitario;
        this.quantidade = quantidade;

        if (quantidade < 1) {
        throw new IllegalArgumentException("Quantidade deve ser maior do que 1");
        }

        if(precoUnitario <=0){
            throw new IllegalArgumentException("Preco deve ser maior do que 0");
        }

    }

    public double subTotal(){
        return precoUnitario * quantidade;
    }



}

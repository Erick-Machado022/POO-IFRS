package ex05;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<ItemPedido> itens;
    
    public Pedido(){
        itens = new ArrayList<>();
    }

    public void adicionarItem(ItemPedido item){
        itens.add(item);
    }

    public int quantidadeDeItens(){
        return itens.size();
    }

    public double total(){
        double total = 0;

        for (ItemPedido item : itens){
            total+= item.subTotal();
        }

        return total;
    }




}

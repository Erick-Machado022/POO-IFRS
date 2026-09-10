



public class Manutencao {

    private String data;
    private TipoManutencao tipo;
    private double custo;
    private double quilometragem;

    //construtor
    public Manutencao(String data, TipoManutencao tipo, double custo, double quilometragem){
    


        
        this.data = data;
        
        this.tipo = tipo;

        if(custo < 0){
            throw new IllegalArgumentException("O valor do custo nao pode ser menor do que zero");
        }
        this.custo = custo;
        this.quilometragem = quilometragem;
    }

   
}

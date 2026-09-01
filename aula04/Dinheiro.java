/* Classe dinheiro responsavel por manupular "coisas" de dinheiro */

public class Dinheiro {

    private int centavos;
    
    public Dinheiro(int centavos){
        if(centavos <0){
            throw new IllegalArgumentException("VAlores de dinheiro não deem ser negativos");
        }
        this.centavos = centavos;
    }

    //public int getCentavos(){
    //    return centavos;
    //}

    public boolean igual(Dinheiro outro){
        return this.centavos == outro.centavos;
    }

    

    
    
}

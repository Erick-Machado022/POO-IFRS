import java.time.LocalDate;
import java.time.format.DateTimeFormatter;



public class Manutencao {

    private String data;
    private TipoManutencao tipo;
    private double custo;
    private double quilometragem;

    //construtor
    public Manutencao(String data, TipoManutencao tipo, double custo, double quilometragem){
       
        
        
        //formatação para o tipo data
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate dataManutencao = LocalDate.parse(data, formato);

        LocalDate hoje = LocalDate.now();

        if (dataManutencao.isAfter(hoje)) {
            throw new IllegalArgumentException("A data de manutenção não pode ser futura");
        }


        
        this.data = data;
        
        this.tipo = tipo;

        if(custo < 0){
            throw new IllegalArgumentException("O valor do custo nao pode ser menor do que zero");
        }
        this.custo = custo;
        this.quilometragem = quilometragem;
    }

    public String getData(){
        return data;
    }

    public TipoManutencao getTipo(){
        return tipo;
    }

    public double custo(){
        return custo;
    }

    public double getQuilometragem(){
        return quilometragem;
    }
}

import java.util.ArrayList;
import java.util.List;

public class Veiculos {
    
    private String placa;

    private String modelo;

    private double quilometragemAtual;

    private double quilometragemUltimaPreventiva;

    private double intervaloManutencaoKm;

    private ArrayList<Manutencao> listaManutencoes;

    public Veiculos(String placa, String modelo,double quilometragemAtual, double intervaloManutencaoKm){
        this.placa = placa;
        this.modelo = modelo;
        this.quilometragemAtual = quilometragemAtual;
        this.quilometragemUltimaPreventiva = quilometragemAtual;
        this.intervaloManutencaoKm = intervaloManutencaoKm;

        this.listaManutencoes = new ArrayList<>();

        
        
    }

    public void atualizarQuilometragem(double novaQuilometragem){

        if (novaQuilometragem < quilometragemAtual) {
            throw new IllegalArgumentException("A quilometragem não pode retroceder");
        }

            this.quilometragemAtual = novaQuilometragem;
        }

    //getters

    public String getPlaca(){
            return placa;
    }

    public String getModelo(){
        return modelo;
    }

    public double getQuilometragemAtual(){
        return quilometragemAtual;
    }

    public double getQuilomretragemUltimaPreventiva(){
        return quilometragemUltimaPreventiva;
    }

    public double getIntervaloManutencaoKm(){
        return intervaloManutencaoKm;
    }

    public List<Manutencao> getManutencoes(){
        return List.copyOf(listaManutencoes);
    }


    //registro de manutenção

    public void registrarManutencao(String data, TipoManutencao tipo, double custo){

        Manutencao novaManutencao = new Manutencao(data,tipo,custo, quilometragemAtual);

        listaManutencoes.add(novaManutencao);

        if (tipo == TipoManutencao.PREVENTIVA) {
            quilometragemUltimaPreventiva = quilometragemAtual;
        }
    }

    //precisa de manutenção

    public boolean precisaManutencao(){
        double kmRodadoDaUltimaPreventiva = quilometragemAtual - quilometragemUltimaPreventiva;

        if (kmRodadoDaUltimaPreventiva >= intervaloManutencaoKm) {
            return true;
        }else{
            return false;
        }
    }

    //custos

    
    public double calcularCustoTotalManutencao(){
        double total = 0;

        for(Manutencao manutencoes : listaManutencoes){
            total+= manutencoes.custo();
        }

        return total;
    }


    

}

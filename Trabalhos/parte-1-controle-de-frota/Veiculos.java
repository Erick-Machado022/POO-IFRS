import java.util.ArrayList;
import java.util.List;

public class Veiculos {
    
    private String placa;

    private String modelo;

    private double quilometragemAtual;

    private double quilometragemUltimaPreventiva;

    private double intervaloManutencaoKm;

    private ArrayList<Manutencao> manutencoes;

    public Veiculos(String placa, String modelo,double quilometragemAtual, double intervaloManutencaoKm){
        this.placa = placa;
        this.modelo = modelo;
        this.quilometragemAtual = quilometragemAtual;
        this.quilometragemUltimaPreventiva = quilometragemAtual;
        this.intervaloManutencaoKm = intervaloManutencaoKm;

        this.manutencoes = manutencoes = new ArrayList<>();

        
        
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


    //registro de manutenção

    public void registrarManutencao(Manutencao manutencao){
        manutencoes.add(manutencao);

        if (manutencao.getTipo() == TipoManutencao.PREVENTIVA) {
            quilometragemUltimaPreventiva = quilometragemAtual;
        }
    }

    //precisa de manutenção

    public boolean pecisaManutencao(){
        double kmRodadoDaUltimaPreventiva = quilometragemAtual - quilometragemUltimaPreventiva;

        if (kmRodadoDaUltimaPreventiva >= intervaloManutencaoKm) {
            return true;
        }else{
            return false;
        }
    }

    //custos

    public double totaCustoManutencao(){
        double total = 0;

        for(Manutencao manutencao : manutencoes){
            total += manutencao.getCusto();
        }

        return total;


    }


    

}

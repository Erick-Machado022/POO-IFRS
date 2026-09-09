public class Veiculos {
    
    private String placa;

    private String modelo;

    private double quilometragemAtual;

    private double quilometragemUltimaPreventiva;

    private double intervaloManutencaoKm;

    public veiculo(String placa, String modelo,double quilometragemAtual, double intervaloManutencaoKm){
        this.placa = placa;
        this.modelo = modelo;
        this.quilometragemAtual = quilometragemAtual;
        this.quilometragemUltimaPreventiva = quilometragemAtual;
        this.intervaloManutencaoKm = intervaloManutencaoKm;

        
    }

}

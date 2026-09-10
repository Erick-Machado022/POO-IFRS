public class Veiculos {
    
    private String placa;

    private String modelo;

    private double quilometragemAtual;

    private double quilometragemUltimaPreventiva;

    private double intervaloManutencaoKm;

    public Veiculos(String placa, String modelo,double quilometragemAtual, double intervaloManutencaoKm){
        this.placa = placa;
        this.modelo = modelo;
        this.quilometragemAtual = quilometragemAtual;
        this.quilometragemUltimaPreventiva = quilometragemAtual;
        this.intervaloManutencaoKm = intervaloManutencaoKm;

        
        
    }

    public void atualizarQuilometragem(double novaQuilometragem){

        if (novaQuilometragem < quilometragemAtual) {
            throw new IllegalArgumentException("A quilometragem não pode retroceder");
        }

            this.quilometragemAtual = novaQuilometragem;
        }

    
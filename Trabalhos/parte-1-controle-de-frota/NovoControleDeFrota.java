import java.util.ArrayList;
import java.util.List;

public class NovoControleDeFrota {
    
    private List<Veiculos> listaVeiculos = new ArrayList<>();


    public void cadastrarVeiculo(
        String placa,
        String modelo,
        double kmAtual,
        double intervaloManutencao) {

        if (buscarVeiculo(placa) != null) {
            throw new IllegalArgumentException("Placa já identificada em nosso sistema");
        }
        
        Veiculos veiculo = new Veiculos(placa, modelo, kmAtual, intervaloManutencao);

        
        
        listaVeiculos.add(veiculo);
        
    }

    private  Veiculos buscarVeiculo(String placa){
        for(Veiculos veiculo : listaVeiculos ){
            if (placa.equals(veiculo.getPlaca())) {
                return veiculo;
            }
        }
        return null;
    }


    //atualizar km
    public void atualizarQuilometragemDoVeiculo(String placa,double novaQuilometragem){
       
        Veiculos encontrado = buscarVeiculo(placa);

        if (encontrado != null) {
            encontrado.atualizarQuilometragem((novaQuilometragem));
        }else{
            System.out.println("Veiculo não encontrado: " + placa);
            return;
        }
    }

    public void registrarManutencaoVeiculo(String placa, String data, TipoManutencao tipo, double custo){
        Veiculos veiculoEncontrado = buscarVeiculo(placa);

        if (veiculoEncontrado == null) {
            System.out.println("Veiculo nao encontrado: " + placa);
            return;
        }

        veiculoEncontrado.registrarManutencao(data, tipo, custo);
    }


    public  boolean precisaManutencaoDoVeiculo(String placa){
        Veiculos veiculoEncontrado = buscarVeiculo(placa);

        if(veiculoEncontrado == null){
            return false;
        }

        return veiculoEncontrado.precisaManutencao();
    }

    public  double calcularCustoTotalDoVeiculo(String placa){
        Veiculos veiculoEncontado = buscarVeiculo(placa);

        if (veiculoEncontado == null){
            return 0;
        }

        return veiculoEncontado.calcularCustoTotalManutencao();
    }

    public  void imprimirRelatorioVeiculo(String placa){
        Veiculos veiculoEncontrado = buscarVeiculo(placa);

        if (veiculoEncontrado == null) {
            System.out.println("Veiculo nao encontrado: " + placa);

            return;
        }

        System.out.println("Placa: " + veiculoEncontrado.getPlaca());
        System.out.println("Modelo: " + veiculoEncontrado.getModelo());
        System.out.println("KM atual: " + veiculoEncontrado.getQuilometragemAtual());
        if (veiculoEncontrado.precisaManutencao()) {
            System.out.println("Precisa de manutenção: Sim");
        }else{
                        System.out.println("Precisa de manutenção: Não");

        }
        
        System.out.println("Custo total de manutencao: R$: " + veiculoEncontrado.calcularCustoTotalManutencao());
        System.out.println("Histórico: ");
        for(Manutencao manutencao : veiculoEncontrado.getManutencoes()){
            System.out.println(" " + manutencao.data() + " - " + manutencao.tipo() + " - " + manutencao.custo());
        }
    }



}

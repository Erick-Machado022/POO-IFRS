public class Main {
    public static void main(String[] args) {

        NovoControleDeFrota controleDeFrota = new NovoControleDeFrota();

        controleDeFrota.cadastrarVeiculo(
                "ABC1D23",
                "Fiorino 1.4",
                45000,
                10000
        );

        controleDeFrota.cadastrarVeiculo(
                "XYZ9K88",
                "Sprinter 2.2",
                120000,
                15000
        );

        controleDeFrota.atualizarQuilometragemDoVeiculo(
                "ABC1D23",
                48000
        );

        controleDeFrota.registrarManutencaoVeiculo(
                "ABC1D23",
                "10/01/2026",
                TipoManutencao.PREVENTIVA,
                850
        );

        controleDeFrota.atualizarQuilometragemDoVeiculo(
                "ABC1D23",
                58500
        );

        controleDeFrota.registrarManutencaoVeiculo(
                "ABC1D23",
                "02/03/2026",
                TipoManutencao.CORRETIVA,
                1200
        );

        controleDeFrota.atualizarQuilometragemDoVeiculo(
                "XYZ9K88",
                134000
        );

        controleDeFrota.imprimirRelatorioVeiculo("ABC1D23");

        System.out.println("----");

        controleDeFrota.imprimirRelatorioVeiculo("XYZ9K88");

        System.out.println("----");

        System.out.println(
                "ABC1D23 precisa manutencao? "
                + controleDeFrota.precisaManutencaoDoVeiculo("ABC1D23")
        );

        System.out.println(
                "XYZ9K88 precisa manutencao? "
                + controleDeFrota.precisaManutencaoDoVeiculo("XYZ9K88")
        );
    }
}
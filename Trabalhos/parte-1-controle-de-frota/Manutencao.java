import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public record Manutencao(
        String data,
        TipoManutencao tipo,
        double custo,
        double quilometragem) {

    public Manutencao {

        // formatação para o tipo data
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate dataManutencao = LocalDate.parse(data, formato);
        LocalDate hoje = LocalDate.now();

        if (dataManutencao.isAfter(hoje)) {
            throw new IllegalArgumentException(
                    "A data de manutenção não pode ser futura"
            );
        }

        if (custo < 0) {
            throw new IllegalArgumentException(
                    "O valor do custo nao pode ser menor do que zero"
            );
        }
    }
}
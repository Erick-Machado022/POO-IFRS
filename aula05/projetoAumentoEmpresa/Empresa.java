package projetoAumentoEmpresa;
import java.util.List;
import java.util.ArrayList;

public class Empresa {

    private List<Funcionario> listaFuncionarios = new ArrayList<>();

    public void addFunc(Funcionario funcionario){
        listaFuncionarios.add(funcionario);
    }

    public void mostrarFolha(){

        for(Funcionario funcionario : listaFuncionarios){
            System.out.printf("%s - R$ %.2f%n", funcionario.getNome(), funcionario.calcularSalario());
        }

    }
    
}

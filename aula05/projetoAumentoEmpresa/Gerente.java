package projetoAumentoEmpresa;
public class Gerente extends Funcionario {

    public Gerente(String nome, double salario){
        super(nome, salario);
    }

    @Override 
    public double calcularSalario(){
        return getSalario() * 1.2f;
    }
}

package projetoAumentoEmpresa;
public class Main {
    public static void main(String[] args) {
        

        Funcionario b1 = new Funcionario("banana 1", 4000); // getSalario
        Funcionario b2 = new Funcionario("banana 2", 4000);
        Gerente g1 = new Gerente("Gerente", 8000); // 20% de bonus na hora de calcular a folha  
        Gerente g2 = new Gerente("Gerente 2", 16000); // 20% de bonus na hora de calcular a folha  

        Empresa empresa = new Empresa();

        empresa.addFunc(b1);
        empresa.addFunc(b2);
        empresa.addFunc(g1);
        empresa.addFunc(g2);

        empresa.mostrarFolha();


    }
}

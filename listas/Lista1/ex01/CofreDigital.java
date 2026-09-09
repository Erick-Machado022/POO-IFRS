package ex01;
public class CofreDigital {
    
    private int saldo;

    public void depositar(int valor){
        if (valor > 0) {
            saldo += valor;
        }
    }

    public boolean sacar(int valor){
       if(valor > 0 && valor <= saldo){
            saldo-= valor;
            return true;
       }else{
            return false;
       }
    }

    public int saldo(){
        return saldo;
    }
}

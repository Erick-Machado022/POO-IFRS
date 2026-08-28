public class ContadorDedo {


    public int contagem  = 0;
    private boolean luz = false;
    private int timer = 0;

    //Contar
    public void contar(){
        contagem++;
    }

    public int verContagem(){
        return contagem;
    }


    //Resetar
    public void resetar(){
        contagem = 0;
    }

    //Ligar Luz
    public void LigarLuz(){
        luz = true;
        timer = 3;

    }

    public void tick(){
        timer--;
        if(timer <=0){
            luz = false;
            return;
        }
        
    }


    @Override
    public String toString(){
        return "CONTADOR " + contagem + " COM VISOR " + (luz ? "ACESO" : "APAGADO"); 
    }
}

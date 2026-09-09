package ex04;

public class SessaoVotacao {
    private boolean sessao = false;
    private int votoSim;
    private int votoNao;
    private int votoTotal;

    public void abrir(){
        sessao = true;
    }

    public void fechar(){
        sessao = false;
    }

    public void votarSim(){
        if(sessao == true){
            votoSim += 1;
        }
    }

    public void votarNao(){
        if (sessao == true) {
            votoNao +=1;
        }
    }

    public int sim(){
        return votoSim;
    }

    public int nao(){
        return votoNao;
    }

    public int total(){
        votoTotal = votoNao + votoSim;
        return votoTotal;
    }

    public boolean estaAberta(){
        return sessao;
    }


}

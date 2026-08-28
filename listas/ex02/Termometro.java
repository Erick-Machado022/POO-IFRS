package ex02;

public class Termometro {

    private double temperatura = 0.0;

    public void aumentar(double delta){
        if(delta > 0){
            temperatura += delta;
        }
    }

    public void diminuir(double delta){
        if(delta > 0){
            temperatura -= delta;
        }
    }

    public double emCelsius(){
        return temperatura;
    }

    public double emFahrenheit(){
        double fahrenheit = (temperatura * 1.8) + 32;

        return fahrenheit;
    }


}

package ex02;

public class Main {
    public static void main(String[] args) {
        Termometro t = new Termometro();

        t.aumentar(10);
        t.diminuir(3);
        t.diminuir(-2); // ignora

        System.out.println("Celsius esperado = 7.0 | Atual = " + t.emCelsius());
        System.out.println("Fahrenheit esperado ~ 44.6 | Atual = " + t.emFahrenheit());
    }
}

public class Main {
    public static void main(String[] args) {
        
        ContadorDedo ContadorDedo = new ContadorDedo();

        System.out.println(ContadorDedo.verContagem());

       ContadorDedo.contar() ;
       ContadorDedo.contar() ;
       ContadorDedo.contar() ;


       System.out.println(ContadorDedo.verContagem());

       ContadorDedo.LigarLuz();
       System.out.println(ContadorDedo);

       ContadorDedo.tick();
       ContadorDedo.tick();
       ContadorDedo.tick();

       System.out.println(ContadorDedo);
    }
}

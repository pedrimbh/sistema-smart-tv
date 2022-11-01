public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("TV ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("TV ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.mudarDeCanal(20);
        System.out.println("Canal atual: " + smartTv.canal);

        smartTv.aumentarCanal();
        System.out.println("Canal atual: " + smartTv.canal);
        
        smartTv.diminuirCanal();
        System.out.println("Canal atual: " + smartTv.canal);

    }
}

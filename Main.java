public class Main {
    public static void main(String[] args){
        Carro carro = new Carro();        
        carro.cor = "Sem cor";
        carro.velocidade = 0;
        
        carro.pintar("Preto");
        
        carro.acelerar(100);

        Carro carroAmarelo = new Carro();
        carroAmarelo.cor = "Amarelo";
        carroAmarelo.acelerar(150);
        carroAmarelo.frear(50);
        System.out.println("Vel. do carroAmarelo: " + carroAmarelo.velocidade);
    }
}
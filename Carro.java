public class Carro {
    public String cor;
    public int velocidade;

    public void pintar(String cor) { this.cor = cor; }

    public int acelerar(int velocidade) {
        this.velocidade += velocidade;
        return this.velocidade;
    }

    public int frear(int velocidade) {
        this.velocidade -= velocidade;
        return this.velocidade;
    }
}
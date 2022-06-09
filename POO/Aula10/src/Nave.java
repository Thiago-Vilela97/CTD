public class Nave extends Objeto{
    private double velocidade;
    private int vida;

    public Nave(int posX, int posY, char direcao, double velocidade, int vida) {
        super(posX, posY, direcao);
        this.velocidade = velocidade;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public String irA(int x, int y, char direcao) {
        return "Sua nave irá para a posição x: "
                +x +
                ", y: "
                +y +
                " e direção: "
                +direcao;
    }

    public void girar(char direcao) {
        super.setDirecao(direcao);
    }

    public void restaVida(int valor) {
        this.vida -= valor;
    }
}

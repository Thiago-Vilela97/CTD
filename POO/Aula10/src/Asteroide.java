public class Asteroide extends Objeto{
    private int danos;

    public Asteroide(int posX, int posY, char direcao, int danos) {
        super(posX, posY, direcao);
        this.danos = danos;
    }

    public int getDanos() {
        return danos;
    }

    public void setDanos(int danos) {
        this.danos = danos;
    }

    @Override
    public String irA(int x, int y, char direcao) {
        return "O asteroide irá para a posição x: "
                +x +
                ", y: "
                +y +
                " e direção: "
                +direcao;
    }
}

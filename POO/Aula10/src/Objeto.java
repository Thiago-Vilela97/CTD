public class Objeto {
    private int posX;
    private int posY;
    private char direcao;

    public Objeto() {
    }
    public Objeto(int posX, int posY, char direcao) {
        this.posX = posX;
        this.posY = posY;
        this.direcao = direcao;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public char getDirecao() {
        return direcao;
    }

    public void setDirecao(char direcao) {
        this.direcao = direcao;
    }

    public String irA(int x, int y, char direcao) {
        return "Você irá para a posição x: "
                +x +
                ", y: "
                +y +
                " e direção: "
                +direcao;
    }

}

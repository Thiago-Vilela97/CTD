public class Caminhando implements CalcularTempoStrategy {

    @Override
    public Double tempoViagem(Pontos pontos) {
        return pontos.calcularDistancia() / 0.20366 * 13;
    }

    @Override
    public String toString() {
        return "Você irá caminhando";
    }
}

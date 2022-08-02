public class Bicicleta implements CalcularTempoStrategy{
    @Override
    public Double tempoViagem(Pontos pontos) {
        return pontos.calcularDistancia() /   0.050366 * 1.5;
    }
    @Override
    public String toString() {
        return "Você irá de bicicleta";
    }
}

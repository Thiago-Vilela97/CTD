public class Automovel implements CalcularTempoStrategy{

    @Override
    public Double tempoViagem(Pontos pontos) {
        return pontos.calcularDistancia() /  0.40366 * 4;
    }
    @Override
    public String toString() {
        return "Você irá de carro";
    }
}

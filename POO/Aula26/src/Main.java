public class Main {
    public static void main(String[] args) {

        Pontos viagem1 = new Pontos(2.0,3.0,4.0,5.0);

        CalcularTempoStrategy caminhando = new Caminhando();
        CalcularTempoStrategy automovel = new Automovel();
        CalcularTempoStrategy bicicleta = new Bicicleta();

        System.out.println(automovel);
        System.out.println(automovel.tempoViagem(viagem1));

        System.out.println(caminhando);
        System.out.println(caminhando.tempoViagem(viagem1));

        System.out.println(bicicleta);
        System.out.println(bicicleta.tempoViagem(viagem1));
    }
}
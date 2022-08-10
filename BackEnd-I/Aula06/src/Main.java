public class Main {
    public static void main(String[] args) {

        GradeDeFilmesProxy proxy = new GradeDeFilmesProxy(new GradeDeFilmes());

        proxy.setIp(new Ip(245,23,42,44));

        try {
            System.out.println(proxy.getFilme("The White tiger").getLink());
            System.out.println("Acesso do filme liberado!!!");

        } catch (FilmeNaoHabilitadoException e) {
            System.out.println(e);

        }
    }
}
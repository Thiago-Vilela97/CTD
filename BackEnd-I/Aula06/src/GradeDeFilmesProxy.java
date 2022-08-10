public class GradeDeFilmesProxy implements IGradeDeFilmes{

    private GradeDeFilmes gradeDeFilmes;
    private Ip ipRec;

    public GradeDeFilmesProxy(GradeDeFilmes gradeDeFilmes) {
        this.setFilme(gradeDeFilmes);
    }

    public void setIp(Ip ip) {
        ipRec = ip;
    }

    public Ip getIp() {
        return ipRec;
    }
    public void setFilme (GradeDeFilmes filme) {
        gradeDeFilmes = filme;
    }

    @Override
    public Filme getFilme(String nomeDoFilme) throws FilmeNaoHabilitadoException{
        Filme filme = gradeDeFilmes.getFilme(nomeDoFilme);

        if(!(getIp().getPais()).equalsIgnoreCase(filme.getPais())){
            throw new FilmeNaoHabilitadoException(nomeDoFilme+" Não disponivel no(a) "+getIp().getPais());
        }
        return filme;
    }



}

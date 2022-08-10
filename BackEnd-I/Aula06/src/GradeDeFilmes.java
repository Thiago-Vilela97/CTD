public class GradeDeFilmes implements IGradeDeFilmes{

    @Override
    public Filme getFilme(String nomeDoFilme) {
        Filme filme = null;

        switch (nomeDoFilme) {
            case "The White tiger":
                filme = new Filme("The White tiger", "ARGENTINA", "www.wtiger.com");
                break;
            case "His House":
                filme = new Filme("His House","Brasil","www.hishouser.com");
                break;
            case "Over The Moon":
                filme = new Filme("Over The Moon","Colombia","www.overmoon.com");
                break;
            case "SuperBad":
                filme = new Filme("SuperBad","ARGENTINA","www.sbad.com");
                break;
            case "The Babysitter":
                filme = new Filme("The Babysitter","Colombia","www.babysitter.com");
                break;
        }
        return filme;
    }
}

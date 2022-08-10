public interface IGradeDeFilmes {
    Filme getFilme(String nomeDoFilme) throws FilmeNaoHabilitadoException;
}

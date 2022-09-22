public interface IDao <T> {
    public T salvar(T t);
    public T buscar(Integer id);
    public T deletar(Integer id);
    public T atualizar(T t);
}

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;

public class MedicamentoDaoH2 implements IDao<Medicamento> {
    private ConfiguracaoJDBC configuracaoJDBC;
    final static Logger log = Logger.getLogger(String.valueOf(MedicamentoDaoH2.class));

    public MedicamentoDaoH2 (ConfiguracaoJDBC configuracaoJDBC) {
        this.configuracaoJDBC = configuracaoJDBC;
    }

    @Override
    public Medicamento salvar(Medicamento medicamento) {
        log.info("Registrando um novo medicamento: "+medicamento.toString());
        Connection connection = configuracaoJDBC.conectarComBancoDeDados();
        Statement statement = null;
        String query = String.format("INSERT INTO medicamentos(nome, laboratorio, quantidade, preco) " +
                "VALUES ('%s','%s','%s','%s')", medicamento.getNome(), medicamento.getLaboratorio(),
                medicamento.getQuantidade(), medicamento.getPreco());

        try {
            statement = connection.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet resultSet = statement.getGeneratedKeys();

            if(resultSet.next()) {
                medicamento.setId(resultSet.getInt(1));
                statement.close();
                connection.close();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return medicamento;
    }

    @Override
    public Medicamento buscar(Integer id) {
        log.info("Buscando medicamento com o ID: " +id);
        Connection connection = configuracaoJDBC.conectarComBancoDeDados();
        Statement statement = null;

        String query = String.format("SELECT * FROM medicamentos WHERE id = '%s'", id);

        Medicamento medicamento = null;

        try{
            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);

            while(rs.next()){
             medicamento = new Medicamento(rs.getInt(1), rs.getString("nome"), rs.getString("laboratorio"),
                rs.getInt("quantidade"), rs.getDouble("preco"));
            }
            statement.close();
            connection.close();
        }
        catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return medicamento;
    }
}

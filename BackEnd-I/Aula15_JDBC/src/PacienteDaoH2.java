import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;

public class PacienteDaoH2 implements IDao<Paciente>{

    private ConfiguracaoJDBC configuracaoJDBC;

    final static Logger log = Logger.getLogger(String.valueOf(PacienteDaoH2.class));

    public PacienteDaoH2(ConfiguracaoJDBC configuracaoJDBC) {
        this.configuracaoJDBC = configuracaoJDBC;
    }

    @Override
    public Paciente salvar(Paciente paciente) {
        log.info("Reistrando novo paciente"+paciente);
        Connection connection = configuracaoJDBC.conectarComBancoDeDados();
        Statement statement = null;
        String query = String.format("INSERT INTO paciente(nome, sobrenome, rg, dataCadastro) "
        +"VALUES('%s','%s','%s','%s')", paciente.getNome(), paciente.getSobrenome(),
                paciente.getRg(),paciente.getDataCadastro());

        try{
            statement = connection.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet resultSet = statement.getGeneratedKeys();

            if (resultSet.next()){
                paciente.setId(resultSet.getInt(1));
                statement.close();
                connection.close();
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return  paciente;
    }

    @Override
    public Paciente buscar(Integer id) {
        return null;
    }

    @Override
    public Paciente deletar(Integer id) {
        return null;
    }

    @Override
    public Paciente atualizar(Paciente paciente) {
        return null;
    }
}

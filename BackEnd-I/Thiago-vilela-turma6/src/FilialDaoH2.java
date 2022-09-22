import java.lang.module.ResolutionException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;

public class FilialDaoH2 implements IDao<Filial>{
    private ConfiguracaoJDBC configuracaoJDBC;

    final static Logger log = Logger.getLogger(String.valueOf(FilialDaoH2.class));
    public FilialDaoH2 (ConfiguracaoJDBC configuracaoJDBC) {
        this.configuracaoJDBC = configuracaoJDBC;
    }


    @Override
    public Filial salvar(Filial filial) {

        log.info("Registrando uma nova Filial: "+filial);

        Connection connection = configuracaoJDBC.conectarBancoDeDados();
        Statement st = null;

        String query = String.format("INSERT INTO filiais(nome_filial, rua, numero, cidade, estado, e_cinco_estrelas) "
        +"VALUES ('%s','%s','%s','%s','%s','%s')", filial.getNomeFilial(), filial.getRua(), filial.getNumero(), filial.getCidade(),
        filial.getEstado(),filial.iseCincoEstrelas());

        try {
            st = connection.createStatement();
            st.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);

            ResultSet rs = st.getGeneratedKeys();

            if(rs.next()){
                filial.setId(rs.getInt(1));
                st.close();
                connection.close();
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return filial;
    }
}


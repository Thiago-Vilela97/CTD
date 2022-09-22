import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Main {

    private static final String sqlCreateTable =
            "DROP TABLE IF EXISTS Usuario. CREATE TABLE Usuario "
            +"("
            +"id INT PRIMARY KEY, "
            +"Primeiro_Nome VARCHAR(100) NOT NULL, "
            +"Sobrenome VARCHAR(100) NOT NULL, "
            +"Idade INT NOT NULL"
            +")";

    private static final String sqlInsert1 = "INSERT INTO Usuario(id,Primeiro_Nome,Sobrenome,Idade) "
            + "Values(1,'Maria','Almeida',50)";
    private static final String sqlInsert2 = "INSERT INTO Usuario(id,Primeiro_Nome,Sobrenome,Idade) "
            + "Values(2,'Jose','Silva',40)";
    private static final String sqlInsert3 = "INSERT INTO Usuario(id,Primeiro_Nome,Sobrenome,Idade) "
            + "Values(3,'Juliana','Barbosa',20)";

    // Instrução para excluir um registro na tabela Usuario
    private static final String sqlDelete = "DELETE FROM Usuario WHERE id = 2";

    private static final Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) throws Exception{

        BasicConfigurator.configure();

        Connection conn = null;

        try {
            conn = DriverManager.getConnection("jdbc:h2:~/test","sa","");
            Statement statement = conn.createStatement();

            statement.execute(sqlCreateTable);

            statement.execute(sqlInsert1);
            statement.execute(sqlInsert2);
            statement.execute(sqlInsert3);

            statement.execute(sqlDelete);

            logger.info("Excluido o usuario com o Id 2");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (conn == null ) {
                return;
            }
            conn.close();
        }

    }

    public static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection("jdbc:h2:tcp//localhost/~/test", "sa","");
    }
}
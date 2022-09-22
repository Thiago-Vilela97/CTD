import java.sql.Connection;
import java.sql.Statement;

import static java.sql.DriverManager.getConnection;


public class Main {

    private static final String sqlCreateTabela = "DROP TABLE IF EXISTS Animal; CREATE TABLE Animal"
            +"(id INT PRIMARY KEY, "
            +"Nome VARCHAR(100) NOT NULL," +
            "Tipo VARCHAR(100) NOT NULL)";

    //Preenchendo a tabela
    private static final String sqlInsert1 = "INSERT INTO Animal(id, Nome, Tipo) VALUES (1, 'Meg','Cachorro')";
    private static final String sqlInsert2 = "INSERT INTO Animal(id, Nome, Tipo) VALUES (2, 'Tobias','Cavalo')";
    private static final String sqlInsert3 = "INSERT INTO Animal(id, Nome, Tipo) VALUES (3, 'Miau','Gato')";
    private static final String sqlInsert4 = "INSERT INTO Animal(id, Nome, Tipo) VALUES (4, 'Tob','Cachorro')";
    private static final String sqlInsert5 = "INSERT INTO Animal(id, Nome, Tipo) VALUES (5, 'Max','Elefante')";

    //Deletar um animal com um Id especifico
    private static final String sqlDelete = "DELETE FROM Animal WHERE id = 2";

    public static void main(String[] args) throws Exception{
        Connection conn = null;

        try {
            conn = getConnection();
            Statement statement = conn.createStatement();
            statement.execute(sqlCreateTabela);

            statement.execute(sqlInsert1);
            statement.execute(sqlInsert2);
            statement.execute(sqlInsert3);
            statement.execute(sqlInsert4);
            statement.execute(sqlInsert5);

            showAnimal(conn);
            statement.execute(sqlDelete);
            showAnimal(conn);

        } catch(Exception e) {
            e.printStackTrace();
        }
        finally {
            if(conn==null){
                return;
            }
            else {
                conn.close();
            }
        }
    }
}
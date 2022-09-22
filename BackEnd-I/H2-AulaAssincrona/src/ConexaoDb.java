import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConexaoDb {
    public static void main(String[] args) throws Exception {
        Class.forName("org.h2.Driver").newInstance();

        Connection conn = DriverManager.getConnection("jdbc:h2:mem:testdb","sa","");
        Statement statement = conn.createStatement();;

        String sqlCreateTable = "DROP TABLE IF EXISTS Teste; " +
                "CREATE TABLE Test(Id INT PRIMARY KEY, Nome VARCHAR(100))";
        statement.execute(sqlCreateTable);

        String sqlInsert = "INSERT INTO Test(Id, Nome) VALUES (1, 'Thiago')";
        String sqlInsert1 = "INSERT INTO Test(Id, Nome) VALUES (2, 'Stefanie')";
        statement.execute(sqlInsert);
        statement.execute(sqlInsert1);

        String sqrRead = "SELECT * FROM Test";
        ResultSet rs = statement.executeQuery(sqrRead);

        while (rs.next()) {
            System.out.println(rs.getInt(1)+" - "+ rs.getString(2));
        }
    }
}
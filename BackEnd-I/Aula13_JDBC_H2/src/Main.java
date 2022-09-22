import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Main {

    private static final String sqlCreate = "DROP TABLE IF EXISTS Conta; "
            +"CREATE TABLE Conta"
            +"(Id INT PRIMARY KEY, "
            +"nome VARCHAR(100) NOT NULL, "
            +"numeroConta VARCHAR(100) NOT NULL, "
            +"saldo NUMERIC (15,2));";

    private static final String sqlInsert = "INSERT INTO Conta (Id, nome, numeroConta, saldo) "
            +"VALUES(?,?,?,?)";

    private static final String sqlUpdate = "UPDATE Conta SET saldo = ? WHERE id = ?;";

    public static void main(String[] args) throws Exception{

        Conta conta = new Conta(1, "Daniel", "122525",30.0);

        Connection connection = null;

        try {
            connection = ConnectionJDBC.getConnection();
            Statement statement = connection.createStatement();
            statement.execute(sqlCreate);

            PreparedStatement preparedStatementInsert = connection.prepareStatement(sqlInsert);
            preparedStatementInsert.setInt(1,conta.getId());
            preparedStatementInsert.setString(2,conta.getNome());
            preparedStatementInsert.setString(3,conta.getNumeroConta());
            preparedStatementInsert.setDouble(4,conta.getSaldo());

            preparedStatementInsert.execute();

            PreparedStatement preparedStatementUpdate = connection.prepareStatement(sqlUpdate);
            preparedStatementUpdate.

        }

    }
}
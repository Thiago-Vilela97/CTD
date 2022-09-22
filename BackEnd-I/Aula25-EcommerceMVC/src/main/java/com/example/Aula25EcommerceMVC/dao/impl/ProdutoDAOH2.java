package com.example.Aula25EcommerceMVC.dao.impl;

import com.example.Aula25EcommerceMVC.dao.ConfiguracaoJDBC;
import com.example.Aula25EcommerceMVC.dao.IDao;
import com.example.Aula25EcommerceMVC.model.Produto;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.Configuration;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.apache.logging.log4j.LogManager.getLogger;


@Configuration
public class ProdutoDAOH2 implements IDao<Produto> {

    private ConfiguracaoJDBC configuracaoJDBC;
    final static Logger log = getLogger(ProdutoDAOH2.class);

    @Override
    public Produto salvar(Produto produto) throws SQLException {
        log.info("Abrindo conexão");
        String sqlInsert = String.format("INSERT INTO produto (nomeProduto, valor)"
        +"VALUES('%s','%s')", produto.getNomeProduto(), produto.getValor());

        Connection connection = null;

        try {
            log.info("Salvando produto: "+ produto.getNomeProduto());
            configuracaoJDBC = new ConfiguracaoJDBC("org.h2.Driver", "jdbc:h2:~/ecommerce;"+
                    "INIT=RUNSCRIPT FROM 'create.sql'","sa","");

            connection = configuracaoJDBC.getConnection();
            Statement statement = connection.createStatement();
            statement.execute(sqlInsert, Statement.RETURN_GENERATED_KEYS);
            ResultSet resultSet = statement.getGeneratedKeys();

            if(resultSet.next()) {
                produto.setId(resultSet.getInt(1));
            }
        }
        catch (Exception e) {
            e.printStackTrace();
            log.error("Erro ao inserir o produto: "+e.getMessage());
        }
        finally {
            log.info("Fechando a conexão");
            connection.close();
        }
        return produto;
    }

    @Override
    public List<Produto> buscarTodos() throws SQLException {
        log.debug("Abrindo conexão no banco de dados");
        Connection connection = null;
        Statement statement = null;
        String query = "SELECT * FROM produto";

        List<Produto> produtos = new ArrayList<>();

        try {
            configuracaoJDBC = new ConfiguracaoJDBC("org.h2.Driver", "jdbc:h2:~/ecommerce;"+
                    "INIT=RUNSCRIPT FROM 'create.sql'","sa","");

            connection = configuracaoJDBC.getConnection();
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            log.debug("Buscando todos os produtos do banco");

            while (resultSet.next()) {
                produtos.add(criarObjetoProduto(resultSet));
            }
        }
        catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        finally {
            log.debug("Fechando conexão com o banco de dados");
            statement.close();
        }
        return produtos;
    }

    @Override
    public void alterar(Produto produto) throws SQLException {
        log.debug("Abrindo conexão no banco de dados");
        Connection connection = null;
        String sqlUpdate = String.format("UPDATE produto set valor = '%s' WHERE id = '%s';",
                produto.getValor(), produto.getId());
        try {
            log.info("Alterando o valor do produto: "+produto.getId());
            configuracaoJDBC = new ConfiguracaoJDBC("org.h2.Driver", "jdbc:h2:~/ecommerce;"+
                    "INIT=RUNSCRIPT FROM 'create.sql'","sa","");

            connection = configuracaoJDBC.getConnection();
            Statement statement = connection.createStatement();
            statement.execute(sqlUpdate);

        }
        catch (Exception e) {
            e.printStackTrace();
            log.error("Erro ao alterar o produto: "+e.getMessage());
        }
        finally {
            log.debug("Fechando conexão com o banco de dados");
            connection.close();
        }
    }

    @Override
    public Optional<Produto> buscarPorId(int id) throws SQLException{
        log.debug("Abrindo conexão no banco de dados");
        Connection connection = null;
        Statement statement = null;
        String query = String.format("SELECT * FROM produto WHERE id = %s",id);
        Produto produto = null;

        try {
            log.info("Buscando o produto por id: "+id);
            configuracaoJDBC = new ConfiguracaoJDBC("org.h2.Driver", "jdbc:h2:~/ecommerce;"+
                    "INIT=RUNSCRIPT FROM 'create.sql'","sa","");

            connection = configuracaoJDBC.getConnection();
            statement = connection.createStatement();
            ResultSet resultado = statement.executeQuery(query);

            while (resultado.next()) {
                produto = criarObjetoProduto(resultado);
            }

        }
        catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        finally {
            log.debug("Fechando a conexão com o banco");
            statement.close();
        }
        return produto != null ? Optional.of(produto) : Optional.empty();
    }


    @Override
    public void excluir(int id) throws SQLException {
        log.debug("Abrindo conexão no banco de dados");
        Connection connection = null;
        Statement statement = null;
        String sqlDelete = String.format("DELETE FROM produto WHERE id = %s",id);

        try {
            log.info("Excluindo o produto com id: "+id);
            configuracaoJDBC = new ConfiguracaoJDBC("org.h2.Driver", "jdbc:h2:~/ecommerce;"+
                    "INIT=RUNSCRIPT FROM 'create.sql'","sa","");

            connection = configuracaoJDBC.getConnection();
            statement = connection.createStatement();
            statement.execute(sqlDelete);
        }
        catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        finally {
            log.debug("Fechando a conexão com o banco");
            connection.close();
        }
    }

    private Produto criarObjetoProduto(ResultSet resultado) throws SQLException{

        Integer id = resultado.getInt(1);
        String nomeProduto = resultado.getString(2);
        double valor = resultado.getDouble(3);

        return new Produto(id, nomeProduto, valor);
    }
}

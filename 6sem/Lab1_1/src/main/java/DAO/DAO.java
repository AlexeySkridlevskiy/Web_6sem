package DAO;

import Connector.ConnectorException;
import Connector.MyConnector;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

public class DAO {
    private MyConnector connector;

    private Statement statement;

    private ResultSet result;

    public DAO() throws ConnectorException {
        var resource = ResourceBundle.getBundle("properties");
        String url = resource.getString("url");
        String username = resource.getString("user");
        String password = resource.getString("password");

        this.connector = new MyConnector(url, username, password);
    }

    public void createStatement() throws DAOExceptions {
        try {
            this.statement = this.connector.getConnection().createStatement();
        } catch (SQLException e) {
            throw new DAOExceptions("Do not create Statement!", e);
        }
    }

    public void makeSelect(String sql) throws DAOExceptions{
        try {
            this.result = this.statement.executeQuery(sql);
        } catch (SQLException dao){
            throw new DAOExceptions("Result is not correct", dao);
        }
    }

    public void close(){
        this.getConnector().close();
        try{
            if(this.getStatement()!=null)
                this.getStatement().close();
            if(this.getResult()!=null)
                this.getResult().close();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    public MyConnector getConnector(){
        return connector;
    }

    public Statement getStatement(){
        return statement;
    }

    public ResultSet getResult(){
        return result;
    }
}

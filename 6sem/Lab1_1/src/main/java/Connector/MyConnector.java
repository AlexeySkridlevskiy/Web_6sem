package Connector;

import java.sql.*;

public class MyConnector {
    private Connection connection;

    public MyConnector(String url, String username, String password) throws ConnectorException{

        try{
            System.out.println("connect...");
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException throwable){
            throw new ConnectorException("Do not make connection!", throwable);
        }
    }

    public Connection getConnection(){
        return connection;
    }

    public void close() {
        if(connection != null){
            try{
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

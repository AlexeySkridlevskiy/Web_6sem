package Connector;

import java.sql.SQLException;

public class ConnectorException extends Exception{
    public ConnectorException(String message, SQLException throwable){
        super(message);
    }

    @Override
    public String getMessage(){
        return super.getMessage();
    }

    @Override
    public void printStackTrace(){
        super.printStackTrace();
    }

}

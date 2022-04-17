package DAO;

import java.sql.SQLException;

public class DAOExceptions extends Exception {
    public DAOExceptions(String message, SQLException throwable){
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

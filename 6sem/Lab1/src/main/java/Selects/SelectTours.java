package Selects;

import DAO.*;
import models.*;
import models.Type;

import java.sql.SQLException;
import java.util.ArrayList;

public class SelectTours {

    private String sql = "SELECT * FROM Tour";

    public SelectTours(){

    }

    public ArrayList<Tour> getSelect(DAO dao) throws DAOExceptions{
        ArrayList<Tour> result = new ArrayList<>();
        dao.createStatement();
        dao.makeSelect(sql);
        try {
            int columnIndex = 0;
            while (dao.getResult().next()){
                result.add(new Tour(
                        dao.getResult().getInt("id"),
                        dao.getResult().getString("Title"),
                        Type.valueOf(dao.getResult().getString("Type")),
                        dao.getResult().getBoolean("hotTour"),
                        dao.getResult().getInt("TouragentId")
                ));
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return result;
    }

}

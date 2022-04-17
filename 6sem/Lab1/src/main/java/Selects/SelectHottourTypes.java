package Selects;

import DAO.*;
import models.HottourTypes;
import models.Tour;
import models.Type;

import java.sql.SQLException;
import java.util.ArrayList;

public class SelectHottourTypes {
    private String sql = "SELECT tour.title, tour.type, tour.hottour, touragent.name " +
            "FROM tour INNER JOIN touragent ON tour.touragentid = touragent.id " +
            "WHERE tour.hottour = true AND tour.type = 'REST'";

    public SelectHottourTypes(){

    }

    public ArrayList<HottourTypes> getSelect(DAO dao) throws DAOExceptions {
        ArrayList<HottourTypes> result = new ArrayList<>();
        dao.createStatement();
        dao.makeSelect(sql);
        try {
            int columnIndex = 0;
            while (dao.getResult().next()){
                result.add(new HottourTypes(
                        dao.getResult().getString("Title"),
                        Type.valueOf(dao.getResult().getString("Type")),
                        dao.getResult().getBoolean("hotTour"),
                        dao.getResult().getString("Name")
                ));
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return result;
    }
}

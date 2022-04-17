package Selects;

import DAO.*;
import models.HottourTypes;
import models.SelectedTours;
import models.Type;

import java.sql.SQLException;
import java.util.ArrayList;

public class SelectSelectedTours {
    private String sql = "SELECT client.name AS clientname, client.surname AS clientSurname, " +
            "tour.title AS tourTitle, tour.type, tour.hottour, touragent.name AS touragentName " +
            "FROM client INNER JOIN clienttour ON client.id = clienttour.clientid INNER JOIN tour " +
            "ON clienttour.tourid = tour.id INNER JOIN touragent ON tour.touragentid = touragent.id " +
            "WHERE client.name = 'Alex'";

    public SelectSelectedTours(){

    }

    public ArrayList<SelectedTours> getSelect(DAO dao) throws DAOExceptions {
        ArrayList<SelectedTours> result = new ArrayList<>();
        dao.createStatement();
        dao.makeSelect(sql);
        try {
            int columnIndex = 0;
            while (dao.getResult().next()){
                result.add(new SelectedTours(
                        dao.getResult().getString("clientname"),
                        dao.getResult().getString("clientsurname"),
                        dao.getResult().getString("tourtitle"),
                        Type.valueOf(dao.getResult().getString("Type")),
                        dao.getResult().getBoolean("hotTour"),
                        dao.getResult().getString("touragentName")
                ));
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return result;
    }
}

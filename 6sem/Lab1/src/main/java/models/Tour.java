package models;

import lombok.Data;

@Data
public class Tour {

    private int id;

    private String Title;

    public Type Type;

    private boolean hotTour;

    private int touragentId;

    public Tour(){

    }

    public Tour(int id, String Title, Type type, boolean hotTour, int touragentId) {
        this.id = id;
        this.Title = Title;
        this.Type = type;
        this.hotTour = hotTour;
        this.touragentId = touragentId;
    }
}

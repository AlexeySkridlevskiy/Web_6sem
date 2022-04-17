package models;

import lombok.Data;

@Data
public class HottourTypes {

    private String Title;

    public Type Type;

    private boolean hotTour;

    private String name;

    public HottourTypes(String Title, Type type, boolean hotTour, String name){
        this.Title = Title;
        this.Type = type;
        this.hotTour = hotTour;
        this.name = name;
    }
}

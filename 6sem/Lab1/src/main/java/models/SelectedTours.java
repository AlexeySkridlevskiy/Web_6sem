package models;

import lombok.Data;

@Data
public class SelectedTours {

    private String name;

    private String surname;

    private String title;

    private Type type;

    private boolean hotTour;

    private String touragentName;

    public SelectedTours(String name, String surname, String title, Type type, boolean hotTour,
                         String touragentName){
        this.name = name;
        this.surname = surname;
        this.title = title;
        this.type = type;
        this.hotTour = hotTour;
        this.touragentName = touragentName;
    }
}

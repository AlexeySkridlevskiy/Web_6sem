package models;

public enum Type{
    REST ("rest"),
    EXCURS ("excurs"),
    SHOPPING ("shopping");
    private String tourName;

    Type(String name){
        tourName = name;
    }

    public void setString(String string) {
        this.tourName = string;
    }

    public String toString() {
        return this.tourName;
    }
}
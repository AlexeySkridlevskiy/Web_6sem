package models;

import lombok.Data;

@Data
public class ClientTour {
    private int id;

    private int clientId;

    private int tourId;
}

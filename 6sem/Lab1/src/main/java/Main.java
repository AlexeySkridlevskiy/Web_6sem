import Connector.ConnectorException;
import DAO.*;
import Selects.SelectHottourTypes;
import Selects.SelectSelectedTours;
import Selects.SelectTours;
import models.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ConnectorException, DAOExceptions {

        Scanner scanner = new Scanner(System.in);
        int choose;
        System.out.println("Enter your choice: ");
        choose = scanner.nextInt();
        if (choose == 1){
            DAO dao = new DAO();
            SelectTours tours = new SelectTours();
            ArrayList<Tour> answer = tours.getSelect(dao);
            for (int i = 0; i<answer.size(); i++){
                System.out.println(answer.get(i));
            }
        }
        else if(choose == 2){
            DAO dao = new DAO();
            SelectSelectedTours selectSelectedTours = new SelectSelectedTours();
            ArrayList<SelectedTours> answer = selectSelectedTours.getSelect(dao);
            for (int i = 0; i<answer.size(); i++){
                System.out.println(answer.get(i));
            }
        } else if(choose == 3){
            DAO dao = new DAO();
            SelectHottourTypes hottourTypes = new SelectHottourTypes();
            ArrayList<HottourTypes> answer = hottourTypes.getSelect(dao);
            for (int i = 0; i<answer.size(); i++){
                System.out.println(answer.get(i));
            }
        }
    }
}

package ex_28072024;

public class Lab155_Building {
    public static void main(String[] args) {

        //Class -A - data Types - Primitive or non primitive.
        //Class - Behaviour/ Methods - functions

        //Object - real entity - class -
        //ClassName classRef = new ClassName();

        BuildingBP dlf = new BuildingBP();
        dlf.name ="DLF Pvt Builder";
        dlf.noOfRooms=10;

        dlf.uselift();

        BuildingBP prestige = new BuildingBP();
        prestige.name = "Prestige Pvt Builder";
        prestige.noOfRooms =100;

        prestige.activities();
    }
}

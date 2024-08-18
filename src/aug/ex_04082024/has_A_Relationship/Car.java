package aug.ex_04082024.has_A_Relationship;

public class Car {
    void StartTheCar()
    {
        //Aggregation  -  has A relationship
        new Engine().start();
        new Tyres().rolling();
    }
}

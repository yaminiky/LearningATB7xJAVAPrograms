package aug.ex_04082024.access_Modifiers.Police;

public class Cop  {
    private int gun;
    private String idCard;

    Cop(int gun)
    {
        this.gun= gun;

    }
    protected void canIShoot()
    {
        System.out.println("Yes, You can !!");

    }
}

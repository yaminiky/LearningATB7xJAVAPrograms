package aug.ex_04082024.access_Modifiers.criminal;

import aug.ex_04082024.access_Modifiers.Police.Cop;

public class Thief {
    public static void main(String[] args) {
        Cop c = new Cop(100);
        System.out.println(c.gun);
       // c.canIShoot();

    }
}

package aug.ex_04082024.singleinheritance;

public class Lab172 {
    public static void main(String[] args) {
        Son s = new Son();
        s.bhk3();
        s.bhk2();

        Father f = new Father();
        f.bhk2();
        s.bhk3();
    }
}

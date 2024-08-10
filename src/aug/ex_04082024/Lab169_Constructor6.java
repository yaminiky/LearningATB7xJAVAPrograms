package aug.ex_04082024;

public class Lab169_Constructor6 {
    public static void main(String[] args) {
        ATBPerson p1 = new ATBPerson("Prabhandh");
        ATBPerson p2 = new ATBPerson("Bobby");
        ATBPerson p3 = new ATBPerson("Suresh",987654321);

        System.out.println(p1.name);
        System.out.println(p1.phone);
        System.out.println(p2.name);
        System.out.println(p2.phone);
        System.out.println(p3.name);
        System.out.println(p3.phone);
    }
}

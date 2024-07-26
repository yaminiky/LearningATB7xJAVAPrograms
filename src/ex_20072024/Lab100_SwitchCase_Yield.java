package ex_20072024;

public class Lab100_SwitchCase_Yield {
    public static void main(String[] args) throws IllegalAccessException {
        char code = 'A';
        int val = switch (code)
        {
            case 'A' :
                yield 65;  //yield is similar to return
            default:
                throw new IllegalAccessException("unexpected value :" +code);
        };
        System.out.println(val);
    }
}

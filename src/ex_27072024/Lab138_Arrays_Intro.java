package ex_27072024;

public class Lab138_Arrays_Intro {
    public static void main(String[] args) {
        int[] marks_10_board = {87,67,85,86,56,45};
        //Here elements are fixed
        //length is 6
        //index 1 to 5
        //who is present in index 3  --  86
        System.out.println(marks_10_board.length);
        System.out.println(marks_10_board[3]);  //86
        System.out.println(marks_10_board[0]);  //87
        System.out.println(marks_10_board[-1]);  // ArrayIndexOurOfBoundsException

    }
}

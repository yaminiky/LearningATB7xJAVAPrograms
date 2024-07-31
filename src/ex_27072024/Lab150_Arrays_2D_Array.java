package ex_27072024;

public class Lab150_Arrays_2D_Array {
    public static void main(String[] args) {
        int [][] array_2d = { {20,30},{40,50},{60,70}};

        int row = array_2d.length;
        for(int i=0; i<row; i++)
        {
            for (int j=0; j < array_2d[i].length; j++)
            {
                System.out.print(array_2d[i][j]);
                System.out.print("   ");
            }
            System.out.println("");
        }
    }
}

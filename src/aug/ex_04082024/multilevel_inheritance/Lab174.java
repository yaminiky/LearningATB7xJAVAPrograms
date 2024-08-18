package aug.ex_04082024.multilevel_inheritance;

import aug.ex_04082024.singleinheritance.Son;

public class Lab174 {
    public static void main(String[] args) {
        // Multilevel Inheritance

        //Grand Father  -->  Father    -->   Son
        Child c1 = new Child();
        c1.home();  //  it allows first local function
        //if the function name is same then the  priority goes to  child   -- Father    --- GrandFather
        //if the function name is different then it will allow all the functions available in the child  --  father  --  grandfather
        c1.cf();
        c1.ff();
        c1.gf();
        c1.extra();

    }
}

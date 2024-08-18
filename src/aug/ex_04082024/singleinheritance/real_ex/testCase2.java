package aug.ex_04082024.singleinheritance.real_ex;

public class testCase2 extends BaseTest{
    void testCase2()
    {
        startBrowser();   // from BaseTest
        getDataFromSQL(); // from GrandBaseTest
        System.out.println(gold);  // from GrandBaseTest
        closeBrowser();
    }

    public static void main(String[] args) {
        new testCase2().testCase2();
    }
}

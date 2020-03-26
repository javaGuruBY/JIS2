import by.serg.service.NumberService;

public class NumberServiceTest {

    public void rangeSumTest(int start, int finish, int expected) {
        NumberService numberService = new NumberService();
        int actual = numberService.rangeSum(start, finish);
        if (actual == expected) {
            System.out.println("RangeSumTest has passed");
        } else {
            System.out.println("RangeSumTest has failed, expected was " + expected + ", but actual is " + actual);
        }
    }

    public void rangeEvenCountTest(int start, int finish, int expected) {
        NumberService numberService = new NumberService();
        int actual = numberService.rangeEvenCount(start, finish);
        if (actual == expected) {
            System.out.println("RangeEvenCountTest has passed");
        } else {
            System.out.println("RangeEvenCountTest has failed, expected was " + expected + ", but actual is " + actual);
        }
    }

    public static void main(String[] args) {
        NumberServiceTest numberServiceTest = new NumberServiceTest();
        numberServiceTest.rangeSumTest(1,10, 55);
        numberServiceTest.rangeSumTest(10,1, 55);
        numberServiceTest.rangeSumTest(-1,290, 42194);
        numberServiceTest.rangeSumTest(1000,1000, 1000);
        numberServiceTest.rangeEvenCountTest(0,10,6);
        numberServiceTest.rangeEvenCountTest(10,10,1);
        numberServiceTest.rangeEvenCountTest(10,0,6);
        numberServiceTest.rangeEvenCountTest(1,1,0);
    }
}

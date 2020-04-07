
package acya.ki.service;

import acya.ki.bean.SignComporatorBean;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SignComporatorTest2 {

    @Test
    public void compare() {

        SignComporator signComporator = new SignComporator();
        SignComporatorBean positiveNumber = new SignComporatorBean(7);
        SignComporatorBean negativeNumber = new SignComporatorBean(-7);
        SignComporatorBean numberEqualToZero = new SignComporatorBean(0);

        Assert.assertEquals("Number is positive", signComporator.compare(positiveNumber));
        Assert.assertEquals("Number is negative", signComporator.compare(negativeNumber));
        Assert.assertEquals("Number = 0", signComporator.compare(numberEqualToZero));

        resultTest("Number is positive");
        resultTest("Number is negative");
        resultTest("Number is equal to zero");

    }

    public static void resultTest(String testName) {
        System.out.println(testName + ": Test  has been passed!");

    }

}

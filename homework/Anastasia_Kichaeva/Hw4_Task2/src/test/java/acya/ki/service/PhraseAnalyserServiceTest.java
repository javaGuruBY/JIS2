package acya.ki.service;

import acya.ki.bean.PhraseAnalyserBean;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhraseAnalyserServiceTest {

    @Test
    void analyse() {
        PhraseAnalyserBean theFirstText = new PhraseAnalyserBean("Make great again");
        PhraseAnalyserBean theSecondText = new PhraseAnalyserBean("Doing great again");
        PhraseAnalyserBean theThirdText = new PhraseAnalyserBean("I love cats!");

        PhraseAnalyserService phraseAnalyserService = new PhraseAnalyserService();

        Assert.assertEquals("It stands no chance", phraseAnalyserService.analyse(theFirstText));
        Assert.assertEquals("It could be worse", phraseAnalyserService.analyse(theSecondText));
        Assert.assertEquals("It is fine, really", phraseAnalyserService.analyse(theThirdText));

        resultTest("First test");
        resultTest("Second Test");
        resultTest("Third Test");
    }
    public void resultTest(String testName){
        System.out.println(testName + ": has been passed!");
    }
}
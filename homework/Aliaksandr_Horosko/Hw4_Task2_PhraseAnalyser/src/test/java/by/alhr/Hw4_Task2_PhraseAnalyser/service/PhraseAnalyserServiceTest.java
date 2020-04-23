package by.alhr.Hw4_Task2_PhraseAnalyser.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhraseAnalyserServiceTest {

    @Test
    public void analyse() {
        PhraseAnalyserService phraseTest = new PhraseAnalyserService();
        String phraseTest1 ="Make bla bla bla great again";
        String phraseTest2 = "Make ek makarek";
        String phraseTest3 ="Vot ento bred";

        String expected1 = "It stands no chance";
        String actual1 = phraseTest.analyse(phraseTest1);
        assertEquals(expected1, actual1);

        String expected2 = "It could be worse";
        String actual2 = phraseTest.analyse(phraseTest2);
        assertEquals(expected2, actual2);

        String expected3 = "It is fine, really";
        String actual3 = phraseTest.analyse(phraseTest3);
        assertEquals(expected3, actual3);
    }

}
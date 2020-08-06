package acya.ki;

import acya.ki.bean.PhraseAnalyserBean;
import acya.ki.service.PhraseAnalyserService;

public class PhraseAnalyserDemo {
    public static void main(String[] args) {

        PhraseAnalyserBean demoText = new PhraseAnalyserBean("Make lalala great again");
        PhraseAnalyserService phraseAnalyserService = new PhraseAnalyserService();
        phraseAnalyserService.analyse(demoText);

        phraseAnalyserService.resultDemo(demoText);

    }
}

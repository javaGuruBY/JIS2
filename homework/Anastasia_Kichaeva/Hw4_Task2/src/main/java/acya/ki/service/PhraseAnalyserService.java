package acya.ki.service;

import acya.ki.bean.PhraseAnalyserBean;

public class PhraseAnalyserService {
    private PhraseAnalyserBean phraseAnalyserBean;

    public PhraseAnalyserService() {
    }

    public PhraseAnalyserService(PhraseAnalyserBean phraseAnalyserBean) {
        this.phraseAnalyserBean = phraseAnalyserBean;
    }

    public String analyse(PhraseAnalyserBean phraseAnalyserBean) {
        if (phraseAnalyserBean.getText().startsWith("Make") && phraseAnalyserBean.getText().endsWith("great again")){
            return "It stands no chance";
        } else if (phraseAnalyserBean.getText().startsWith("Make") || phraseAnalyserBean.getText().endsWith("great again")){
            return "It could be worse";
        } else {
            return "It is fine, really";
        }
    }

    public void resultDemo(PhraseAnalyserBean phraseAnalyserBean){
        if (phraseAnalyserBean.getText().startsWith("Make") && phraseAnalyserBean.getText().endsWith("great again")){
            System.out.println(phraseAnalyserBean.getText() + ": It stands no chance");
        } else if (phraseAnalyserBean.getText().startsWith("Make") || phraseAnalyserBean.getText().endsWith("great again")){
            System.out.println(phraseAnalyserBean.getText() + ": It could be worse");
        } else {
            System.out.println(phraseAnalyserBean.getText() + ": It is fine, really");
        }

    }

}

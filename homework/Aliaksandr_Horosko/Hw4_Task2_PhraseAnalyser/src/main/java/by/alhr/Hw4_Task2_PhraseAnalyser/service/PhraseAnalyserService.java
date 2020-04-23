package by.alhr.Hw4_Task2_PhraseAnalyser.service;

public class PhraseAnalyserService implements Runnable {

    public String analyse(String text) {
        if (text.startsWith("Make") & text.endsWith("great again")) {
            return ("It stands no chance");
        } else if (text.startsWith("Make") || text.endsWith("great again")) {
            return ("It could be worse");
        } else {
            return ("It is fine, really");
        }
    }

    @Override
    public void run() {

        PhraseAnalyserService phrase = new PhraseAnalyserService();
        String phrase1 = "Make this great again";
        String phrase2 = "Make this car today";
        String phrase3 = "good time of the year";

        phrase.analyse(phrase1);
        phrase.analyse(phrase2);
        phrase.analyse(phrase3);
    }
}

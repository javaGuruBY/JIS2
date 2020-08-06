package acya.ki.bean;

import java.io.Serializable;
import java.util.Objects;

public class PhraseAnalyserBean implements Serializable {

    private String text;

    public PhraseAnalyserBean() {
    }

    public PhraseAnalyserBean(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PhraseAnalyserBean)) return false;
        PhraseAnalyserBean that = (PhraseAnalyserBean) o;
        return Objects.equals(text, that.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text);
    }

    @Override
    public String toString() {
        return "PhraseAnalyserBean{" +
                "text='" + text + '\'' +
                '}';
    }
}

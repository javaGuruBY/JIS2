package acya.ki.bean;

import java.io.Serializable;
import java.util.Objects;

public class LightColorDetectorBean implements Serializable {
    private int waveLength;

    public LightColorDetectorBean() {
    }

    public LightColorDetectorBean(int waveLength) {
        this.waveLength = waveLength;
    }

    public int getWaveLength() {
        return waveLength;
    }

    public void setWaveLength(int waveLength) {
        this.waveLength = waveLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LightColorDetectorBean)) return false;
        LightColorDetectorBean that = (LightColorDetectorBean) o;
        return waveLength == that.waveLength;
    }

    @Override
    public int hashCode() {
        return Objects.hash(waveLength);
    }

    @Override
    public String toString() {
        return "LightColorDetectorBean{" +
                "waveLength=" + waveLength +
                '}';
    }
}

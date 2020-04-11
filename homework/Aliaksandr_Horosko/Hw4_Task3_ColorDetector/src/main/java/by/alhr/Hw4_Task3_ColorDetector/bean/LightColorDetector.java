package by.alhr.Hw4_Task3_ColorDetector.bean;

import java.io.Serializable;
import java.util.Objects;

public class LightColorDetector implements Serializable {
    private int wavelength;

    public LightColorDetector() {
    }

    public LightColorDetector(int wavelength) {
        this.wavelength = wavelength;
    }

    public int getWavelength() {
        return wavelength;
    }

    public void setWavelength(int wavelength) {
        this.wavelength = wavelength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LightColorDetector that = (LightColorDetector) o;
        return wavelength == that.wavelength;
    }

    @Override
    public int hashCode() {
        return Objects.hash(wavelength);
    }

    @Override
    public String toString() {
        return "LightColorDetector{" +
                "wavelength=" + wavelength +
                '}';
    }
}

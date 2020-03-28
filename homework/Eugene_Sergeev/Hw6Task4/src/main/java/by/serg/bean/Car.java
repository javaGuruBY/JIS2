package by.serg.bean;

import java.io.Serializable;
import java.util.Objects;

public class Car implements Serializable {
    private String model;
    private String color;
    private int maxSpeed;
    private int currentSpeed = 0;

    public void accelerate(int targetSpeed) {
        for (int i = currentSpeed; i <= targetSpeed; i++) {
            if(currentSpeed >= maxSpeed) {
                break;
            }
            currentSpeed++;
        }
    }

    public void decelerate(int targetSpeed) {
        for (int i = currentSpeed; i >= targetSpeed; i--) {
            if(currentSpeed == 0) {
                break;
            }
            currentSpeed--;
        }
    }

    public boolean isDriving() {
        if(currentSpeed > 0) {
            return true;
        }
        return false;
    }

    public boolean isStopped() {
        if(currentSpeed == 0) {
            return true;
        }
        return false;
    }

    public boolean canAccelerate() {
        if(currentSpeed < maxSpeed) {
            return true;
        }
        return false;
    }

    public Car() {
    }

    public Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return maxSpeed == car.maxSpeed &&
                currentSpeed == car.currentSpeed &&
                Objects.equals(model, car.model) &&
                Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, color, maxSpeed, currentSpeed);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", currentSpeed=" + currentSpeed +
                '}';
    }
}

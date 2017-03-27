package d0327.jessie;

import java.util.*;

/**
 * Created by Administrator on 2017/3/27.
 */
public class SetSortTest {
    public static void main(String[] args) {
        Car c1 = new Car("Benz", 280, 4);
        Car c2 = new Car("BMW", 300, 2);
        Car c3 = new Car("Audi", 240, 5);
        List<Car> cars = new ArrayList<Car>();
        cars.add(c1);
        cars.add(c2);
        cars.add(c3);
        Collections.sort(cars);
        System.out.println(cars.toString());
    }
}

class Car implements Comparable {
    private String name;
    private double maxSpeed;
    private int capacity;

    public Car() {
    }

    public Car(String name, double maxSpeed, int capacity) {
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", capacity=" + capacity;
    }

    @Override
    public int compareTo(Object o) {
        Car c = (Car) o;
        if (this.capacity > c.capacity) {
            return 1;
        } else {
            return -1;
        }
    }
}

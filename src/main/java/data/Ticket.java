package data;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Ticket {
    private String name;
    private String type;
    private String time;
    private String transport;
    private String meal;
    private int cost;

    public Ticket(String name, String type, String time, String transport, String meal, int cost) {
        this.name = name;
        this.type = type;
        this.time = time;
        this.transport = transport;
        this.meal = meal;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public String getMeal() {
        return meal;
    }

    public void setMeal(String meal) {
        this.meal = meal;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", time='" + time + '\'' +
                ", transport='" + transport + '\'' +
                ", meal='" + meal + '\'' +
                ", cost=" + cost +
                '}';
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}

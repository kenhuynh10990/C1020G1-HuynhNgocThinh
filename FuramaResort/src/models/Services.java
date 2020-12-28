package models;

import java.util.Comparator;

public abstract class Services implements Comparable<Services> {
    private String id;
    private String nameServices;
    private double areaUsed;
    private double fee;
    private int maxPeople;
    private String typeRent;

    public Services() {
    }

    public Services(String id, String nameServices, double areaUsed, double fee, int maxPeople, String typeRent) {
        this.id = id;
        this.nameServices = nameServices;
        this.areaUsed = areaUsed;
        this.fee = fee;
        this.maxPeople = maxPeople;
        this.typeRent = typeRent;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameServices() {
        return nameServices;
    }

    public void setNameServices(String nameServices) {
        this.nameServices = nameServices;
    }

    public double getAreaUsed() {
        return areaUsed;
    }

    public void setAreaUsed(double areaUsed) {
        this.areaUsed = areaUsed;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getTypeRent() {
        return typeRent;
    }

    public void setTypeRent(String typeRent) {
        this.typeRent = typeRent;
    }

    public abstract String showInfor();

    @Override
    public String toString() {
        return "Id='" + id + '\'' +
                ", Name Services='" + nameServices + '\'' +
                ", Area Used=" + areaUsed +
                ", fee=" + fee +
                ", Max People=" + maxPeople +
                ", Type Rent='" + typeRent + '\''
                ;
    }
}

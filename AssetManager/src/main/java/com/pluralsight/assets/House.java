package com.pluralsight.assets;

public class House extends Asset {
    private String address;
    private int condition;
    private int squareFoot;
    private int lotSize;

    public House(String description, String dateAcquired, double originalCost, String address, int condition, int squareFoot, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }
    @Override
    public double getValue() {
        double value = 0;
        switch (condition) {
            case 1 -> {
                value = squareFoot * 180;// Excellent
            }
            case 2 -> {
                value = squareFoot * 130;// Good
            }
            case 3 -> {
                value = squareFoot * 90;// Fair
            }
            case 4 -> {
                value = squareFoot * 80;// Poor
            }
            default -> {
                return -1;
            }
        }
        value += .25 * lotSize;
        return value;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }
}

package com.pluralsight.assets;

import java.time.LocalDate;

public class Vehicle extends Asset{
    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    @Override
    public double getValue() {
        double value = getOriginalCost();
        int yearsOld = year - Integer.parseInt(getDateAcquired());
        if (yearsOld <= 3) {
            value -= value * .03;
        } else if (yearsOld > 3 && yearsOld <= 6) {
            value -= value * .06;
        }
        else if (yearsOld > 6 && yearsOld <= 10) {
            value -= value * .08;
        } else if (yearsOld > 10) {
            value = 1000;
        }
        if (!makeModel.toLowerCase().contains("honda") && !makeModel.toLowerCase().contains("toyota") && odometer > 100000) {
            value -= value * .25;
        }
        return value;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }
}

package com.pluralsight.assets;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        ArrayList<Asset> assets = new ArrayList<>();
        assets.add(new House("Vacation home", "2023-10-31", 300000, "123 main street",
                1, 12000, 20000));
        assets.add(new House("Lake house", "2021-01-23", 250000, "543 king rd",
                2, 10000, 30000));

        assets.add(new Vehicle("Work truck", "2020", 25000, "Toyota Tacoma",
                2024, 75000));
        assets.add(new Vehicle("Business limo", "2015", 60000, "GLS Maybach Sprinter",
                2024, 123000));

        for (Asset a : assets) {
            System.out.printf("%s originally costed %.2f and is now valued at %.2f\n", a.getDescription(),
                    a.getOriginalCost(), a.getValue());
            if (a instanceof House) {
                System.out.printf("The house at %s is %d square feet and was acquired on %s\n\n", ((House) a).getAddress(),
                        ((House) a).getSquareFoot(), a.getDateAcquired());
            }
            if (a instanceof Vehicle) {
                System.out.printf("The %s was acquired on %s for %.2f. It now has a value of %.2f in %d with a mileage of %d\n\n",
                        ((Vehicle) a).getMakeModel(), a.getDateAcquired(), a.getOriginalCost(),
                        a.getValue(), ((Vehicle) a).getYear(), ((Vehicle) a).getOdometer());
            }
        }
    }
}

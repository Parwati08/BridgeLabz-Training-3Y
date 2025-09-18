package ProgrammingPractice.Level1;

public class EarthVolume {
    public static void main(String[] args) {

        // Fixed values
        double radiusKm = 6378;
        double kmToMileFactor = 1.6; // 1 mile = 1.6 km
        double pi = 3.14159265359;

        // Results
        double volumeKm3 = (4.0 / 3) * pi * Math.pow(radiusKm, 3);
        double radiusMiles = radiusKm / kmToMileFactor;
        double volumeMiles3 = (4.0 / 3) * pi * Math.pow(radiusMiles, 3);

        // Output
        System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 +
                           " and cubic miles is " + volumeMiles3);
    }
}

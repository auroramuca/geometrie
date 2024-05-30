// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        class Rectangle {

            public static double calculateSurface(double length, double width) {
                return length * width;
            }

            public static void main(String[] args) {
                double length = 5;
                double width = 3;
                double surfaceArea = calculateSurface(length, width);
                System.out.println("Die Flaeche ist: " + surfaceArea);
            }
        }

    }
}
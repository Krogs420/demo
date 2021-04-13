public class RandomShit {
    public static void newLine() {
        System.out.println();
    }
    public static void threeLine() {
        System.out.println();
        System.out.println();
        System.out.println();
    }

    public static void main(String[] args) {

        System.out.println("First name: Kristian");
        newLine();
        System.out.println("Last name: Kryger");

        System.out.println("\nFirst name: Kristian");
        threeLine();
        System.out.println("Last name: Kryger");

        double radians = Math.toRadians(180.0);
        double degrees = 90;
        double angle = degrees / 180.0 * Math.PI;

        // This is used for rounding numbers up or down
        long x = Math.round(Math.PI * 29.0);
        System.out.println("\n" + x);

        // This statement divides Math.PI by 2, adds the result to angle and computes the cosine of the sum
        double y = Math.cos(angle + Math.PI / 2.0);
        System.out.println("\n" + y);



    }
}

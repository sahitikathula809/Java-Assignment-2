public class TriangleArea {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java TriangleArea a b c");
            return;
        }

        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);

        double s = (a + b + c) / 2;

        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.println("The area of the triangle with side lengths a=" + a + ", b=" + b + ", and c=" + c + " is: " + area);
    }
}

public class EuclideanDistance {
    public static void main(String[] args) {
        if (args.length != 4) {
            System.out.println("Usage: java EuclideanDistance x1 y1 x2 y2");
            return;
        }

        double x1 = Double.parseDouble(args[0]);
        double y1 = Double.parseDouble(args[1]);
        double x2 = Double.parseDouble(args[2]);
        double y2 = Double.parseDouble(args[3]);

        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.println("The Euclidean distance between (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is: " + distance);
    }

    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        double deltaX = x2 - x1;
        double deltaY = y2 - y1;
        double distance = Math.sqrt(deltaX * deltaX + deltaY * deltaY);
        return distance;
    }
}

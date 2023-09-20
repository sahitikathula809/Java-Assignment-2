public class Distance {
    public static void main(String[] args) {
        int val1 = Integer.parseInt(args[0]);
        int val2 = Integer.parseInt(args[1]);
        double distance = Math.sqrt(val1*val1 + val2*val2);
        System.out.println("distance: " + distance);
    }
}
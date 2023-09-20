public class SumOfTwoDice {
    public static void main(String[] args) {
        int Sides = 6;
        int val1 = 1 + (int) (Math.random() * Sides);
        int val2 = 1 + (int) (Math.random() * Sides);
        int sum = val1 + val2;
        System.out.println(sum);
    }
}
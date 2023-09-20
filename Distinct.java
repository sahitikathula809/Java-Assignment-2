public class Distinct {
    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int d = Integer.parseInt(args[3]);
        int e = Integer.parseInt(args[4]);

        int[] values = {a, b, c, d, e};

        java.util.Arrays.sort(values);
        System.out.println("Median :"+ values[2]);

    }
    
}

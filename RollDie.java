public class RollDie {
public static void main(String[] args) {
        int SIDES = 6;   
        System.out.println(Math.random());
        int roll = (int) (Math.random() * SIDES) + 1;
        System.out.println(roll);

    }
}

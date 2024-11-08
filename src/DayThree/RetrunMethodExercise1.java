package DayThree;

public class RetrunMethodExercise1 {
    public static void main(String[] args) {
        int x = 3;
        int y = 5;

        int result = add(x,y);
        System.out.println(result);
    }
    private static int add(int x, int y) {
        int sum = x + y;
        return sum;
    }
}

package DayThree;

public class ReturnMethodExercise3 {
    public static void main(String[] args) {
        int id = 1;
        getUser(id);
    }
    private static void getUser (int id) {
        getUserFullName();
        getUserAge();
    }
    private static String getUserFullName() {
        String userFullName = "John Doe";
        return userFullName;
    }
    private static int getUserAge() {
        int age = 30;
        return age;

    }
}

package DayThree;

public class UserInfoChecker {

    public static void main(String[] args) {
        int age = 20;
        getPerson(age);

    }
    private static void getPerson(int age) {

        System.out.println("Checking user details: ");
        getName();
        checkUserAge(age);
    }

    private static void getName() {

        System.out.println("John");
    }

    private static void checkUserAge(int age) {

        if (age<18) {
            System.out.println("You are underage");
        }
        else {
            boolean canDrive = true;
            getPermissionInfo(age, canDrive, "You can drive"); // argument
        }
    }
    private static void getPermissionInfo(int age, boolean canDrive, String text) { // parameeter

        if (canDrive) {
            System.out.println("Age is: " + age + " " + text );
        }
    }
}

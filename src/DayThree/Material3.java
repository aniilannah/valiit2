package DayThree;

public class Material3 {

    // Kui koodis on korduvaid osasid, võiks mõeld, et äkki peaks nende kohta tegema eraldi meetodi

    public static void main(String[] args) {
        getUser();
    }

    // Lisame meetodi, mis prindib ekraanile Hello

    private static void getUser() { // staatilisest meetodist ei saa välja kutsuda mittestaatilist
        boolean isTrue = true;
        System.out.println("Hello");
        if (isTrue) {
            getName();
        }
    }

    private static void getName() {
        boolean isFalse = false;
        System.out.println("Hanna");
        int nr1 = 5;
        if (isFalse) {
            System.out.println("Is true!");
            getPassword();
        }
        else {
            System.out.println("Is false!");
            getPasswordTwo(nr1);
        }
    }

    private static void getPassword() {
        System.out.println("Password");
    }

    private static void getPasswordTwo(int nr1) { // overloading methods
        int nr2 = 7;
        System.out.println("Password " + nr1);

    }




    // return




}

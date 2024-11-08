package DayFour;

public class LoopExercises {
    public static void main(String[] args) {
        /*while loop

        int count = 1;
       while (count <= 5) {
          System.out.println("Count is: " + count);
          count++;
          System.out.println("Count is after count++: " + count);

       } */

      /* do-while loop

       do {
         System.out.println("Count is: " + count);
         count++;
        }
        while (count<=5); */

        /*for(int count = 1; count <= 5; count++){ // kui forloopi kasutan, siis ei ole vaja eraldi variabled esitada, ehk siis pole tarvis kirjutada eraldi int count = 1;
            System.out.println("Count: " + count);
       } */

        for(int count=1; count <=5; count++ ) {
            if(count == 3){ // Step1: Check if count is 3
            break;          // Step2: Skip the rest of the loop body for this iteration
            }
            System.out.println(count);
        }

        for(int count=1; count <=5; count++ ) {
            if(count == 3){
                continue;
            }
            System.out.println(count);
        }
    }
}

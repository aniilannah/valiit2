package DayThree;

import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {

        // int [] m = new int[10];
        // m[0] = 1;
        // m[1] = 2;
        // int length =m.length;
        // System.out.println(length);

        // int [] m2 = {1,7,3,6,2};

        // System.out.println(Arrays.toString(m));
        // System.out.println(Arrays.toString(m2));

        String [] carBrand = {"BMW", "Audi", "Honda"};
        String [] carModel = {"X5", "A3", "Civic"};

        carModel [0] = "X6";

        Arrays.sort(carBrand);
        System.out.println(Arrays.toString(carBrand));
        System.out.println(carBrand[0]+" "+carModel[0]);

        int [] firstArray = new int[5];
        firstArray[0] = 1;
        firstArray[1] = 2;
        firstArray[2] = 3;
        firstArray[3] = 4;
        firstArray[4] = 5;

        System.out.println("Initial array values: " + Arrays.toString(firstArray));
        firstArray[3]++;
        System.out.println("Initial array values: " + Arrays.toString(firstArray));


            }
        }

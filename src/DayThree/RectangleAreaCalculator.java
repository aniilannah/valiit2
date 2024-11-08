package DayThree;

public class RectangleAreaCalculator {
    public static void main(String[] args) {
        //TODO - loo uus meetod nimetusega private static void getArea, mis arvutab ristküliku pindala
        //TODO - kutsu see main meetodist välja, argumendi väärtustega 4 ja 5
        //TODO - loo uus meetod nimetusega private static void checkArea
        //TODO - kutsu checkArea() meetod välja getArea() meetodist, prindi konsooli "Area is bigger than 20"

        int a = 6;
        int b = 5;

        getArea(a, b);

            }

            public static void getArea(int a, int b) {

            int rectangleArea = a*b;

            checkArea(rectangleArea);

            }

            public static void checkArea (int rectangleArea) {

        if (rectangleArea < 20) {
            System.out.println("Area is smaller than 20");
        }
        else {
            System.out.println("Area is larger than 20");
                }

            }

        }


import java.util.Scanner;

public class ComparisonExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String input = sc.nextLine();
//        int a = sc.nextInt();
//        System.out.println(input);


        int a = 10;
        if(a <= 0) {
            System.out.println("LEFT");
        } else if(a > 30) {
            System.out.println("RIGHT");
        } else {
            System.out.println("CENTER");
        }

        int value = 123;
        switch (value) {
            case -2:
            case -1:
            case 0: {
                System.out.println("Value is 0");
                break;
            }
            case 1: {
                System.out.println("Value is 1");
                break;
            }
            default: {
                System.out.println("Default called");
            }
        }

        String name = (value == 0) ? "Ivan" : "Petr";
        System.out.println(name);
    }
}

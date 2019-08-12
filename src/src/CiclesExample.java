import java.util.Scanner;

public class CiclesExample {
    public static void main(String[] args) {
        int k = 4;
        int a = k++;
        System.out.println(k);
        int b = ++k;
        System.out.println(a + " " + b);

        int n = 100;
        int i = 0;
        while(i < n) {
            int r = i % 2;
            if(r == 1) {
                System.out.println("Нечетное число " + i);
            }
            i++;
        }

        for(int j = 0; j < n; ++j) {
            if(j % 2 == 0) {
                System.out.println("Четное число " + j);
            }
        }


//        Scanner sc = new Scanner(System.in);
//        while(true) {
//            String input = sc.nextLine();
//            if(input.equalsIgnoreCase("quit")) {
//                break;
//            }
//            System.out.println(input.toUpperCase());
//        }

        for(int j = 0; j < n ;j++) {
            if(j % 2 == 1) {
                continue;
            }
            System.out.println(j);
        }

        for(int j = 0; j < n; j++) {
            for(int t = j; t < n; t++) {
                for(int g = t; g < n; g++) {
                    System.out.println(j + " " + t + " " + g);
                }
            }
        }
    }
}

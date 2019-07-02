import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // основные операции с числами
        int a = 15;
        int b = 13;
        int sum = a + b;
        int dif = a - b;
        int mul = a * b;
        int div = a / b;
        int mod = a % b;
        sum -= b;
        System.out.println("Sum = " + sum);

        // базовая работа со строками
        String firstName = "Ivan";
        System.out.println("Length = " + firstName.length());

        String lastName = "Ivanov";
        System.out.println("First letter is " + lastName.charAt(0));

        String fullName = firstName + " " + lastName;
        String substring = fullName.substring(0, 4); // [0, 4)

        // преобразование между строками и числами
        String number = "123";
//        int integerNumber = Integer.valueOf(number);
        int integerNumber = Integer.parseInt(number);

        number = String.valueOf(integerNumber + 10);
        System.out.println("First digit is " + number.charAt(0));

        // объект для считывания
        Scanner sc = new Scanner(System.in);
        // считать следующую введенную строку
        String input = sc.nextLine();
        System.out.println("Input line = " + input);
        // считать следующее введенное число
        int inputNumber = sc.nextInt();
        System.out.println("Input number = " + inputNumber);

        int position = 12;
        if(position <= 0) {
            System.out.println("Left");
        } else if(position > 30) {
            System.out.println("Right");
        } else {
            System.out.println("Center");
        }
    }
}

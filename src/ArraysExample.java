public class ArraysExample {
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4, 5};
        int [] mas = new int[10];
        System.out.println(mas[0]);
        String [] arr = new String[10];
        System.out.println(arr[1].length());
//        System.out.println(a[0] + " " + a[a.length - 1]);

        for(int i = 0; i < array.length; i++) {
            System.out.println(i + " " + array[i]);
        }

        for(int element : array) {
            System.out.println(element);
        }
    }
}

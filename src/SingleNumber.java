import java.util.Scanner;

public class SingleNumber {
    public static int singleNumber(int[] array){
        int result = 0;
        for (int element : array){
            result = result ^ element;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size=scanner.nextInt();
        System.out.println("Enter the array elements:");
        int []array=new int[size];
        for (int i = 0; i < size; i++) {
            array[i]=scanner.nextInt();
        }
        System.out.println(singleNumber(array));
    }

}

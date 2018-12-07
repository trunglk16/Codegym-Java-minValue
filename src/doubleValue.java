import java.util.Arrays;
import java.util.Scanner;

public class doubleValue {
    public static void main(String[] args) {

        System.out.println("Inser size: ");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();

        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length ; i++) {
            System.out.println("Number " + (i+1));
            Scanner input2 = new Scanner(System.in);
            numbers[i] = input2.nextInt();

        }
        System.out.println("Arrays: " + Arrays.toString(numbers) );


        System.out.println("Min value is in the "+minValue(numbers) +" position");

    }
    public static int minValue(int[] array){
        int min = array[0];
        int index = 0;

        for (int i = 1; i < array.length; i++){
            if(array[i] < min) {
                min = array[i];
                index = i+1;
            }
        }

        return index;

    }
}

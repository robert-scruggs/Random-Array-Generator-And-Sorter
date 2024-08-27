import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Assignment6A {

    // methods
    public static void createRandomArray(int[] array, int arraySize){
        Random rand = new Random();
        for (int i = 0; i < arraySize; i++){
            array[i] = rand.nextInt(1001) - 500;
        }
    }

    public static boolean isArraySorted(int[] array, int arraySize){
        boolean isItTrue = true;
        for (int i = 0; i < arraySize -1; i++){
            if (array[i + 1] > array[i]){
            }else{
                isItTrue = false;
                break;
            }
        }

        return isItTrue;
    }

    public static void sortArray(int[] array, int arraySize){
        for (int i = 0; i < arraySize-1; i++){
            int lowest = i;
            for (int j = 1 + i; j < arraySize; j++){
                if(array[lowest] > array[j]){
                    lowest = j;
                }
            }
            int temporary = array[i];
            array[i] = array[lowest];
            array[lowest] = temporary;
        }
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] randomArray = new int[10];
        createRandomArray(randomArray,10);
        System.out.print("Random array: ");
        for (int i = 0; i < randomArray.length; i++){
            if (i == 9){
                System.out.println(randomArray[i] + "");
            }else{
                System.out.print(randomArray[i] + ", ");
            }
        }

         int response;
        do {
            System.out.println("What do you want to do?");
            System.out.println("1) Generate a new random array");
            System.out.println("2) Is the array sorted?");
            System.out.println("3) Sort the array");
            System.out.println("4) Quit");
            System.out.print("Choice: ");
            response = input.nextInt();
            if (response == 1){
                createRandomArray(randomArray,10);
                System.out.print("Random array: ");
                for (int i = 0; i < randomArray.length; i++){
                    if (i == 9){
                        System.out.println(randomArray[i] + "");
                    }else{
                        System.out.print(randomArray[i] + ", ");
                    }
                }
            }else if(response == 2){
                if (isArraySorted(randomArray,10)){
                    System.out.println("The array is sorted.");
                }else{
                    System.out.println("The array is not sorted.");
                }

            }else if (response == 3){
                sortArray(randomArray,10);
                System.out.print("Sorted Array: ");
                for (int i = 0; i < randomArray.length; i++){
                    if (i == 9){
                        System.out.println(randomArray[i] + "");
                    }else{
                        System.out.print(randomArray[i] + ", ");
                    }
                }


            }else if (response == 4){
                break;
            }

        } while (response != 4);


    }
}

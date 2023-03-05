import java.util.ArrayList;
import java.util.Random;

public class Curs5Homework1 {
    public static void main(String[] args){

        //Ex. 1
        int[] array = {3, 9, 11, 11};
        System.out.println(sumOfIntegers(array));

        //Ex. 2
        int[] array2 = {3, 10, 10, 7, 6};
        System.out.println(numberOfOdds(array2));

        //Ex. 3
        int[] array4 = {2, 4, 7, 8, 10};
        int number4 = 5;
        System.out.println(greaterThan(array4, number4));

        //Ex. 4
        int target = 300;
        System.out.println(donations(target));

        //Ex. 5
        int limitNumber = 5;
        System.out.println(donations2(limitNumber));


    }
    public static int sumOfIntegers (int[] array){
        //Ex 1
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum = sum + array[i];
        }
        return sum;
    }

    public static int numberOfOdds(int[] array){
        //Ex. 2
        int count = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 != 0){
                count++;
            }
        }
        return count;
    }

    public static ArrayList<Integer> greaterThan(int[] array, int givenNumber){
        //Ex. 3
        ArrayList<Integer> largerNumbers = new ArrayList<Integer>();
        for (int num: array){
            if (num > givenNumber){
                largerNumbers.add(num);
            }
        }
        return largerNumbers;
    }

    public static int donations(int target){
        //Ex. 4
        Random randomNumber = new Random();
        int sum = 0;

        while (sum <= target){
            int randomNum = randomNumber.nextInt(100);
            sum += randomNum;
            System.out.println("You now have " + sum + "$");
            }

        System.out.println("You have reached your desired amount of money!");
        return sum;
    }

    public static int donations2(int limitNumber){
        //Ex. 5
        Random randomNumber = new Random();
        int sum = 0;

        for (int i = 0; i <= limitNumber; i++){
            int random = randomNumber.nextInt(200);
            sum += random;
            System.out.println("You have received " + random + "$");
        }
        System.out.println("Your total amaount of money is:");
        return sum;

    }


}
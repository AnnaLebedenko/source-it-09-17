package HomeWork_2;

import java.util.ArrayList;

/**
 * Created by ANNA on 30.09.2017.
 */
public class FindOfPalindrom {
    public static int getPalindrom(int[] arg){
        int result = 0;
        int counter = 0;
        for(int element : arg){

            int[]  arrayOfDigits = new int[0];
            int element_copy = element;
            while(element_copy >= 1){
                int temp = element_copy / 10;
                int currentDigit = element_copy - temp * 10;
                element_copy = temp;

                int[] tempArray = new int[arrayOfDigits.length + 1];
                for(int i = 0; i < arrayOfDigits.length; i++){
                    tempArray[i] = arrayOfDigits[i];
                }
                tempArray[arrayOfDigits.length] = currentDigit;
                arrayOfDigits = tempArray;
            }

            boolean isPolindrom = true;
            for(int i = 0; i < arrayOfDigits.length / 2; i++){
                if(arrayOfDigits[i] != arrayOfDigits[arrayOfDigits.length - 1- i]){
                    isPolindrom = false;
                }
            }

            if (isPolindrom){
                result = element;
                counter++;
                if(counter == 2){
                    return result;
                }
            }
        }
        return result;
    }
}

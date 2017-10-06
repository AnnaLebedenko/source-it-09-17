package HomeWork_2;

/**
 * Created by ANNA on 30.09.2017.
 */
public class SumOfDigits {
    public static int getSumOfDigits(int arg){
        int sum = 0;

        while(arg >= 1){
            int temp = arg / 10;
            int currentDigit = arg - temp * 10;
            sum += currentDigit;
            arg = temp;
        }
        System.out.println(sum);
        return sum;
    }
}

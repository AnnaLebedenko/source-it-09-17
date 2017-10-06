package HomeWork_2;

/**
 * Created by ANNA on 30.09.2017.
 */
public class Demo {
    public  static  void main(String[] args){
        SumOfDigits.getSumOfDigits(123);
        System.out.println(
                FindOfPalindrom.getPalindrom(new int[]{1234, 1221, 12345, /*133331,*/ 68678, /*3553,*/ 758})
        );
        MyMonth.parseMonth(13);
    }
}

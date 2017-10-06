package HomeWork_2;

/**
 * Created by ANNA on 30.09.2017.
 */
public class MyMonth {
    public static void parseMonth(int arg){
        if(arg >= 1 && arg <= 12){
            String month = "";

            if(arg == 1)
                month = "January";
            else if(arg == 2)
                month = "February";
            else if(arg == 3)
                month = "March";
            else if(arg == 4)
                month = "April";
            else if(arg == 5)
                month = "May";
            else if(arg == 6)
                month = "June";
            else if(arg == 7)
                month = "July";
            else if(arg == 8)
                month = "August";
            else if(arg == 9)
                month = "September";
            else if(arg == 10)
                month = "October";
            else if(arg == 11)
                month = "November";
            else if(arg == 12)
                month = "December";

            System.out.println(month);
        }
        else{
            System.out.println("This is bad number");
        }
    }
}

package HomeWork_3;

/**
 * Created by ANNA on 04.10.2017.
 */
public class Words {
     public static String getTheShortest(String sentence){
         String[] words = sentence.split(" ");
         String result = words[0];
         int minLength = words[0].length();
         for(int i = 1; i < words.length; i++){
             if(minLength > words[i].length()){
                 result = words[i];
             }
         }
         return  result;
     }
    public static String getTheLongthest(String sentence){
        String[] words = sentence.split(" ");
        String result = words[0];
        int maxLength = words[0].length();
        for(int i = 1; i < words.length; i++){
            if(maxLength < words[i].length()){
                result = words[i];
            }
        }
        return  result;
    }
}

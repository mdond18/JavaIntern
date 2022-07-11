import java.util.Locale;

public class isPalindrome {

    public static Boolean isPalindrome(String text){

        text=cleanText(text);
        int length=text.length();

        if(length<=1)return true;


        for (int i = 0; i < length/2; i++) {
            char left=text.charAt(i);
            char right=text.charAt(length-i-1);
            if(left!=right) return false;
        }

        return true;
    }

    private static String cleanText(String text){
        text=text.toLowerCase(Locale.ROOT);
        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i)==' '){
                text=text.substring(0,i)+text.substring(i+1);
            }
        }
        return text;
    }
}

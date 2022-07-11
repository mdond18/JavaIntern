public class isProparly {
    public static boolean isProperly(String sequence){
        if (sequence.charAt(0)==')'||sequence.length()<2) return false;

        if(sequence.equals("()")) return true;

        for (int i = 0; i < sequence.length()-1; i++) {
            if(sequence.charAt(i+1)==')'&&sequence.charAt(i)=='(')
                return isProperly(sequence.substring(0,i)+sequence.substring(i+2));
        }

        return false;

    }
}

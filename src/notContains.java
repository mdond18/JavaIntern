import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class notContains {
    public static int notContains(int[] array){
        List<Integer> arr = Arrays.stream(array).boxed().collect(Collectors.toList());
        int i=1;
        while (true){
            if(!arr.contains(Integer.valueOf(i))) {
                return i;
            }
            i++;
        }

    }
}

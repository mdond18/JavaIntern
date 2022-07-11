import java.util.concurrent.atomic.AtomicInteger;

public class countVariants {

    public static int countVariants(int stearsCount){

        AtomicInteger result = new AtomicInteger(0);
        recCountVariants(stearsCount,result);
        return result.intValue();
    }

    private static void recCountVariants(int stearsCount, AtomicInteger total){
        if(stearsCount ==0) {
            total.getAndIncrement();
            return ;
        }

        recCountVariants(stearsCount-1,total);
        if(stearsCount-2>=0) recCountVariants(stearsCount - 2,total);

    }

}

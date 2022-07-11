public class minSplit {

    public static int minSplit(int amount){
        int count=0;
        int left=amount;
        int coins[]=new int[]{50,20,10,5,1};

        for (int i = 0; i < 5; i++) {
            count+=left/coins[i];
            left%=coins[i];
        }

        return count;
    }
}

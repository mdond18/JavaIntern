import java.util.Arrays;

public class simpleIntArray {
    private int logLen;
    private int length;
    private int[] arr;

    public simpleIntArray(int length){
        arr=new int[length];
        logLen=0;
        this.length=length;
    }
    public void add(int n){
        if(logLen==logLen){
            int[] tmp=new int[2*length];
            tmp=Arrays.copyOf(arr,length);
            arr=tmp;
        }
        logLen++;
        arr[logLen-1]=n;
    }
    public void remove(int index){
        if(index>=logLen) return;
        //replace element with last elem and reduce size , complexity O(1)
        arr[index]=arr[logLen-1];
        logLen--;
        System.out.println("index:" +index +"new element: "+arr[index]);
    }
    public void Set(int index,int elem){
        if(index>=logLen) return;
        arr[index]=elem;
    }

    public int Get(int index){
        if(index>=logLen) return -1;
        return arr[index];
    }

}

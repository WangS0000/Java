package StringBuilder;

public class Demo15 {
    public static void main(String[] args){
        int[] arr = {26,69,80,57,13};
        selectSort(arr);
        print(arr);
    }
    public static void selectSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=1+i;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    //最好将下面3行是一个方法，然后直接调用
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

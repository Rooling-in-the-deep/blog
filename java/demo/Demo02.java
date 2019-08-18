package demo;

public class Demo02 {
    public static void main(String[] args) {
        int arr[]={-5,29,7,10,5,16};
        for (int i=1;i<arr.length;i++){
            for (int j=0;j<arr.length-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp;
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
        }
        for (int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]+" ");
        }
    }
}

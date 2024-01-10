import java.util.Scanner;

public class FirstSecondLargest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        int i,max1,max2;
        System.out.println("Enter array elements: ");
        for(i=0;i<5;++i){
            arr[i]=sc.nextInt();
        }
        max1=arr[0];
        max2=arr[1];
        for(i=2;i<5;++i){
            if(arr[i]>max1){
                max1=arr[i];
            }else if(arr[i]>max2 && arr[i]!=max1){
                max2=arr[i];
            }
        }
        System.out.println("Largest element= "+max1+" and second largest element= "+max2);
    }
}

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        int[] arr =new int[10];
        int[] o1 =new int[10];
        int[] o2 =new int[10];
        int i,j=0,k=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array elements: ");
        for(i=0;i<10;++i){
            arr[i]=sc.nextInt();
        }

        for(i=0;i<arr.length;++i){
            if(arr[i]>0){
                o1[j]=arr[i];
                ++j;
            }else{
                o2[k]=arr[i];
                ++k;
            }
        }

        System.out.println("Rearranged array: ");
        for(i=0;i<arr.length;++i){
            if(o1[i]==0 || o2[i]==0){
                continue;
            }
            System.out.println(o1[i]+"\n"+o2[i]);
        }
    }
}

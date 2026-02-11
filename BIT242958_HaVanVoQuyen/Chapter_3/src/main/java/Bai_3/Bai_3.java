package Bai_3;
import java.util.Arrays;
import java.util.concurrent.CompletableFuture;
public class Bai_3{
    public static void main(String []args){
           CompletableFuture 
                   .supplyAsync(()->{
                       int[] arr = {1,2,5,3,100};
                       return arr;
                   })
                   // lọc số lẻ
                   .thenApply(arr->{
                     int count = 0 ; 
                     for(int i = 0 ; i < arr.length;i++){
                        if(arr[i]%2!=0){
                            count++;
                        }
                     }
                     int[] oddArr = new int[count];
                     int index = 0 ;
                     for(int i = 0 ; i < arr.length;i++){
                         if(arr[i]%2 != 0 ){
                             oddArr[index++] = arr[i];
                         }
                     }
                     // sap xep tang dan
                     for(int i = 0 ; i < oddArr.length-1;i++){
                         for(int j = i+1 ; j < oddArr.length;j++){
                                if (oddArr[i] > oddArr[j]) {
                                 int t = oddArr[i];
                                 oddArr[i] =oddArr[j];
                                 oddArr[j] = t;
                             
                             }
                         }
                     }
                     return oddArr;
                   })
                .thenApply(arr->"Kết quả là : "+Arrays.toString(arr))
                .thenAccept(result->System.out.print(result))
                .thenRun(()->System.out.println("Done"))
                .join();
      
    }
}

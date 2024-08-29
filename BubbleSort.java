import java.util.*;

public class BubbleSort{
   public static void main(String[] args) {
    
    int[] array = {1, 2, 3, 4, 5}; 
 
    int work = 0;
    int cnt = 0;


    //アルゴリズム開始
    for(int i = array.length - 1; i >= 1; i--){
        for(int j = 0; j < i; j++){
            
            int max = array[j];

            if(max < array[j + 1]){
                work = max;
                array[j] = array[j + 1];
                array[j + 1] = work;
            }

            cnt++;
        }
    }

    System.out.println(cnt);

   }
}
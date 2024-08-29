import java.util.Scanner;

public class vendingmachine_0 {
    public static void main(String[] args){

        int juice = 5; 

        for(int i = 1; i <= 10; i++){
            if(juice >= i){

                System.out.println("ジュースをだします");

            }else{

                System.out.println("ジュースがありません");
                
            }
        }

    }
    
}

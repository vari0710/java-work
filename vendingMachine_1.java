import java.util.Scanner;

public class vendingMachine_1 {
    public static void main(String[] args){

        int juice = 5; 

        int flag = 1;

        for(int i = 0; i < 10; i++){
            if(flag == 1){

                if(juice == i){
                    flag = 0;
                }
                
                System.out.println("ジュースをだします");

            }else{
                System.out.println("ジュースがありません");
            }
        }

    }
}

import java.util.Scanner;
import java.util.Random;

public class NumberGame {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("数当てゲーム開始！！");
        System.out.println("10から99の数を当ててください");

        //get a random number form 10 to 99.
        Random num = new Random();
        int get_number = num.nextInt(90) + 10;
        System.out.println(get_number);
        //a function that continues util result is correct
        boolean result = true;

        //add cnt.
        int cnt = 1;

        //judgment started
        do{
            System.out.print("いくつかな?：");
            int receive = sc.nextInt();


            //the value entered by the user is incorrect.
            if(receive != get_number){

                //get_number is greater than receive.
                if(receive < get_number){
                    System.out.println("もっと大きな数だよ");
                }else{
                    System.out.println("もっと小さい数だよ");
                }

                cnt++;

            }else{
                result = false;
            }
        }while(result);

        System.out.println(cnt + "回目で正解しました。");
    }
}

import java.util.Scanner;

public class PrintGraph1{
    public static void main(String[] args){
        int[] score = {32, 56, 70, 44, 99, 60, 50, 88, 100};

        int cnt = 1;

        //scoreを順に出していく
        for(int score_1 : score){

            System.out.println("学生" + cnt + " ");

            for(int i = 0; i < score_1 / 10; i++){

                //scoreのi番目が10で割り切れる間
                    System.out.print("*");
            }

            cnt++;

            System.out.println(score_1);
        }
    }
}
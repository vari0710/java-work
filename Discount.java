import java.util.Scanner;

public class Discount{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("割引後金額金額");

        for(int i = 0; i < 4; i++){

            System.out.print("個数入力");

            //個数を受けとる
            int num = scanner.nextInt();

            System.out.print("単価入力");

            //単価を受け取る
            int price = scanner.nextInt();

            System.out.print("金額＞");
            
            //amountから戻り値を受け取る
           System.out.println((int)amount(num ,price));
        }
    }


    public static double amount(int num, int price){

        int moneny = num * price;

        if(num >= 500){
            return moneny * 0.7;
        }else if(num < 500 && num >= 100){
            return moneny * 0.75;
        }else if(num < 100 && num >= 10){
            return moneny * 0.8;
        }else{
            return moneny;
        }
    }
}
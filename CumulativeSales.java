import java.util.Scanner;

public class CumulativeSales{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] month = new int[12];

        //1月から12月までの売上を出力
        for(int i = 0; i < 12; i++){
            System.out.print((i + 1) + "月の売上:");
            int sal = scanner.nextInt();

            //受け取った値を変数に格納する
            month[i] = sal;
        }

        System.out.println("各月の売上と売上累計");

        //月、売上、売上累計を出力
        System.out.println("月　　　売上　　　売上累計");

        //累計という変数を用意する
        int total = 0;

        for(int j = 0; j < 12; j++){
            //月の売上ごとに加算していく
            total += month[j];

            //月の出力
            System.out.print((j + 1) + "   ");

            //売上を月ごとに出力
            System.out.print(month[j] + "   ");

            //加算した累計を出していく
            System.out.println(total);
        }

    }
}
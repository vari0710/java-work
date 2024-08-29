import java.util.Scanner;

public class Printpyramid{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("ピラミッドを表示します");

        System.out.print("段数");
        int receive = scanner.nextInt();

        //空白のための変数
        int blank = 0;

        for(int i = 1; i <= receive; i++){

        
            //i回目の値を入れる変数
            int repetition = (i - 1) * 2 + 1;

            //receive回目の値を入れる変数
            int max =  (receive - 1) * 2 + 1;


            //ピラミッドの左側に空白を入れる
            if(max != repetition){

                //maxの値からピラミッドに使用する*を引いた数の半分
                blank = (max - repetition) / 2;

                for(int j = 0; j < blank; j++){
                    System.out.print(" ");
                }

            }


            //空白の隣に*を出力する 
            for(int j = 1; j <= repetition; j++){
                System.out.print("*");
            }


            System.out.println();
        }

        scanner.close();
    }
}
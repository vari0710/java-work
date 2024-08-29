import java.util.Scanner;

public class SumBreakAvel{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int cut = 0;
        
        System.out.println("整数を加算します。");
        System.out.print("何個加算しますか？");

        // ユーザーから入力を受け取る
        int receive = scanner.nextInt();
        

        //ユーザーから受け取った回数繰り返す
        for(int i = 1; i <= receive; i++){
            System.out.print("整数（0で終了） :");

            //ユーザーから入力を受け取る
            int integer = scanner.nextInt();

            //integerをsumに入れていって加算していく
            sum += integer;


            //integerに0を代入されたら抜ける
            if(integer == 0){
                break;
            }

            //integerの回数
            cut++;
        }

        System.out.println("合計は" + sum + "です。 ");
        System.out.println("平均は" + sum / cut + "です。");

        scanner.close();


    }
}
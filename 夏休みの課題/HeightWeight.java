import java.util.Scanner;

public class HeightWeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("標準体重表示プログラム");

        System.out.print("何cmから：");

        // スタートの身長の値を受け取る
        double start_height = scanner.nextDouble();

        System.out.print("何cmまで：");


        // 終わりの身長の値を受け取る
        double end_height = scanner.nextDouble();

        System.out.print("何cmごと：");


        // 区切りの身長の値を受け取る
        int delimited = scanner.nextInt();

        System.out.println("身長　　　標準体重");


        System.out.println("---------------------");

        // 身長と標準体重をに順に出力していく
        for (double i = start_height; i <= end_height; i += delimited) {
            System.out.print(i + "cm" + "     ");

            // weightというメソッドから戻り値を受け取る
            System.out.println(weight(i));
        }
    }

    // 標準体重を計算するメソッド
    public static double weight(double height) {
        height /= 100;

        //小数点を二個右にずらしてその後100で割って二個戻す
        return (double)Math.floor(((height * height) * 22)* 100) / 100;
    }

}

import java.util.Scanner;

public class InputScore1{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int Student = 6;
        int[][] point = new int[Student][2];


        System.out.println("6人の国語・数学の点数を入力せよ");

        //出席番号用
        int number = 1;

        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 1; j++){
                
                //出席番号の出力
                System.out.print(number++ + "番目・・・");

                //国語の入力を受け取る
                System.out.print("国語：");
                point[i][j]  = scanner.nextInt();
                
                //数学の入力を受け取る
                System.out.print("         " + "数学");
                point[i][j + 1] = scanner.nextInt();
            }
        }


                //平均のための変数を作る
                int student_average = 0;
                int math_average = 0;
                int japanese_average = 0;

                System.out.println("No.　　国語　　数学　　平均");


                int number_01 = 1;

                for(int i = 0; i < 6; i++){

                    student_average = 0;

                    for(int j = 0; j < 1; j++){
                        
                        //出席を出す
                        System.out.print(number_01++ + "　　");


                        //国語の点数の値を配列から持ってきて入れる
                        System.out.print(point[i][j] + "　");

                        //個人の平均を出すために入れる
                        student_average += point[i][j];

                        //国語の平均を出すために入れる
                        japanese_average += point[i][j];


                        //数学の点数の値を配列から持ってきて入れる
                        System.out.println(point[i][j + 1] + "　");

                        //個人の平均に加算する
                        student_average += point[i][j + 1];

                        //数学の平均に加算する
                        math_average += point[i][j + 1];


                        //個人の点数の平均を出す
                        System.out.print((double)student_average / 2);
                    }
                }
                System.out.print("平均");

                System.out.print((double)japanese_average / 6  + "    ");

                System.out.print((double)math_average / 6);

    }
}
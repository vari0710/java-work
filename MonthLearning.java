import java.util.Scanner;
import java.util.Random;

public class MonthLearning{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //月を配列に入れていく
        String[]  monthStirng = {
            "January", "February", "March", "April", "May", "June",
             "July", "August", "September", "October", "Nobember", "December"
        };

        System.out.println("英語の月名を入力してください");
        System.out.println("なお、先頭は大文字で、2文字目以降は小文字とします");

        //比較する
        boolean comparison = false;

        //判定開始
        do{

            //ランダムに1月から12月までだす
            Random random = new Random();
            int randomMonth = random.nextInt(12) + 1;
            

            System.out.print(randomMonth + "月：");

            //nextLineで改行が入って判定されるためそれを防ぐのに改行を事前に入れる
            // scanner.nextLine();
            String receive = scanner.nextLine();

            //受け取った値とmonthStringをひかくする
            if(monthStirng[randomMonth - 1].equals(receive)){

                comparison = true;

                System.out.println("正解です。もう一度？　1...yes/0...no");
                int result = scanner.nextInt();


                //再チャレンジの有無
                if(result == 1){//もう一度実行します
                    comparison = false;

                }else if(result == 0){//終了します
                    System.out.println("終了します");
                    break;
                }


            }else{

                System.out.println("ちがいます");

                //会うまで続ける
                while (true) {

                    System.out.print(randomMonth + "月：");
                    receive = scanner.nextLine();


                    if(monthStirng[randomMonth - 1].equals(receive)){

                        comparison = true;
                        System.out.println("正解です。もう一度？　1...yes/0...no");
                        int result = scanner.nextInt();
                        scanner.nextLine();
                        
                        //再チャレンジの有無
                        if(result == 1){
                            comparison = false;
                            break;

                        }else if(result == 0){
                            System.out.println("終了します");
                            continue;
                        }

                    }else{
                        System.out.println("違います");

                    }
                }
            }

        }while(comparison == false);
    }
}
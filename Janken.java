import java.util.Scanner;

public class Janken {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
            System.out.println("じゃんけんゲーム");

            int hand = 0;
            int cp_hand = 0;

        
        while(true){
            System.out.println("(グー：0、チョキ：1，パー：2)");

            System.out.print("じゃんけん・・・");


            //ユーザーからの入力を受け取る
            hand = scanner.nextInt();

            System.out.println("ポン！！");

            System.out.println("あなたの手　×　コンピュータの手");

            //コンピューターからの入力を受け取る
            cp_hand = new java.util.Random().nextInt(3);


            //ユーザーの手
            if(hand == 0){
                System.out.print("グー");
            }
                else if(hand == 1){
                    System.out.print("チョキ");
            }
                else{
                    System.out.print("パー");
            }

            System.out.print("             ");


            //コンピュータの手
            if(cp_hand == 0){
                    System.out.print("グー");
            }
                else if(cp_hand == 1){
                    System.out.print("チョキ");
            }
                else{
                    System.out.print("パー");
            }

            System.out.println();


            //じゃんけんの勝ち負け
            if(hand == cp_hand){
                System.out.println("あいこ");

            }
                else if(cp_hand == 1){
                    if(hand == 0){
                            System.out.println("あなたの勝ち");
                    }
                        else{
                            System.out.println("あなたのまけ");
                    }

            }else if(cp_hand == 2){
                if(hand == 0){
                        System.out.println("あなたのまけ");
                }
                    else{
                        System.out.println("あなたのかち");
                }
            }
                else{
                if(hand == 0){
                        System.out.println("あなたのまけ");
                }
                    else{
                        System.out.println("あなたのまけ");
                }
            }
            

            //じゃんけんから抜ける
            if(hand != cp_hand){
                break;
            }
        }
        scanner.close();
    }
}
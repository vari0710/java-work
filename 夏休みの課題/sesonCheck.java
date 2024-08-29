import java.util.Scanner;

public class sesonCheck {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("季節の判定");

        for(int i = 0; i < 4; i++){

            //ユーザから知りたい月の数を入れてもらう
            System.out.print("月の入力：");
            int seson = scanner.nextInt();

            //checking_sesonというメソッドから値を持ってくる
            if(seson > 0 && seson <= 12){
                System.out.println(seson + "月は" + checking_seson(seson) + "です");
            }else{
                System.out.println(checking_seson(seson));
            }

            System.out.println();
        
        }
    }

    //季節の判別を行う
    public static String checking_seson(int seson){
        int check = seson;

        switch (check){
            case 3,4,5:
                return "春";

            case 6,7,8:
                return "夏";

            case 9,10,11:
                return "秋";

            case 12,1,2:
                return "冬";

            default:
                return "そんな月はありません";
        }
    }
}
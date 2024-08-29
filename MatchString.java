import java.util.Scanner;

public class MatchString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("テキスト：");
        String text = scanner.next(); 
        char [] text_ary = new char[s.length()]; 
        for(int i=0; i < text.length(); i++) { 
            text_ary[i] = text.charAt(i); //テキストが一文字ずつ入っている
        }

        System.out.print("パターン：")
        String patern = scanner.next(); 
        char [] patern_ary = new char[s.length()]; 
        for(int i=0; i < patern.length(); i++) { 
            patern_ary[i] = patern.charAt(i); //テキストが一文字ずつ入っている
        }

        //indexという箱を作ってパターンの文字を変えていく
        int index = 0;

        //パターンにマッチしたかを調べる変数
        boolean goal = false;

        //パターンにマッチした初めの文字
        int start_index = 0;


        for(int i=0; i < text_ary.length(); i++) { 
            if(text_ary[i] == patern_ary[index]){
                
                if(index == 0){
                    start_index = i;

                }

                index++;

                if(patern_ary.length() == index){
                    goal = true;
                    break;
                }
            }
                //indexが0以上で次の文字が一致しなかった場合振り出しに戻る
                 else if(index > 0){
                    index = 0;
            }


        }

        if(goal){
            Sy
        }else{

        }
    }
}
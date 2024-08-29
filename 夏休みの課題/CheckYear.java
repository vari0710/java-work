import java.util.*;

public class CheckYear {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("うるう年チェック");

        for(int i = 0; i < 4; i++){
            System.out.print("西暦年を4桁で入力");
            int year = scanner.nextInt();

            System.out.println(Leap(year));

            //一回出力するごとに改行を入れる
            System.out.println();
            System.out.println();
        }
    }

    public static String Leap(int year){
        if(year % 4 == 0 && year % 100 != 0){
            return "はうるう年です";
        }else{
            return "は平年です";
        }
    }
}

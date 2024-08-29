import java.util.*;
 
public class DnumberSearch1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ダブっている数字を入力してください");

        //計測を始める
        long start_time = System.currentTimeMillis();
    
        //成功したら加算していく
        int a = 1;

        //10回成功したら終わる
        while(a <= 10){

            //可変する配列
            List<Integer> list = new ArrayList<>();
            

            //1から9までをlistに入れる
            for(int i = 1; i <= 9; i++){
                list.add(i);
            }
            

            //ランダムにで1から9の値を一つ受け取る
            Random num = new Random();
            int rnd = num.nextInt(9) + 1;

            list.add(rnd);

    
            //listをシャッフルする
            Collections.shuffle(list);
            System.out.print(list);

            int receive = scanner.nextInt();

            

            //合否を判断する
            if(rnd != receive){
                System.out.println("miss");
            }else{
                a++;
            }
           
        }
            //計測を終了する
            long end_time = System.currentTimeMillis();


            //時間を出力する
            double time = (end_time - start_time);

            System.out.println((time / 1000) + "秒");

            System.out.println(message(time));
            
    }

    //計測した時間から結果を出力する
    public static String message(double time){

            if(time <= 17.0){
                return "さっすが";
            }else if(time > 17.0 && time < 20.0){
                return "まぁまぁ？";
            }else if(time > 20.0 && time < 25.0){
                return "え、遅くない？？";
            }else{
                return "もう無理だね、あきらめな";
            }  
    }
}
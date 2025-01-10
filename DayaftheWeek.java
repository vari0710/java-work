import java.util.Scanner;
import java.util.Set;

public class DayaftheWeek{

    //経過日数を追加するメソッド
    public static int days(int m, int d){

        //1, 3, 5, 7, 8, 10月であればsum_daysに加算する
        int sum_days = 0;

       Set<Integer> months31 = Set.of(3, 5, 7, 8, 10, 12);
       Set<Integer> month30 = Set.of(4, 6, 9, 11);

        for(int i = 2; i < m - 1; i++){
            //m-1の月まで月日数分追加する
            if(months31.contains(m)){
                sum_days += 31;
           }else if(month30.contains(m)){
                sum_days += 30;
           }else{
                sum_days += 28;
           }
        }

        //1月またm月は日数分追加
        if(m != 1){
            sum_days += d;
        }

        if(m == 1){
            if(d != 1){
                sum_days += d - 1;
            }
        }

        return sum_days;
    }

    public static int leap(int y){
        //うるう年が何日あるか判定する
        int leap_year = 0;
        if(y >= 1900){
            for(int i = 1900; i < y; i++) {
                if(i % 4 == 0 && i % 100 != 0 || i % 400 == 0){
                    leap_year++;
                }
            }
        }

        return leap_year;
    }

    public static String week(int W){
        int n = W;
        String day = "";
        switch (n) {
            case 0:
                day = "日曜日";
                break;
            case 1:
                day = "月曜日";
                break;           
            case 2:
                day = "火曜日";
                break; 
            case 3:
                day = "水曜日";
                break;
            case 4:
                day = "木曜日";
                break;
            case 5:
                day = "金曜日";
                break;
            case 6:
                day = "土曜日";
                break;           
        }

        return day;
    }

    public static void main(String[] args){
        //(y - 1899） + 閏年の回数 を出す
        int year_sum = 0;

        //入力を受け取る
        Scanner sc = new java.util.Scanner(System.in);

        System.out.print("年");
        int y = sc.nextInt();

        System.out.print("月");
        int m = sc.nextInt();

        System.out.print("日");
        int d = sc.nextInt();

        year_sum = (y - 1899) + leap(y);
        year_sum += days(m, d);
        
        //曜日を出す
        int DAY = year_sum % 7;

        System.out.println(y + "年" + m + "月" + d + "日は" + week(DAY) + "です");
    }
}
import java.util.Scanner;

public class Calender{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        System.out.print("西暦-->");

        //西暦を受け取る
        int year = scanner.nextInt();

        System.out.print("月-->");

        //日付を受け取る
        int month = scanner.nextInt();

        System.out.println(" * * * * " + year + "年" + month + "月" + " * * * * ");

        System.out.println(" SUN MON TUE WED THU FRI SAT");

        PrintCalender(year, month);
    }

    public static void PrintCalender(int year, int month){

        //日付をずらすための余りを入れる箱を作る
        int surplus = (year % 7) + month;
        int a_week = (7 + month) - surplus;
System.out.print(a_week);
        for(int i = 0; i < surplus; i++){
            System.out.print("    ");
        }
            //31日ではない月
            if(month != 2 && month != 4 && month != 6 && month != 9 && month != 11){
                for(int i = 1; i <= 31; i++){


                        if((a_week  + 1) == i){
                            System.out.println();
                            a_week += 7;
                        }
                        
                        System.out.print(i + "   ");

                    }



            //２月でない月
            }else if(month != 2){
                for(int i = 1; i <= 30; i++){

                    if((a_week) == i){
                        System.out.println();
                        a_week += 7;
                    }
                    
                    System.out.print(i + "   ");
                    
                }
            }else{

                //うるう年の出力
                if(year % 4 == 0){
                    for(int i = 1; i <= 29; i++){

                        if((a_week  + 1) == i){
                            System.out.println();
                            a_week += 7;
                        }
                        
                        System.out.print(i + "   ");
                    }
                }else{

                    for(int i = 1; i <= 28; i++){
                        
                        if((a_week  + 1) == i){
                            System.out.println();
                            a_week += 7;
                        }
                        
                        System.out.print(i + "   ");
                    }
                }

            }



           


    }
}
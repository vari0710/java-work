import java.util.Scanner;

public class InputStudent {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        int sum = 0;

        
            System.out.println("学生情報を入力してください");

            System.out.println("性別(1・・・男性,0・・・女性)");



        while(true){

            System.out.println(i + "人目入力");

            System.out.print("氏名 :");
            String name = scanner.nextLine();

            System.out.print("性別 :");
            int gender = Integer.parseInt(scanner.nextLine());

            if(name.equals("END")){
                break;
            }
            if(gender == 1){
                sum++;
            }

            i++;

        }

        System.out.println();
        System.out.println("男子学生の人数は" + sum + "名です。");


        scanner.close();

    }
}
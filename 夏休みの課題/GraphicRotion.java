import java.util.*;

public class GraphicRotion {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

         //四角を入れていく配列をつくる
        int tate = 8; 
        int yoko = 8; 


        String[][] Graphic = new String[tate][yoko];



        //graphicの指定の場所を黒くする
        for(int i = 0; i < tate; i++){
            for(int j = 0; j < yoko; j++){
                
                String base = Graphic[i][j];
                Graphic[i][j] = "□";
                System.out.print(Graphic[i][j]);


                //角に四角をつくる
                if(i == 0 || i == 7){
                    if(j == 0 || j == 7){
                        Graphic[i][j] = base;
                        Graphic[i][j] = "■";
                        System.out.print(Graphic[i][j]);
                    }
                }

                

            }
            System.out.println();

        }



    }
}



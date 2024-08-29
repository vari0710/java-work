public class BMICheck {
	public static void main(String[] args) {
	    double cm,kg,cm_m,bmi,skg;
	    System.out.println("BMI チェック");
	    System.out.print("身長(㎝)：");
	     cm= new java.util.Scanner(System.in).nextDouble();
	    System.out.print("体重(㎏)：");
	     kg= new java.util.Scanner(System.in).nextDouble();
	    System.out.println("あなたの身長："+cm+"㎝、体重："+kg+"㎏");
	    cm_m=cm/100;
	    bmi=kg/(cm_m*cm_m);
	    if(bmi<18.5){
	        System.out.println("BMI 値は"+(int)bmi+" 低体重です。");
	    }
	    else if(bmi<25){
	        System.out.println("BMI 値は"+(int)bmi+" 普通体重です。");
	    }
	    else if(bmi<30){
	        System.out.println("BMI 値は"+(int)bmi+" 肥満(1度)です。");
	    }
	    else if(bmi<35){
	        System.out.println("BMI 値は"+(int)bmi+" 肥満(2度)です。");
	    }
	    else if(bmi<40){
	        System.out.println("BMI 値は"+(int)bmi+" 肥満(3度)です。");
	    }
	    else{
	        System.out.println("BMI 値は"+(int)bmi+" 肥満(4度)です。");
	    }
	    skg=(cm_m*cm_m)*22;
	    System.out.println("あなたの身長の標準体重は"+(int)skg+"㎏です");
	}
}
public class BMICheck {
	public static void main(String[] args) {
	    double cm,kg,cm_m,bmi,skg;
	    System.out.println("BMI �`�F�b�N");
	    System.out.print("�g��(�p)�F");
	     cm= new java.util.Scanner(System.in).nextDouble();
	    System.out.print("�̏d(�s)�F");
	     kg= new java.util.Scanner(System.in).nextDouble();
	    System.out.println("���Ȃ��̐g���F"+cm+"�p�A�̏d�F"+kg+"�s");
	    cm_m=cm/100;
	    bmi=kg/(cm_m*cm_m);
	    if(bmi<18.5){
	        System.out.println("BMI �l��"+(int)bmi+" ��̏d�ł��B");
	    }
	    else if(bmi<25){
	        System.out.println("BMI �l��"+(int)bmi+" ���ʑ̏d�ł��B");
	    }
	    else if(bmi<30){
	        System.out.println("BMI �l��"+(int)bmi+" �얞(1�x)�ł��B");
	    }
	    else if(bmi<35){
	        System.out.println("BMI �l��"+(int)bmi+" �얞(2�x)�ł��B");
	    }
	    else if(bmi<40){
	        System.out.println("BMI �l��"+(int)bmi+" �얞(3�x)�ł��B");
	    }
	    else{
	        System.out.println("BMI �l��"+(int)bmi+" �얞(4�x)�ł��B");
	    }
	    skg=(cm_m*cm_m)*22;
	    System.out.println("���Ȃ��̐g���̕W���̏d��"+(int)skg+"�s�ł�");
	}
}
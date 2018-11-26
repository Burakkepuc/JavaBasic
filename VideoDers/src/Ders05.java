import java.util.Scanner;
public class Ders05 {

	public static void main(String[] args) {
		
		Scanner giris=new Scanner(System.in);
		int vize1,vize2,finall;
		double ort;
		
		System.out.println("1.Vize notunu giriniz: ");
		vize1=giris.nextInt();
		
		System.out.println("2.Vize notunu giriniz: ");
		vize2=giris.nextInt();
		
		System.out.println("Final notunu giriniz: ");
		finall=giris.nextInt();
		
		ort=(vize1*0.3+vize2*0.3+finall*0.4);
		System.out.println("Ortalamanız= "+ ort);
		
		
		if(ort>50)
		{
			System.out.println("Dersten geçtiniz.");
		}
		else if(ort>=40&&ort<50)
			System.out.println("Şartlı geçtiniz");
		else
			System.out.println("Dersten kaldınız.");
		
		
	}

}

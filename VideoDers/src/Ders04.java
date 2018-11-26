import java.util.Scanner;
public class Ders04 {

	public static void main(String[] args) {

		int a,b,c;//Değerleri al
		
		float delta;//Delta'yı tanımla.
		float x1,x2;//Kökleri tanımla
		
		Scanner input= new Scanner (System.in);//Kullanıcıdan veri alacağız
		
		
		System.out.println("A değerini giriniz: ");
		a=input.nextInt();
		
		System.out.println("B değerini giriniz: ");
		b=input.nextInt();
		
		System.out.println("C değerini giriniz: ");
		c=input.nextInt();
		
		delta=b*b-(4*a*c);//Deltayı hesapla
		System.out.println("Delta=" + delta );//Deltayı yazdır.

		if(delta>0)//Delta işlemlerini yap.
		{
		  x1=(float) (-b+Math.sqrt(delta)/2*a);	//Math.sqrt = Kök alma kütüphanesi.
		  x2=(float) (-b-Math.sqrt(delta)/2*b);
		  System.out.println("X1 =" + x1);
		  System.out.println("X2 =" + x2);
		}
		else if(delta==0)
		{
			x1=-b/(2*a);
			System.out.println("Çakışık kök var x1= "+ x1);
		}
		else if(delta<0)
		{
			System.out.println("Çakışık kök yoktur!");
		}
		
		yaz();
		
	}

	public static void yaz() {
		// TODO Auto-generated method stub
		
	}

}

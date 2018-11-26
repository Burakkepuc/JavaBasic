import java.util.Scanner;
public class Ders06 {

	public static void main(String[] args) {
		int s1,s2,secim,sonuc;
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("1)Toplama\n2)Çıkarma\n3)Çarpma\n4)Bölme\n");
		System.out.println("Yukarıdan bir işlem seçiniz: ");
		secim=input.nextInt();
		
		System.out.println("1. Sayıyı giriniz: ");
		s1=input.nextInt();
		System.out.println("2. Sayıyı giriniz");
		s2=input.nextInt();
		
		switch(secim)
		{
		case 1:
			sonuc=s1+s2;
		System.out.println("Sonuç= "+sonuc);
		break;
		
		case 2:
			sonuc=s1-s2;
			System.out.println("Sonuç= "+sonuc);
        break;    
		case 3:
			sonuc=s1*s2;
			System.out.println("Sonuç="+sonuc);
	     break;
		case 4:
			sonuc=s1/s2;
			System.out.println("Sonuç="+sonuc);
			break;
			default:
				System.out.println("Yanlış bir seçim yaptınız.");
				break;
		
		
		}	
	}

}

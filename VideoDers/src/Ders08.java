import java.util.Scanner;
public class Ders08 {

	public static void main(String[] args) {
	
	Scanner input=new Scanner(System.in);
	int teksayi = 0,ciftsayi = 0,veri_al,sayac;
	
	
	
	do {
		System.out.println("Çıkmak için -1 yazınız.");
		System.out.println("Sayı giriniz: ");
		veri_al=input.nextInt();
		
		if(veri_al==-1) {
			break;
		}
		else if(veri_al%2==0) {
			ciftsayi++;
		}
		else if(veri_al%2==1) {
		teksayi++;
		}
		
		
		
	} while (true);
	
System.out.println("Girilen çift sayı adedi:"+ciftsayi);
System.out.println("Girilen tek sayı adedi: "+teksayi);
		
	}
}

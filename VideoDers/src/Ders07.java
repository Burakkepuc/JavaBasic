import java.util.Scanner;
public class Ders07 {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int sayac=0,toplam=0; //SAYAÇ VE TOPLAMI 0'A EŞİTLE
	float ortalama;//ORTALAMAYI TANIMLA
	
	while(sayac<10) {//WHİLE KAÇ'A KADAR DÖNECEKSE ŞART KOSTUR
		System.out.println(sayac+".sayıyı giriniz: ");//SAYAÇ'A ALINACAK SAYIYI GİR
		toplam=toplam+scan.nextInt();//Sayıları tek tek elle(scan) al.
		sayac++;	
	}
	
	
System.out.println("Toplam"+toplam);	
ortalama=toplam/10;
System.out.println("Ortalama="+ortalama);
	
	}

}
//Kullanıcıdan 5 adet sayı alıp,bunların ortalamasını bulan while döngüsü.
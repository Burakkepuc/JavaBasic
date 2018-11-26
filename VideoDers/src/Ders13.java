import java.util.Scanner;
public class Ders13 {

	
	public static int kacadet (String metin2,char harf2) { //Aşağıdakilerle farklı bir değişkendir.(Parantez içinde türler tanımlanmalı!).
		int i,uzunluk,sayac;
		
		uzunluk=metin2.length();
		sayac = 0;
		
		for(i=0;i<uzunluk;i++) {
			if (metin2.charAt(i)==harf2)//Eğer metinin ilk karakteri(charAt(i)) aranan harfe eşit ise,
				sayac++;// Sayacı bir arttır.
			
		}
		return sayac;//Döngüden çıktığımızda kaç adet olduğunu sayaç değişkeni tutacak. O yüzden o dönecek.
		
	}
	
	public static void main(String[] args) {
    String metin;
    char harf;
    Scanner input = new Scanner(System.in);
		
    System.out.println("Bir metin giriniz: ");
    metin=input.nextLine();
    System.out.println("Aranan karakteri giriniz: ");
    harf=input.next().charAt(0);//Bir sözcük girilse bilen onun ilk harfini alır.
    
    System.out.println(kacadet(metin,harf));//Fonksiyonu çağırıp,burda aldığımız metni ve harfi gönderiyoruz.//Burdan yukarı gider.
		
	}

}

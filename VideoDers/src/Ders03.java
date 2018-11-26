import java.util.Scanner;
public class Ders03 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 
		 String verial;
		 int i,sayac,uzunluk;
		 
		 System.out.println("Bir yazı giriniz: ");
		 verial=input.nextLine();
		
		
		
		 uzunluk=verial.length();//Uzunluğu  ölçer.
		 sayac=0;
		 
		 for(i=0;i<uzunluk;i++) 
		 {
			 if(verial.charAt(i)=='a') sayac++;	//Verial'ın harflerini tek tek al i'ye at.Eşitse a'ya i'yi 1 artır.	 
			 
		 }
		 
		 
		 System.out.println("String ifade de "+sayac+" a harfi vardır.");
		
		 
			 
		 }

	}



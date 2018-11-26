import java.util.Scanner;
public class Ders10 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int i,enbuyuk;
		
		int[] array=new int [10];//10 elemanlı bir dizi oluştur
		
		for(i=0;i<10;i++) {//Döngü ile girilecek.
			System.out.println(i+(". Sayıyı giriniz"));//Ekrana sayı girmeyi yazdır.
			array [i]= scan.nextInt();//Sayıyı al.
		}
		enbuyuk=array[0];//En büyüğü 0 al
		for(i=1;i<10;i++) {//Diğerleri ile karşılaştır.
			if(array[i]>enbuyuk) enbuyuk=array[i];//Eğer karşılaştırılan eleman en büyükten büyükse,en büyük o olsun.
		}
			
System.out.println("En büyük sayı: "+enbuyuk);//Ekrana yazdır.
	}

}

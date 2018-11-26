import java.util.Scanner;
public class Ders12 {

	
	public static int cikar(int a,int b) {//türünü tanımla,(işlemi tanımla)
		if(a>=b) return(a-b);//şart ve değeri tanımla
		else return (b-a);//şart ve değeri tanımla
				
		
	}
		
	
	
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int a,b;
		
		System.out.println("1. sayıyı giriniz: ");
		a=scan.nextInt();
		System.out.println("1. sayıyı giriniz: ");
		b=scan.nextInt();

		System.out.println(cikar(a,b));//Yazdır.
	}

}

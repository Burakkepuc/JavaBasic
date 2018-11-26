import java.util.Scanner;

public class Ek_ders_09 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int[] array= new int[5];
		
		for(int i=0;i<5;i++) {
			System.out.println(i+1+". Sayıyı giriniz: ");
			array[i]=input.nextInt();
			
		}
		
		for(int i=0;i<5;i++) {
			System.out.println(array[i]);
		}

	}

}

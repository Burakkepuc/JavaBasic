
public class Ders14 {

	
	public static int topla(int a,int b) {
		return a+b;
	}
	
	public static int topla(int a,int b,int c) {
		return a+b+c;
	}
	
	public static void main(String[] args) 
	{
	
		
		
		Ders14 d =new Ders14();
		
		int sonuc;
		
	sonuc=	d.topla(5,8,13);
	System.out.println(sonuc);
	sonuc= d.topla(5, 8);
System.out.println(sonuc);
	}

}

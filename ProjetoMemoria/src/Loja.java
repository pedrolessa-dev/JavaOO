
public class Loja {
	public static void main(String[] args) {
//		System.out.println("------------ Antes --------------");
//		Produto p1 = new Produto();
//		
//		System.out.println("p1 = " + );
//		
//		System.out.println("------------ Depois --------------");
		
		String s1 = "Professor Isidro";
		s1 = "Isidro";
		
		String S1 = "Oi";
		String S2 = "Oi";
		
		if (S1 == S2) {
			System.out.println("Mesma String");
		} else {
			System.out.println("Strings diferentes");
		}
		
		String S3 = new String("Oi");
		String S4 = new String("Oi");
		
		if (S3 == S4) {
			System.out.println("Mesma String");
		} else {
			System.out.println("Strings diferentes");
		}
		
		if (S3.equals(S4)) {
			System.out.println("Mesma String");
		} else {
			System.out.println("Strings diferentes");
		}
	}
}

package tr.edu.medipol;

public class hesaplamalar {

	//public static void main(String[] args) {
		
		public static int faktoryelloop(int n) {
				
			int sonuc = 1; 
			for(int i=n; i>1; i--) {
				sonuc=sonuc*i;
			}
			return sonuc;
		}
		
		public static int topla (int sayi1, int sayi2 , int sayi3) {
			
			int sonuc= sayi1 + sayi2 + sayi3;
			return sonuc;
		}
		public static int cikar (int sayi1, int sayi2 , int sayi3) {
			
			int sonuc= sayi1 - sayi2 - sayi3;
			return sonuc;
		}
		public static int carp (int sayi1, int sayi2 , int sayi3) {
			
			int sonuc= sayi1 * sayi2 * sayi3;
			return sonuc;
		}
		


	}

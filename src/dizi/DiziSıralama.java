package dizi;
import java.util.Scanner;
import java.util.Arrays;

public class DiziSıralama {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Dizinin boyutu n: ");
		int n = scanner.nextInt();
		int[] dizi =  new int[n];
		System.out.println("Dizinin elemanlarını giriniz: ");
		for(int i=0; i<dizi.length;i++) {
			int x = scanner.nextInt();
			dizi[i] =x;
			System.out.println(i+1 + ".Elamanı: " + dizi[i]);
		}
		
		Arrays.sort(dizi);
		System.out.println("Sıralama " + Arrays.toString(dizi));
		
		
	}

}

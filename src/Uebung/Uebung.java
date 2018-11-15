package Uebung;

import java.util.Locale;
import java.util.Scanner;

public class Uebung {

	public static void main(String[] args) {
		
		System.out.print("Geben Sie die Zahl ein, die drei werden soll:");
		Scanner in = new Scanner(System.in).useLocale(Locale.ENGLISH);
		double zahl = in.nextDouble();
		zahl = drei(zahl);
		in.close();
		
		System.out.println();
		System.out.println("Ihre Zahl ist nun:" + zahl);

	}
	
	public static double drei(double zahl) {
	zahl =3;
	return zahl;
	}
}

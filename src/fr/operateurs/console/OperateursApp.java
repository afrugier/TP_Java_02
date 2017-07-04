package fr.operateurs.console;

import java.util.Scanner;

public class OperateursApp {
	public static void main(String[] args) {
		System.out.println("***** Application Opérateurs *****");
		
		System.out.println("Veuillez saisir le premier nombre…");
		Scanner questionUser = new Scanner(System.in) ;
		int N1 = questionUser.nextInt() ;
		
		System.out.println("Veuillez saisir le second nombre…");
		Scanner questionUser2 = new Scanner(System.in) ;
		int N2 = questionUser2.nextInt() ;

		System.out.println(N1+" + "+N2+" = "+(N1+N2));
		System.out.println(N1+" - "+N2+" = "+(N1-N2));
		System.out.println(N1+" * "+N2+" = "+(N1*N2));
		System.out.println(N1+" / "+N2+" = "+(N1/N2));
		System.out.println(N1+" % "+N2+" = "+(N1%N2));
	}
}

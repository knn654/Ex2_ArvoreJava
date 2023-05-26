package view;

import model.Arvore;

public class Principal {

	public static void main(String[] args) {
		int[] vetor = {33, 15, 41, 38, 47, 34, 49, 43};
		Arvore arvore = new Arvore();
		for (int i : vetor) {
			arvore.insert(i);
		}
		try {
			System.out.println("Prefixo: ");
			arvore.prefixSearch();
			System.out.println();
			System.out.println("Infixo: ");
			arvore.infixSearch();
			System.out.println();
			System.out.println("Pósfixo");
			arvore.postfixSearch();
			System.out.println();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}


package seminar6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class task1 {
    public static void main(String[] args) throws Exception {

		Notebook notebook1 = new Notebook("MacBook", 16, 512, "Mac Os", "black", 12.5);
		Notebook notebook2 = new Notebook("Lenovo", 32, 256, "Windows 10", "white", 14.1);
		Notebook notebook3 = new Notebook("Dexp", 8, 128, "Windows 8", "blue", 12.2);
		Notebook notebook4 = new Notebook("Asus", 32, 1024, "Windows 11", "gray", 17.6);
		Notebook notebook5 = new Notebook("Acer", 16, 512, "Windows 11", "black", 13.5);
		Notebook notebook6 = notebook1;

		Set<Notebook> unicNotebook = new HashSet<Notebook>();
		unicNotebook.add(notebook1);
		unicNotebook.add(notebook2);
		unicNotebook.add(notebook3);
		unicNotebook.add(notebook4);
		unicNotebook.add(notebook5);
		unicNotebook.add(notebook6);

		System.out.printf("Unique notebooks in store, total: %d \n", unicNotebook.size());

		for (Notebook notebook : unicNotebook) {
			System.out.println();
			System.out.println(notebook);
		}

		Map<Integer, String> mapCrit = new HashMap<>();
		mapCrit.put(1, "RAM size");
		mapCrit.put(2, "HDD (or SSD) size");
		mapCrit.put(3, "OS");
		mapCrit.put(4, "Colour");
		mapCrit.put(5, "Display size");

		Scanner sc = new Scanner(System.in);
		System.out.println("Input minimal parameter for search \n1. RAM size: ");
		int ramUser = sc.nextInt();

		System.out.println("HDD (or SSD) size: ");
		int storUser = sc.nextInt();

		System.out.println("Display size");
		double digUser = sc.nextDouble();

		System.out.println();
		System.out.println("--------------");
		System.out.println("Search result: ");
		System.out.println();

		for (Notebook note : unicNotebook) {
			if ((note.getRam() >= ramUser) && (note.getStorageCap() >= storUser) && note.getDiagonal() >= digUser) {
				System.out.println(note.toString());
			}
		}
		sc.close();
	}
}

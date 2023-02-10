package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		//vai fazer umas listagem de todas as pastas/diretórios a partir do caminho passado.
		File[] folders = path.listFiles(File::isDirectory);
		
		System.out.println("Folders: ");
		for (File folder : folders) {
			System.out.println(folder);
		}
		
		sc.close();
	}
}

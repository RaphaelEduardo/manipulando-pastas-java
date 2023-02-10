package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		//listagem de todas as pastas/diretórios a partir do caminho passado.
		File[] folders = path.listFiles(File::isDirectory);
		
		System.out.println();
		System.out.println("FOLDERS: ");
		for (File folder : folders) {
			System.out.println(folder);
		}
		
		//listagem de todos os arquivos a partir do caminho passado.
		File[] files = path.listFiles(File::isFile);
		
		System.out.println();
		System.out.println("FILES: ");
		for (File file : files) {
			System.out.println(file);
		}
		
		//criando uma sub pasta a partir do caminho informado.
		boolean sucess = new File(strPath + "\\SubPasta").mkdir();
		System.out.println();
		System.out.println("Directory created sucessfully: " + sucess);
		
		sc.close();
	}
}

package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a folder path: ");
		String strPath1 = sc.nextLine();
		
		File path1 = new File(strPath1);
		
		//listagem de todas as pastas/diretórios a partir do caminho passado.
		File[] folders = path1.listFiles(File::isDirectory);
		
		System.out.println();
		System.out.println("FOLDERS: ");
		for (File folder : folders) {
			System.out.println(folder);
		}
		
		//listagem de todos os arquivos a partir do caminho passado.
		File[] files = path1.listFiles(File::isFile);
		
		System.out.println();
		System.out.println("FILES: ");
		for (File file : files) {
			System.out.println(file);
		}
		
		//criando uma sub pasta a partir do caminho informado.
		boolean sucess = new File(strPath1 + "\\SubPasta").mkdir();
		System.out.println();
		System.out.println("Directory created sucessfully: " + sucess);
		
		
		System.out.println();
		System.out.println("Enter a file path: ");
		String strPath2 = sc.nextLine();
		
		File path2 = new File(strPath2);
		
		System.out.println();
		//obtendo informacoes sobre o nome de um arquivo
		System.out.println("getName: " + path2.getName());
		
		//obtendo informacoes sobre o caminho de um arquivo (sem o nome do arquivo).
		System.out.println("getParent: " + path2.getParent());
		
		//obtendo informacoes sobre o caminho completo de um arquivo.
		System.out.println("getPath: " + path2.getPath());
		
		sc.close();
	}
}

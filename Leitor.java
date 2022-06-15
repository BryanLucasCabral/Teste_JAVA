package validacao_csv;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Leitor {
	public static void main(String[] args) throws FileNotFoundException {
			
			File file = new File("C:\\Users\\Windows10Pro\\Desktop\\teste\\MODELO_ARQUIVO_PARA_IMPORTACAO_DEV.csv");
			try (Scanner sc = new Scanner(file)) {
				while(sc.hasNextLine()) {
					System.out.println(sc.nextLine());
				}
			}
		}
	}

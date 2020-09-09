import java.io.File;
import java.io.FileInputStream;

public class Leitura {
	public static void main(String[] args) {
		String endereco = "C:\\Users\\estud\\Desktop\\fatec 2º semestre 2020\\Materia\\IES301 - Laboratório de Engenharia de Software\\aula 2\\arquivo1.txt";
		File file = new File(endereco);
		
		try {
			FileInputStream fileInputStream = new FileInputStream(file);
			int i ;
			while((i = fileInputStream.read()) != -1) {
				System.out.print((char) i);				
			}
		} catch (Exception e) {
			System.out.println("Erro ao acessar o arquivo");
		}
	}
}

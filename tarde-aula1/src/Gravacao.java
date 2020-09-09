import java.io.File;
import java.io.FileWriter;

public class Gravacao {
	public static void main(String[] args) {
		String endereco = "C:\\Users\\estud\\Desktop\\fatec 2º semestre 2020\\Materia\\IES301 - Laboratório de Engenharia de Software\\aula 2\\arquivo1.txt";
		File file = new File(endereco);
		
		if (file.exists()) {
			System.out.println("Arquivo existe");
		}else {
			System.out.println("Arquivo não existe");
		}
		
		try (FileWriter fileWriter = new FileWriter(file)) {
			fileWriter.write("Ola Mundo!");
			fileWriter.flush();
			fileWriter.close();
		} catch (Exception e) {
			System.out.printf("Erro ao abrir o arquivo &s para gravação \n",endereco);
		}
		
	}
}

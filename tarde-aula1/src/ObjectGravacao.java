import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.List;

public class ObjectGravacao {
	public static void main(String[] args) {
		String endereco = "C:\\Users\\estud\\Desktop\\fatec 2º semestre 2020\\Materia\\IES301 - Laboratório de Engenharia de Software\\aula 2\\arquivo2.dat";
		File file = new File(endereco);
		List<Object> lista = Arrays.asList("Texto", 1234134, 12.2f, "Outro texto");

		if (file.exists()) {
			System.out.println("Arquivo existe");
		} else {
			System.out.println("Arquivo não existe");
		}

		try (FileOutputStream fileOutputStream = new FileOutputStream(file)) {
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(lista);
			objectOutputStream.close();
			System.out.println("Objeto gravado com sucesso!!");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

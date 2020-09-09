import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

public class ObjectLeitura {
	public static void main(String[] args) {
		String endereco = "C:\\Users\\estud\\Desktop\\fatec 2º semestre 2020\\Materia\\IES301 - Laboratório de Engenharia de Software\\aula 2\\arquivo2.dat";
		File file = new File(endereco);
		
		try (FileInputStream fileInputStream = new FileInputStream(file)) {
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			Object object = objectInputStream.readObject();
			if (object instanceof List<?>) {
				List<Object> lista = (List<Object>) object;
			System.out.println("Lido com sucesso!!");
			for(Object o : lista) {
				System.out.println(o.toString());
			}
			}
		} catch (Exception e) {
			System.out.println("Erro ao acessar o arquivo");
		}
	}
}

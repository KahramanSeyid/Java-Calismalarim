package oopWithNLayeredAppTekrar.core.logging;

public class FileLogger implements Logger {
	public void log(int id, String data, double data1) {
		System.out.println("Dosyaya Loglandı: " + id + " " + data + " , " + data1 + " tl");
	}
}

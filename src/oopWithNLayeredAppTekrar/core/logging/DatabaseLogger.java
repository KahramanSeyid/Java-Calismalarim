package oopWithNLayeredAppTekrar.core.logging;

public class DatabaseLogger implements Logger {
	public void log(int id, String data, double data1) {
		System.out.println("Veritabanına loglandı :" + id + " " + data + " , " + data1 + " tl");
	}

}

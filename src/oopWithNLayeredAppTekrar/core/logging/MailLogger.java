package oopWithNLayeredAppTekrar.core.logging;

public class MailLogger implements Logger {
	public void log(int id, String data, double data1) {
		System.out.println("Mail Gönderildi : " + id + " " + data + " , " + data1 + " tl");
	}
}

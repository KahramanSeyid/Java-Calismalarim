package oopWithNLayeredAppTekrar;

import oopWithNLayeredAppTekrar.business.ProductManager;
import oopWithNLayeredAppTekrar.core.logging.DatabaseLogger;
import oopWithNLayeredAppTekrar.core.logging.FileLogger;
import oopWithNLayeredAppTekrar.core.logging.Logger;
import oopWithNLayeredAppTekrar.core.logging.MailLogger;
import oopWithNLayeredAppTekrar.dataAccess.HibernateProductDao;
import oopWithNLayeredAppTekrar.entities.Product;

public class Main {
	public static void main(String[] args) throws Exception {
		Product product1 = new Product(1, "İphone", 14000);
		Product product2 = new Product(2, "Samsung", 25000);

		Logger[] loggers = { new DatabaseLogger(), new FileLogger(), new MailLogger() };
		ProductManager productManager = new ProductManager(new HibernateProductDao(), loggers);
		productManager.add(product1);
		System.out.println(" ");
		productManager.add(product2);

	}
}

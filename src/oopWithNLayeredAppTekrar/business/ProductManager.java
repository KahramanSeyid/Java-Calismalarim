package oopWithNLayeredAppTekrar.business;

import oopWithNLayeredAppTekrar.core.logging.Logger;
import oopWithNLayeredAppTekrar.dataAccess.ProductDao;
import oopWithNLayeredAppTekrar.entities.Product;

public class ProductManager {
	private ProductDao productDao;
	private Logger[] loggers;

	public ProductManager(ProductDao productDao, Logger[] loggers) {
		this.productDao = productDao;
		this.loggers = loggers;

	}

	public void add(Product product) throws Exception {
		if (product.getUnitPrice() < 10) {
			throw new Exception("Sayı 10'dan küçük olamaz");
		}

		productDao.add(product);

		for (Logger loggers : loggers) {
			loggers.log(product.getId(), product.getName(), product.getUnitPrice());

		}

	}
}

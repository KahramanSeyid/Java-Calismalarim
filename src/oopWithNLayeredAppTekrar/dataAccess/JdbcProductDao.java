package oopWithNLayeredAppTekrar.dataAccess;

import oopWithNLayeredAppTekrar.entities.Product;

public class JdbcProductDao implements ProductDao {
	public void add(Product product) {
		System.out.println("JDBC ile Ürün eklendi");
	}

}

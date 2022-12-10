package oopWithNLayeredAppTekrar.dataAccess;

import oopWithNLayeredAppTekrar.entities.Product;

public class HibernateProductDao implements ProductDao {
	public void add(Product product) {
		System.out.println("Hibernate ile Ürün eklendi");
	}
}

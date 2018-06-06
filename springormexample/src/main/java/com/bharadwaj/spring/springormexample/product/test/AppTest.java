package com.bharadwaj.spring.springormexample.product.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bharadwaj.spring.springormexample.product.dao.ProductDao;
import com.bharadwaj.spring.springormexample.product.entity.Product;

public class AppTest {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		ProductDao dao = (ProductDao) context.getBean("productdao");
//		Product product = new Product();
//		product.setId(3);
//		product.setName("PS4");
//		product.setDescription("Designed by Sony CORP");
//		product.setPrice(250.11);
//		dao.create(product);
		//dao.update(product);
		//dao.delete(product);
		//Product product = dao.find(3);
		List<Product> products = dao.findAll();
		System.out.println(products);
	}

}

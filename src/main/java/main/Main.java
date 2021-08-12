package main;

import config.ProjectConfig;
import models.Product;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.ProductService;

public class Main {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class)) {

            ProductService productService = context.getBean(ProductService.class);

            Product product = new Product();
            product.setName("newProduct");
            product.setPrice(1.2);


            productService.addOneProduct(product);

        }
    }
}

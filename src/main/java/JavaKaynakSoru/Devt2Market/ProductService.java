package JavaKaynakSoru.Devt2Market;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
    List<Product> products = new ArrayList<>();

    public void AddProduct() {
        Product product0 = new Product(0, "Domates", 2.10);
        Product product1 = new Product(1, "Patates", 3.20);
        Product product2 = new Product(2, "Biber", 1.50);
        Product product3 = new Product(3, "Soğan", 2.30);
        Product product4 = new Product(4, "Havuç", 3.10);
        Product product5 = new Product(5, "Elma", 1.20);
        Product product6 = new Product(6, "Muz", 1.90);
        Product product7 = new Product(7, "Çilek", 6.10);
        Product product8 = new Product(8, "Kavun", 4.30);
        Product product9 = new Product(9, "Üzüm", 2.70);
        Product product10 = new Product(10, "Limon", 0.50);
        products.add(product0);
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);
        products.add(product6);
        products.add(product7);
        products.add(product8);
        products.add(product9);
        products.add(product10);
    }

    public ProductService() {
        AddProduct();
        ProductList();
    }

    public void ProductList() {
        for (Product w : products) {
            System.out.println(w);
        }
    }
}

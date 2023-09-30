package JavaKaynakSoru.Devt2Market;



public class Product {
    int code;
    String name;
    double price;

    public Product(int code, String name, double price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }

    public Product() {
    }



    @Override
    public String toString() {
        return "Product{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }




}

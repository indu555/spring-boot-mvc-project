import java.util.List;
public class Main {
    public static void main(String[] args) {
        ProductService ps = new ProductService();

        Product product = new Product("MacbookAir","Laptop","Table1",2024);

        ps.addProduct(product);

        List<Product> ls = ps.getAllProducts();

        for(Product p : ls){
            System.out.println(p);
        }

        Product productByName = ps.getProductByName("MacbookAir");
        System.out.println(productByName);


        List<Product> res1 = ps.getProductWithText("mac");
        System.out.println("Products that contain text");
        System.out.println(res1);

        List<Product> res2 = ps.getExpiredProducts();
        System.out.println("Products that are expired");
        System.out.println(res2);

    }
}
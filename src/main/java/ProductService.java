import java.util.List;
import java.util.ArrayList;
import java.time.Year;

public class ProductService {

    List<Product> products = new ArrayList<>();
    public void addProduct(Product pr){
        products.add(pr);
    }

    public List<Product> getAllProducts(){
        return products;
    }

    public Product getProductByName(String name){
       for(Product product : products){
           if(product.getName().equals(name))
                return product;
       }
       return null;
    }

    public List<Product> getProductWithText(String text){
//        List<Product> res = new ArrayList<>();
//        for(Product product: products){
//            String name = product.getName().toLowerCase();
//            String type = product.getType().toLowerCase();
//            String place = product.getPlace().toLowerCase();
//            if(name.contains(text) || type.contains(text) || place.contains(text))
//                res.add(product);
//        }
        List<Product> res = products.stream().filter(product -> product.getName().toLowerCase().contains(text)).toList();
        return res;
    }

    public List<Product> getExpiredProducts(){
        int year = Year.now().getValue();
        List<Product> res = new ArrayList<>();
        for(Product product: products){
            if(product.getWarranty() < year)
                res.add(product);
        }
        return res;
    }
}

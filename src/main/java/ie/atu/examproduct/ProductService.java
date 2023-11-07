package ie.atu.examproduct;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ProductService {
    ArrayList<Product>list = new ArrayList<>();
    public void add (Product product){
        list.add(product);
    }
    public ArrayList<Product> retrieve() { return list;}


}

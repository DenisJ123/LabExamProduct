package ie.atu.examproduct;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {
    ProductService productService;
    public ProductController(ProductService productService)
    {
        this.productService = productService;
    }
    @GetMapping("/NewUser1/{id}/{name}/{quantity}")
    public String NewUser(@PathVariable int id, @PathVariable String name, @PathVariable int quantity)
    {
        return "productId:  \nproductName:  \nquantity:   " + id + name + quantity;


    }
}


package ee.mihkel.webshop.controller;

import ee.mihkel.webshop.model.Product;
import ee.mihkel.webshop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @GetMapping("products")//localhost:8008/strings/ GET
    public List<Product> getProduct(){
        return productRepository.findAll();
    }

    @GetMapping("products/{index}") //localhost:8008/strings/1 GET
    public List<Product> getProduct(@PathVariable int index){
        return productRepository.findAllById(index).get();
    }

    @DeleteMapping("products/{index}")//localhost:8008/strings/1 DELETE
    public void deleteProduct(@PathVariable int index){
        productRepository.deleteById(index);
    }

    @DeleteMapping("products")//localhost:8008/strings/ POST
    public String deleteAllProduct(){
        productRepository.deleteAll();
        return "Kõik tooted kustutatud.";
    }
    @PostMapping("products")//localhost:8008/strings/ POST
    public void addProduct(@RequestBody Product product) {
        productRepository.save(product);
    }
    @PutMapping("products")//localhost:8008/strings/1
    public void editProduct(@PathVariable int index, @RequestBody Product product) {
        productRepository.save(product);
    }


}

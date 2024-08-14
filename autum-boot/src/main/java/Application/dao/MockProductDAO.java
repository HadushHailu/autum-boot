package Application.dao;

import Application.domain.Product;
import org.autumframework.annotation.Profile;
import org.autumframework.annotation.Service;

import java.util.Collection;
import java.util.HashMap;

@Service
@Profile(value = "test")
public class MockProductDAO implements IProductDAO{
    private HashMap<String, Product> productHashMap = new HashMap<>();

    public void save(Product product){
        productHashMap.put(product.getId(), product);
        System.out.println("MockProductDAO: Product saved!");
    }

    public Product find(String name){
        return productHashMap.get(name);
    }

    public Collection<Product> getAll(){
        return productHashMap.values();
    }
}

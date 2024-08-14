package Application;

import Application.config.ApplicationConfiguration;
import Application.service.ICustomerService;
import Application.service.IProductService;
import org.autumframework.annotation.Autowired;
import org.autumframework.annotation.Service;
import org.autumframework.context.AutumApplication;

@Service
public class Application implements Runnable{
    @Autowired
    ICustomerService customerService;

    @Autowired
    IProductService productService;

    @Autowired
    private ApplicationConfiguration applicationConfiguration;

    public static void main(String[] args) {
        AutumApplication.run(Application.class, args);
    }

    @Override
    public void run() {
        customerService.addCustomer("Hadush", "had@gmail.com", "123-456-789");
        productService.addProduct("XGL-120", 345.9, 13);
        System.out.println("Application: "+applicationConfiguration);
    }
}

package devnoh.demoapp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    /*
    @Component
    @Slf4j
    static class AppConfigRunner implements CommandLineRunner {

        @Autowired
        private ProductService productService;

        @Override
        public void run(String... args) throws Exception {
            for (int i = 0; i < 10; i++) {
                Product product = new Product();
                product.setCode("P00" + i);
                product.setName("Product " + i);
                product.setDescription("This is a cool product " + i);
                product.setActive(i < 8);
                productService.saveProduct(product);
                log.debug("Product saved: {}", product);
            }
        }
    }
    */
}

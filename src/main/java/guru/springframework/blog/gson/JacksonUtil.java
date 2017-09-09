package guru.springframework.blog.gson;

import com.fasterxml.jackson.databind.ObjectMapper;
import guru.springframework.blog.gson.domain.Product;

import java.io.File;
import java.io.IOException;

public class JacksonUtil {

    public static Product jsonDeserialize() throws IOException{
        ObjectMapper mapper = new ObjectMapper();
        File file = new File("/json/product.json");
        /*String abspath = file.getAbsolutePath();
        System.out.println(abspath);*/
        Product product = mapper.readValue(file, Product.class);
        return product;
    }
}

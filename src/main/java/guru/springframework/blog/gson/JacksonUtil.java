package guru.springframework.blog.gson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import guru.springframework.blog.gson.domain.Product;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class JacksonUtil {

    public static Product jsonDeserialize() throws IOException{
        Product product = null;
        ObjectMapper mapper = new ObjectMapper();
        try(Reader reader = new InputStreamReader(JacksonUtil.class.getResourceAsStream("/json/product.json"))){
            product = mapper.readValue(reader, Product.class);
            System.out.println(product.getProductId());
            System.out.println(product.getDescription());
            System.out.println(product.getImageUrl());
            System.out.println(product.getPrice());
        }

        return product;
    }

    public static String jsonSerialize(Product product) throws JsonProcessingException{
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(product);
        System.out.println(json);
        return json;
    }
}

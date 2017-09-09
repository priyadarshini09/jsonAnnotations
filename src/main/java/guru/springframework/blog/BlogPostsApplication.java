package guru.springframework.blog;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import guru.springframework.blog.gson.custom.CustomProductDeserialization;
import guru.springframework.blog.gson.domain.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude = { JacksonAutoConfiguration.class })
public class BlogPostsApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogPostsApplication.class, args);
        /*ObjectMapper objectMapper = new ObjectMapper();
        SimpleModule simpleModule = new SimpleModule();
        simpleModule.addDeserializer(Product.class, new CustomProductDeserialization());
        objectMapper.registerModule(simpleModule);*/
    }
}

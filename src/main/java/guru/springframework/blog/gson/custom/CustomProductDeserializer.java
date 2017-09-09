package guru.springframework.blog.gson.custom;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import guru.springframework.blog.gson.domain.Product;
import guru.springframework.blog.gson.domain.User;

import java.io.IOException;
import java.math.BigDecimal;

public class CustomProductDeserializer extends JsonDeserializer<Product> {
    long l = 10;
    Long longId = new Long(l);
    User user = new User(longId,"John","john99@gmail.com");
    private String productId, description, imageUrl, createdBy;
    private BigDecimal price;
    @Override
    public Product deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        ObjectCodec objectCodec = jsonParser.getCodec();
        JsonNode jsonNode = objectCodec.readTree(jsonParser);
        if(jsonNode.has("product-id")){
            productId = jsonNode.get("product-id").asText();
        }
        if(jsonNode.has("description")){
            description = jsonNode.get("description").asText();
        }
        if(jsonNode.has("image-url")){
            imageUrl = jsonNode.get("image-url").asText();
        }
        if(jsonNode.has("price")){
            price = jsonNode.get("price").decimalValue();
        }
        if (jsonNode.has("createdBy")){
            createdBy = jsonNode.get("createdBy").asText();
        }
        Product product = new Product(productId, description,imageUrl,price,user);
        return product;
    }
}

package guru.springframework.blog.gson.custom;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import guru.springframework.blog.gson.domain.Product;

import java.io.IOException;
import java.math.RoundingMode;

public class CustomProductSerializer extends JsonSerializer<Product>{

    @Override
    public void serialize(Product product, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeStartObject();
        jsonGenerator.writeStringField("product-id", product.getProductId());
        jsonGenerator.writeStringField("description", product.getDescription());
        jsonGenerator.writeStringField("image-url", product.getImageUrl());
        jsonGenerator.writeNumberField("price", product.getPrice().setScale(2, RoundingMode.HALF_UP));
        jsonGenerator.writeStringField("createdBy", product.getCreatedBy().getName());
        jsonGenerator.writeEndObject();
    }
}

package guru.springframework.blog.gson.domain;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import guru.springframework.blog.gson.custom.CustomProductDeserializer;
import guru.springframework.blog.gson.custom.CustomProductSerializer;

import java.math.BigDecimal;

@JsonSerialize(using = CustomProductSerializer.class)
@JsonDeserialize(using = CustomProductDeserializer.class)
public class Product {
    private String productId;
    private String description;
    private String imageUrl;
    //private String version;
    private BigDecimal price;
    public Product(){}
    public Product(String productId, String description, String imageUrl, BigDecimal price) {
        this.productId = productId;
        this.description = description;
        this.imageUrl = imageUrl;
        this.price = price;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /*public String getVersion() { return version; }

    public void setVersion(String version) { this.version = version; }*/



    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", description='" + description + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", price=" + price +
                '}';
    }
}

package guru.springframework.blog.gson;

import guru.springframework.blog.gson.domain.Product;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.math.BigDecimal;

public class JacksonUtilTest {
    private Product product;

    @Before
    public void setUp(){
        product = new Product("P01","Spring Guru Mug","https://springframework.guru/wp-content/uploads/2015/04/spring_framework_guru_shirt-rf412049699c14ba5b68bb1c09182bfa2_8nax2_512.jpg",new BigDecimal(18.95));
    }

    @After
    public void tearDown(){
        product=null;
    }

    /*@Test
    public void jsonDeserialize() throws Exception{
        Product product = JacksonUtil.jsonDeserialize();
        assertNotNull(product);
        assertEquals("235268845711068312", product.getProductId());
        assertEquals("Spring Framework Guru Mug", product.getDescription());
        assertEquals("https://springframework.guru/wp-content/uploads/2015/04/spring_framework_guru_mug-rf412049699c14ba5b68bb1c09182bfa2_8nax2_512.jpg", product.getImageUrl());
        assertEquals(new BigDecimal(14), product.getPrice());
    }*/

    /*@Test
    public void jsonSerialize() throws Exception{
        String result = JacksonUtil.jsonSerialize(product);
        assertEquals(4, result.replace("{", "").replace("}","").split(",").length);
        assertEquals("\"product-id\":\"P01\"", result.replace("{", "").replace("}","").split(",")[0].trim());
        assertEquals("\"description\":\"Spring Guru Mug\"".trim(), result.replace("{", "").replace("}","").split(",")[1].trim());
        assertEquals("\"image-url\":\"https://springframework.guru/wp-content/uploads/2015/04/spring_framework_guru_shirt-rf412049699c14ba5b68bb1c09182bfa2_8nax2_512.jpg\"".trim(), result.replace("{", "").replace("}","").split(",")[2].trim());
        assertEquals("\"price\":18.95".trim(), result.replace("{", "").replace("}","").split(",")[3].trim());
    }*/


}

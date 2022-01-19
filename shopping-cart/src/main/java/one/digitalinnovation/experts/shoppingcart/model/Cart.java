package one.digitalinnovation.experts.shoppingcart.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.util.ArrayList;
import java.util.List;

@Data
@RedisHash("cart")
public class Cart {

    @Id
    private Integer id;
    private List<Item> items = new ArrayList<>();

    public Cart(Integer id) {
        this.id = id;
    }
}

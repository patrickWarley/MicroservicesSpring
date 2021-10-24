package one.digitalinnovation.experts.shoppingcart.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.util.ArrayList;
import java.util.List;

@RedisHash("item")
@Getter
@Setter
public class Cart {
    @Id
    private Integer id;
    private List<Item> items;

    public Cart(){}
    public Cart(Integer id){ this.id =  id;}

    public List<Item> getItems(){
        if(items ==  null){
            items = new ArrayList<Item>();
        }

        return items;
    }

    public void setItems(List<Item> items){ this.items = items;}
}

package comexampleshop.service;

import comexampleshop.component.Basket;
import comexampleshop.model.Item;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ShopService {
    private final Basket basket;

    public ShopService(Basket basket) {
        this.basket = basket;
    }

    public List<Item> add(List<Integer> ids) {
//        return basket.add(
//                ids.stream()
//                        .map(id -> new Item(id))
//                        .collect(Collectors.toList())
//        );
        List<Item> items = new ArrayList<>();
        for (Integer id : ids) {
            Item item = new Item(id);
            items.add(item);
        }
        return basket.add(items);
    }

    public List<Item> get() {
        return basket.get();
    }
}

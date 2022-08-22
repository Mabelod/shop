package comexampleshop.controller;
import comexampleshop.model.Item;
import comexampleshop.service.ShopService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class ShopController {
    private final ShopService shopService;

    public ShopController(ShopService shopService) {
        this.shopService = shopService;
    }


    @GetMapping("/add")
    public List<Item> add(@RequestParam("id") List<Integer> ids) {
        return shopService.add(ids);
    }

    @GetMapping("/get")
    public List<Item> get() {
        return shopService.get();
    }
}

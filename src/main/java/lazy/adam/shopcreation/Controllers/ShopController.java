package lazy.adam.shopcreation.Controllers;

import lazy.adam.shopcreation.Models.Shop;
import lazy.adam.shopcreation.Services.ShopService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@AllArgsConstructor
@RequestMapping("/Shop")
public class ShopController {
    @Autowired
    private  ShopService shopService;

    @PostMapping(value = "/Add")
    public Shop AddShop(@RequestBody Shop shop)
    {
        return shopService.AddShop(shop);
    }
    @DeleteMapping("/Delete/{id}")
    public void RemoveShop(@PathVariable(name="id") String id)
    {
        shopService.RemoveShop(id);
    }
    @PutMapping("/Update/{id}")
    public Shop UpdateShop(Shop shop,@PathVariable(name="id") String id)
    {
        return shopService.UpdateShop(shop,id);
    }
    @GetMapping("/All")
    public List<Shop> getAllShops(){
        return shopService.getAllShops();
    }
}

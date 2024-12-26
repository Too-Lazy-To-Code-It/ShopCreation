package lazy.adam.shopcreation.Services;

import lazy.adam.shopcreation.Models.Shop;
import lazy.adam.shopcreation.Repositories.ShopRepo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@AllArgsConstructor
public class ShopService implements ShopInterface {

    @Autowired
    ShopRepo shopRepo;

    @Override
    public Shop AddShop(Shop shop) {
        return shopRepo.save(shop);
    }

    @Override
    public void RemoveShop(String id) {
            shopRepo.deleteById(id);
    }

    @Override
    public Shop UpdateShop(Shop shop,String id) {
       Shop shop1 = shopRepo.findById(id).orElse(null);
       shop1=shop;
       return shopRepo.save(shop1);
    }

    @Override
    public List<Shop> getAllShops() {
        return shopRepo.findAll();
    }
}

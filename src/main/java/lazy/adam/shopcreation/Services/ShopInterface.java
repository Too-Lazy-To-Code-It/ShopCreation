package lazy.adam.shopcreation.Services;

import lazy.adam.shopcreation.Models.Shop;

import java.util.List;

public interface ShopInterface {

    public Shop AddShop(Shop shop);
    public void RemoveShop(String id);
    public Shop UpdateShop(Shop shop,String id);
    public List<Shop> getAllShops();
}

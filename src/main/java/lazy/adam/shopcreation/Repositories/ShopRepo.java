package lazy.adam.shopcreation.Repositories;

import lazy.adam.shopcreation.Models.Shop;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopRepo extends MongoRepository<Shop, String> {
}

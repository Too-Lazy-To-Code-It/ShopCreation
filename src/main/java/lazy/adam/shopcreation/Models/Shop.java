package lazy.adam.shopcreation.Models;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
@AllArgsConstructor
@ToString
public class Shop {
    @Id
    private String id;
    private String shopName;
    private String name;
    private String lastName;
    @Indexed(unique=true)
    private String email;
    private String phone;
    private String address;

}

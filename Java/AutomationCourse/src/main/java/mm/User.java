package mm;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class User {
    private final String firstName;
    private final String lastName;
    public final ShoppingBasket basket = new ShoppingBasket();
}

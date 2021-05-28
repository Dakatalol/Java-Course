package mm;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@NoArgsConstructor
public class Book {
    private String name;
    private double bookPrice;
    private double discountedPrice;
    private Boolean isPrime;
}



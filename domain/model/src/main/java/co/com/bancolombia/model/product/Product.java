package co.com.bancolombia.model.product;
import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@AllArgsConstructor
@Builder(toBuilder = true)
public class Product {

    private final ProductName name;
    private final ProductId id;
    private final ProductDescription description;
}

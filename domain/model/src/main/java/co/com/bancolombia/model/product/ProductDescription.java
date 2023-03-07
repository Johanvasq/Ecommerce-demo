package co.com.bancolombia.model.product;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class ProductDescription {
    private final String value;
}

package co.com.bancolombia.model.product.gateways;

import co.com.bancolombia.model.product.Product;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public interface ProductRepository {
    Mono<Product> createProduct(Mono<Product> product);
    Mono<Product> updateProduct(Mono<Product> product);
    Mono<Product> removeProduct(Long productId);
    Mono<Product> getProduct(Long productId);
    Flux<Product> getAllProducts();
}

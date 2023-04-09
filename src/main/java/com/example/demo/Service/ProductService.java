package com.example.demo.Service;

import com.example.demo.DTO.ProductRequestDTO;
import com.example.demo.DTO.ProductResponseDTO;
import com.example.demo.Entity.Product;
import com.example.demo.Repository.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class ProductService {

    @Autowired
    private ProductRepository productRepository;


    public void createProduct(ProductRequestDTO productDTO){
        Product product = Product.builder()
                .name(productDTO.getName())
                .description(productDTO.getDescription())
                .price(productDTO.getPrice())
                .build();
        productRepository.save(product);
        log.debug("Prodotto {} salvato",product.getId());
    }


public List<ProductResponseDTO> readAllValue(){
        List<Product>  products = productRepository.findAll();
        return products.stream().map(this::mapProductToProductResponseDTO).collect(Collectors.toList());
}

private ProductResponseDTO mapProductToProductResponseDTO(Product product){
        return ProductResponseDTO.builder()
                .id(product.getId())
                .name(product.getName())
                .description(product.getDescription())
                .price(product.getPrice())
                .build();

}

}

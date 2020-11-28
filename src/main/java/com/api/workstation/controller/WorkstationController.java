package com.api.workstation.controller;



import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@CrossOrigin("*")
@RestController
public class WorkstationController /*extends BaseController implements WorkstationApi */{
  /*
    @Autowired
    private ProductRepository productRepository;

    @Override
    public ResponseEntity<ApiProductCodeTO> createProduct(@Valid ApiProductTO newProduct) {

        Product product = Product.builder()
                .name(newProduct.getName())
                .description(newProduct.getDescription())
                .category(newProduct.getCategory())
                .user(newProduct.getUser())
                .date(newProduct.getDate())
                .build();

        productRepository.save(product);

        ApiProductCodeTO response = new ApiProductCodeTO();
        return new ResponseEntity<>( CREATED);
    }

    @Override
    public ResponseEntity<ApiResponseProductsTO> getProduct(String code) {
        Optional<Product> optional = productRepository.findById(code);
        if (!optional.isPresent()) throw new ResponseStatusException(NOT_FOUND, "Unable to find resource");
        ApiResponseProductsTO list = new ApiResponseProductsTO();
        ApiProductResponseTO to =  convertValue(optional.get(), ApiProductResponseTO.class);
        list.addProductItem(to);
        return new ResponseEntity<>(list, OK);
    }

    @Override
    public ResponseEntity<ApiResponseProductsTO> getProducts() {
        List<Product> products = productRepository.findAll();

        ApiResponseProductsTO apiResponseProductsTO = new ApiResponseProductsTO();
        products.forEach(product -> {
            ApiProductResponseTO to =  convertValue(product, ApiProductResponseTO.class);
            apiResponseProductsTO.addProductItem(to);
        });

        return new ResponseEntity<>(apiResponseProductsTO, OK);
    }

    @Override
    public ResponseEntity<Void> updateProduct(String code, @Valid ApiUpdateProductTO product) {
        Optional<Product> optional = productRepository.findById(code);
        Product prod = optional.get();
        Product up = prod.builder()
                .code(prod.getCode())
                .name(product.getName())
                .description(product.getDescription())
                .category(product.getCategory())
                .price(product.getPrice())
                .date(prod.getDate())
                .user(prod.getUser())
                .build();
        productRepository.save(up);

        return new ResponseEntity<>(OK);
    }*/
}



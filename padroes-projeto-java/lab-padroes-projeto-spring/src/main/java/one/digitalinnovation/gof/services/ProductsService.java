package one.digitalinnovation.gof.services;

import one.digitalinnovation.gof.entities.Products;


public interface ProductsService {

    Iterable<Products> findAll();

    Products findById(Long id);

    void insert(Products product);

    void update(Long id, Products product);

    void delete(Long id);
}
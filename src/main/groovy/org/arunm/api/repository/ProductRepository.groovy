package org.arunm.api.repository

import org.arunm.api.entity.Product
import org.springframework.data.repository.CrudRepository

public interface ProductRepository extends CrudRepository<Product,Integer> {

    List<Product> findAll()

    Optional<Product> findProductByProductId(Integer id)
}
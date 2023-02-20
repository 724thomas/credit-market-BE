package com.example.creditmarket.repository;


import com.example.creditmarket.entity.EntityFProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepository extends JpaRepository<EntityFProduct, String> {

    @Query(value = "select * from tb_fproduct where fproduct_credit_product_type_name = :type", nativeQuery = true)
    List<EntityFProduct> findProductsByUserPref(@Param("type") String type);

}
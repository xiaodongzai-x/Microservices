package com.example.order.dao;

import com.example.order.entity.Shop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import javax.annotation.Resource;

/**
 * Created by IntelliJ IDEA.
 * User: xiao
 * Date: 2020/9/4
 */
@Resource
public interface ShopDao extends JpaRepository<Shop, Integer>, JpaSpecificationExecutor<Shop> {
    @Query(value = "select * from t_shop where id=?1", nativeQuery = true)
    public Shop findShopById(Integer id);
}

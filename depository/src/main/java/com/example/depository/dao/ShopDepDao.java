package com.example.depository.dao;

import com.example.depository.entity.ShopDep;
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
public interface ShopDepDao extends JpaRepository<ShopDep, Integer>, JpaSpecificationExecutor<ShopDep> {
    @Query(value="select * from t_depository where id=?1",nativeQuery=true)
    public ShopDep findShopDepById(Integer id);
}

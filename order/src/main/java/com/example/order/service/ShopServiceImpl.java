package com.example.order.service;


import com.example.order.dao.ShopDao;
import com.example.order.entity.Shop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by IntelliJ IDEA.
 * User: xiao
 * Date: 2020/9/4
 */
@Service("shopService")
@Transactional
public class ShopServiceImpl implements ShopService {
    @Autowired
    private ShopDao shopDao;


    @Override
    public Shop findShopById(Integer id) {
        return shopDao.findShopById(id);
    }
}

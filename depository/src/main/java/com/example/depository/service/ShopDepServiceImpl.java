package com.example.depository.service;

import com.example.depository.dao.ShopDepDao;
import com.example.depository.entity.ShopDep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * Created by IntelliJ IDEA.
 * User: xiao
 * Date: 2020/9/4
 */
@Transactional
@Service("shopDepService")
public class ShopDepServiceImpl implements ShopDeoService {
    @Autowired
    private ShopDepDao shopDepDao;
    @Override
    public void save(Integer id) {
        ShopDep shopDep = shopDepDao.findShopDepById(id);
        if (shopDep!=null){
            int s = shopDep.getNumber()-1;
            shopDep.setNumber(s);
            shopDepDao.save(shopDep);
        }
    }
}

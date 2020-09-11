package com.example.depository.controller;

import com.example.depository.service.ShopDeoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * User: xiao
 * Date: 2020/9/4
 */
@RequestMapping("/shopDep")
@RestController
public class ShopDepController {
    @Autowired
    private ShopDeoService shopDeoService;
    @RequestMapping("/save")
    public String save(Integer id){
        System.out.println(id);
        shopDeoService.save(id);
        return "商品已出库";
    }
}

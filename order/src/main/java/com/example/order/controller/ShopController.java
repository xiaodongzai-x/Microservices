package com.example.order.controller;

import com.example.order.entity.Shop;
import com.example.order.service.ShopService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

/**
 * Created by IntelliJ IDEA.
 * User: xiao
 * Date: 2020/9/4
 */
@RequestMapping("/shop")
@RestController
public class ShopController {
    @Autowired
    private ShopService shopService;

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/find")
    @HystrixCommand(fallbackMethod = "processHystrix_Get")
    public String findShopById(@RequestParam Integer id) {
        Shop shop = shopService.findShopById(id);
        String forObject = "";
        if (shop != null) {
            forObject = restTemplate.getForObject("http://depository/shopDep/save?id=" + id, String.class);
            return "下单成功"+"++++++++++++" + forObject;
        }
        if(shop==null){
            throw new RuntimeException("该ID：" + id +"没有没有对应的信息！");
        }
        return "系统异常";
    }

    /**
     * 发生异常的时候,会调用这个方法来处理
     * @param id
     * @return
     */
    public String processHystrix_Get(@PathVariable("id") Integer id){
        return "该ID：" + id + "没有没有对应的信息--@HystrixCommand";
    }
}

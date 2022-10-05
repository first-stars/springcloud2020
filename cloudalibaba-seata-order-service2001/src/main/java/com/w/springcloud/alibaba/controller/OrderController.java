package com.w.springcloud.alibaba.controller;

import com.w.springcloud.alibaba.dao.OrderDao;
import com.w.springcloud.alibaba.domain.CommonResult;
import com.w.springcloud.alibaba.domain.Order;
import com.w.springcloud.alibaba.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @auther zzyy
 * @create 2020-02-26 15:24
 */
@RestController
public class OrderController
{
    @Resource
    private OrderService orderService;

    @Resource
    private OrderDao orderDao;


    @GetMapping("/order/create")
    public CommonResult create(Order order)
    {
        orderService.create(order);
        return new CommonResult(200,"订单创建成功");
    }

    @GetMapping("/order")
    public CommonResult order()
    {
        int count =orderDao.testselect();
        System.out.println(count);
        return new CommonResult(200,"订单创建成功");
    }
}

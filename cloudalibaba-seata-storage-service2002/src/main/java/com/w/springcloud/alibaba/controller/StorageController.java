package com.w.springcloud.alibaba.controller;


import com.w.springcloud.alibaba.domain.CommonResult ;
import com.w.springcloud.alibaba.service.StorageService ;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class StorageController {

    @Autowired
    private StorageService storageService;

    /**
     * 扣减库存
     */
    @RequestMapping("/storage/decrease")
    public CommonResult decrease(Long productId, Integer count) {
        log.info("2001**************2002,");
        storageService.decrease(productId, count);
        return new CommonResult(200,"扣减库存成功！");
    }
}

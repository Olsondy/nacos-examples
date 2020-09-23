package com.alibaba.nacos.example.spring.cloud.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author DINGYONG
 * @title RemoteClient
 * @package com.alibaba.nacos.example.spring.cloud
 * @description 
 * @date 2020/9/23
 */
@FeignClient(name = "nacos-provider", fallback = RemoteHystrix.class)
public interface RemoteClient {

    @RequestMapping(value = "/echo/{str}", method = RequestMethod.GET)

    String echoHello(@PathVariable("str") String str);
}

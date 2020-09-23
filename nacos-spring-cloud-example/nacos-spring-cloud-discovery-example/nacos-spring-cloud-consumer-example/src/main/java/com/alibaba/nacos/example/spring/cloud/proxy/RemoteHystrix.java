package com.alibaba.nacos.example.spring.cloud.proxy;

import org.springframework.stereotype.Component;

/**
 * @author DINGYONG
 * @title RemoteHystrix
 * @package com.alibaba.nacos.example.spring.cloud.proxy
 * @description 
 * @date 2020/9/23
 */
@Component
public class RemoteHystrix implements RemoteClient {

    @Override
    public String echoHello(String str) {
        return "Request Timeout";
    }
}

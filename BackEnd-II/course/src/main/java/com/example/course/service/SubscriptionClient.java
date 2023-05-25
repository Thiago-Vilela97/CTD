package com.example.course.service;

import com.example.course.CustomLoadBalanceConfiguration;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("SUBSCRIPTION-SERVICE")
@LoadBalancerClient(value = "SUBSCRIPTION-SERVICE", configuration = CustomLoadBalanceConfiguration.class)
public interface SubscriptionClient {

    @GetMapping("/subscription/port")
    String getPort();
}

package com.animal.service;

import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("ESPECIE-SERVICE")
@LoadBalancerClient(value = "ESPECIE-SERVICE")
public interface EspecieClient {
}

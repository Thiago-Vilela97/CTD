package com.example.gateway;

import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

import java.util.Calendar;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Logger;

@Component
public class SubscriptionFilter extends AbstractGatewayFilterFactory<SubscriptionFilter.Config> {
    private static Logger log = Logger.getLogger(LogFilter.class.getName());
    private static AtomicInteger COUNT_CALL_GATEWAY = new AtomicInteger(0);

    public SubscriptionFilter() {
        super(Config.class);
    }

    @Override
    public GatewayFilter apply(Config config) {
        return (exchange, chain) -> {
            return chain.filter(exchange).then(Mono.fromRunnable(() -> {
                //Filtro posterior a invocação do serviço real associado ao gateway
                log.info("Time Response : " + Calendar.getInstance().getTime());
                log.info("Número de chamadas ao gateway: " + COUNT_CALL_GATEWAY.incrementAndGet());
            }));
        };
    }
    public static class Config {
    }
}

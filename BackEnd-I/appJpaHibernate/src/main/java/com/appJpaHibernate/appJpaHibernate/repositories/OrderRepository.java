package com.appJpaHibernate.appJpaHibernate.repositories;

import com.appJpaHibernate.appJpaHibernate.entities.Order;

import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<Order, Long> {
}

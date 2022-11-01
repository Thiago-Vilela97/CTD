package com.appJpaHibernate.appJpaHibernate.repositories;

import com.appJpaHibernate.appJpaHibernate.entities.OrderItem;
import com.appJpaHibernate.appJpaHibernate.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}

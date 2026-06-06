package com.selinarslan.demoproject.currency_exchange_service.Repository;


import com.selinarslan.demoproject.currency_exchange_service.Entity.CurrencyExchange;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange, Long> {
    CurrencyExchange findByFromAndTo(String from, String to);
}

package com.example.assingmentspring.repository;


import com.example.assingmentspring.entity.Market;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MyMarketRepository extends JpaRepository<Market, Long> {
    List<Market> findAllByNameAndStatus(String name, int status);
}

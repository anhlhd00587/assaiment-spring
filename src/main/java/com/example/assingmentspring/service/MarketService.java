package com.example.assingmentspring.service;



import com.example.assingmentspring.entity.Market;
import com.example.assingmentspring.repository.MyMarketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.List;

@Service
public class MarketService {
    @Autowired
    MyMarketRepository myMarketRepository;
    public List<Market> search(String name){
        return myMarketRepository.findAllByNameAndStatus(name, 1);
    }
    public Market createNew(Market market){
        market.setId(Calendar.getInstance().getTimeInMillis());
        myMarketRepository.save(market);
        return market;
    }

    public List<Market> getListMarket(){
        return myMarketRepository.findAll();
    }

    public Market findById(long id){
        return myMarketRepository.findById(id).orElse(null);
    }
}

package com.likelion.threetier.Service.Impl;

import com.likelion.threetier.Repository.DemoRepository;
import com.likelion.threetier.Service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {
    @Autowired
    private DemoRepository demoRepository;
    public String getString(){
        return demoRepository.getString();
    }
}

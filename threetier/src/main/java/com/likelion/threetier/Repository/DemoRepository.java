package com.likelion.threetier.Repository;

import org.springframework.stereotype.Repository;

@Repository
public class DemoRepository {
    public String getString(){
        return "HelloWorld";
    }
}

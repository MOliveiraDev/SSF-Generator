package com.springboot.GenerateN.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springboot.GenerateN.Repository.Repository;

import java.util.Random;

@Service
public class ServiceGenerate {

    @Autowired
    private Repository repository;

    private String gerarPrimeirosDigitos(){
        Random random = new Random();
        StringBuilder   sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            sb.append(random.nextInt(10));
        }
        return sb.toString();
    }
}

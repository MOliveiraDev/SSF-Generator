package com.springboot.GenerateN.Controller;

import com.springboot.GenerateN.Model.ModelGenerate;
import com.springboot.GenerateN.Repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.springboot.GenerateN.Service.ServiceGenerate;

@RestController
@RequestMapping("/Usuario")
public class ControllerGenerate {

    @Autowired
    private Repository repository;

    public ModelGenerate gerarUsuario(ModelGenerate modelGenerate) {
        repository.save(modelGenerate);
        return modelGenerate;
    }
}

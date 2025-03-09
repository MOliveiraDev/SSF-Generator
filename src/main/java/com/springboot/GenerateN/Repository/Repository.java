package com.springboot.GenerateN.Repository;

import com.springboot.GenerateN.Model.ModelGenerate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<ModelGenerate, Long> {
}

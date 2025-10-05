package com.search.ai.service.impl;

import com.search.ai.repository.ModelEntity;
import com.search.ai.repository.ModelRepository;
import com.search.ai.service.ModelDataQueryService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ModelDataQueryServiceImpl implements ModelDataQueryService {

    private final ModelRepository modelRepository;

    @Override
    public List<ModelEntity> findAll () {
        return modelRepository.findAll();
    }
}

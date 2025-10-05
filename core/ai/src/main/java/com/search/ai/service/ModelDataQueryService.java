package com.search.ai.service;

import com.search.ai.repository.ModelEntity;

import java.util.List;

public interface ModelDataQueryService {

    public List<ModelEntity> findAll ();
}

package com.ms_votecount_and_result;
//import com.ms_voting_mgmt.*;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResultServiceImpl implements ResultService {
    private final ResultRepository resultRepository;

    @Autowired
    public ResultServiceImpl(ResultRepository resultRepository) {
        this.resultRepository = resultRepository;
    }

    @Override
    public List<Result> getAllResults() {
        return resultRepository.findAll();
    }

    @Override
    public Result getResultById(Long resultId) {
        return resultRepository.findById(resultId).orElse(null);
    }

    @Override
    public Result saveResult(Result result) {
        return resultRepository.save(result);
    }

    @Override
    public void deleteResult(Long resultId) {
        resultRepository.deleteById(resultId);
    }
}


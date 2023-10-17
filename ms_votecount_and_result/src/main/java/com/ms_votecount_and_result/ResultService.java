package com.ms_votecount_and_result;
//import com.ms_voting_mgmt.*;

import java.util.List;

public interface ResultService {
    List<Result> getAllResults();

    Result getResultById(Long resultId);

    Result saveResult(Result result);

    void deleteResult(Long resultId);
}


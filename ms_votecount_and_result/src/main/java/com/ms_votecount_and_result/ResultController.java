package com.ms_votecount_and_result;
//import com.ms_voting_mgmt.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/results")
public class ResultController {
    @Autowired
    private ResultService resultService;




    @GetMapping
    public List<Result> getAllResults() {
        return resultService.getAllResults();
    }

    @GetMapping("/{resultId}")
    public Result getResultById(@PathVariable Long resultId) {
        return resultService.getResultById(resultId);
    }

    @PostMapping
    public Result saveResult(@RequestBody Result result) {
        return resultService.saveResult(result);
    }

    @DeleteMapping("/{resultId}")
    public void deleteResult(@PathVariable Long resultId) {
        resultService.deleteResult(resultId);
    }
}


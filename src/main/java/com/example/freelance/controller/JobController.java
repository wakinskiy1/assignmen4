package com.example.freelance.controller;

import com.example.freelance.model.Job;
import com.example.freelance.service.JobService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jobs")
public class JobController {
    private final JobService jobService;

    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    @GetMapping
    public List<Job> getAllJobs() {
        return jobService.getAllJobs();
    }

    @PostMapping
    public Job createJob(@RequestBody Job job) {
        return jobService.saveJob(job);
    }
}

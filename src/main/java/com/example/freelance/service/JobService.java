package com.example.freelance.service;

import com.example.freelance.model.Job;
import com.example.freelance.repository.JobRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    private final JobRepository jobRepository;

    public JobService(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    public List<Job> getAllJobs() {
        return jobRepository.findAll();
    }

    public Job saveJob(Job job) {
        return jobRepository.save(job);
    }
}

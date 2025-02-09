package com.example.freelance.service;

import com.example.freelance.model.Freelancer;
import com.example.freelance.repository.FreelancerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FreelancerService {
    private final FreelancerRepository freelancerRepository;

    public FreelancerService(FreelancerRepository freelancerRepository) {
        this.freelancerRepository = freelancerRepository;
    }

    public List<Freelancer> getAllFreelancers() {
        return freelancerRepository.findAll();
    }

    public Freelancer saveFreelancer(Freelancer freelancer) {
        return freelancerRepository.save(freelancer);
    }
}

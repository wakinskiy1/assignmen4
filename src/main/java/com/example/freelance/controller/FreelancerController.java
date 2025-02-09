package com.example.freelance.controller;

import com.example.freelance.model.Freelancer;
import com.example.freelance.service.FreelancerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/freelancers")
public class FreelancerController {
    private final FreelancerService freelancerService;

    public FreelancerController(FreelancerService freelancerService) {
        this.freelancerService = freelancerService;
    }

    @GetMapping
    public List<Freelancer> getAllFreelancers() {
        return freelancerService.getAllFreelancers();
    }

    @PostMapping
    public Freelancer createFreelancer(@RequestBody Freelancer freelancer) {
        return freelancerService.saveFreelancer(freelancer);
    }
}

package com.Demo_Docker.Controller;

import com.Demo_Docker.Entity.Registration;
import com.Demo_Docker.Repository.RegistrationRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/register")
public class RegistrationController {
    RegistrationRepository registrationRepository;

    public RegistrationController(RegistrationRepository registrationRepository) {
        this.registrationRepository = registrationRepository;
    }

    @PostMapping("/save")
    public void saveRegistration(@RequestBody Registration registration){
        registrationRepository.save(registration);
    }

    @GetMapping("/views")
    public List<Registration>getData(){
        List<Registration> data = registrationRepository.findAll();
        return data;
    }

}

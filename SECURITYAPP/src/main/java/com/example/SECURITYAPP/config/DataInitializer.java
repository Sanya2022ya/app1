package com.example.SECURITYAPP.config;

import com.example.SECURITYAPP.model.Role;
import com.example.SECURITYAPP.model.User;
import com.example.SECURITYAPP.repository.RoleRepository;
import com.example.SECURITYAPP.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Set;

@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner init(RoleRepository roleRepository, UserRepository userRepository, PasswordEncoder passwordEncoder) {
        return args -> {
            Role userRole = new Role();
            userRole.setName("ROLE_USER");
            roleRepository.save(userRole);

            User user = new User();
            user.setUsername("user");
            user.setPassword(passwordEncoder.encode("password"));
            user.setEnabled(true);
            user.setRoles(Set.of(userRole));
            userRepository.save(user);
        };
    }
}


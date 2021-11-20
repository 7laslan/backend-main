package com.example.foodorderingapplication;

import org.springframework.stereotype.Service;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Service
public class PasswordEncoder extends BCryptPasswordEncoder {
}

package com.example.taskmanager.service;

import com.example.taskmanager.dto.ApiResponse;
import com.example.taskmanager.dto.RegLogingRequest;
import jakarta.servlet.http.HttpServletRequest;

public interface AuthService {
    ApiResponse<?> register(RegLogingRequest regRequest);
    ApiResponse<?> login(RegLogingRequest loginRequest, HttpServletRequest request);}

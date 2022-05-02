package com.example.project.service;

import com.example.project.entity.Location;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LocationService {
    List<Location> getStates(String state);
}

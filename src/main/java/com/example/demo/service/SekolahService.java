package com.example.demo.service;

import com.example.demo.model.SekolahModel;
import com.example.demo.repository.SekolahRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SekolahService {

    @Autowired
    private SekolahRepository sekolahRepository;

    public List<SekolahModel> getAllData() {
        return sekolahRepository.findAll();
    }
}

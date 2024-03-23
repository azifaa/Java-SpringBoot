package com.example.demo.controller;


import com.example.demo.model.SekolahModel;
import com.example.demo.service.SekolahService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/data-sekolah")
@CrossOrigin(origins = "*")
public class SekolahController {

    @Autowired
    private SekolahService sekolahService;

    @GetMapping("/all")
    public ResponseEntity<List<SekolahModel>> getAllData(){
        List<SekolahModel> sekolahModels = sekolahService.getAllData();
        return new ResponseEntity<>(sekolahModels, HttpStatus.OK);
    }
}

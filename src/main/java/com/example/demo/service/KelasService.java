package com.example.demo.service;

import com.example.demo.model.KelasModel;
import com.example.demo.model.SiswaModel;
import com.example.demo.repository.KelasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class KelasService {

    @Autowired
    private KelasRepository kelasRepository;

    public List<KelasModel> getAllData() {
        return kelasRepository.findAll();
    }
//    Untuk GetById
    public Optional<KelasModel> getById(Long id) {
        return kelasRepository.findById(id);
    }
//    untuk CreatData
    public KelasModel createData(KelasModel kelasModel) {
        return kelasRepository.save(kelasModel);
    }
}

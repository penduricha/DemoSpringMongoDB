package com.example.springmongodb.services.impl;

import com.example.springmongodb.models.Penguin;
import com.example.springmongodb.repositories.PenguinRepository;
import com.example.springmongodb.services.I_Penguin_Service;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PenguinService implements I_Penguin_Service {
    private final PenguinRepository penguinRepository;

    public PenguinService(PenguinRepository penguinRepository) {
        this.penguinRepository = penguinRepository;
    }

    public List<Penguin> getAllPenguins() {
        return penguinRepository.findAll();
    }


//    public Penguin createPenguin(Penguin penguin) {
//        if (penguinRepository.existsByPenguinId(penguin.getPenguin_id())) {
//            throw new IllegalArgumentException("Penguin ID already exists");
//        }
//        return penguinRepository.save(penguin);
//    }
//    public void deletePenguin(int penguinId) {
//        if (penguinRepository.existsByPenguinId(penguinId)) {
//            penguinRepository.deleteByPenguinId(penguinId);
//        }
//        throw new IllegalArgumentException("Penguin ID can't be found");
//    }
//    public boolean isPenguinIdUnique(int penguin_id) {
//        return penguinRepository.findByPenguin_id(penguin_id).isEmpty();
//    }
//
//    public Penguin addPenguin(Penguin penguin) {
//        if (isPenguinIdUnique(penguin.getPenguin_id())) {
//            penguinRepository.save(penguin);
//        } else {
//            throw new RuntimeException("Penguin ID already exists.");
//        }
//        return penguin;
//    }
    public Penguin createPenguin(Penguin penguin) throws Exception{
        return penguinRepository.save(penguin);
    }
}

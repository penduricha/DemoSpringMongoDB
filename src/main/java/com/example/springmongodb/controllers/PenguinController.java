package com.example.springmongodb.controllers;

import com.example.springmongodb.models.Penguin;
import com.example.springmongodb.services.impl.PenguinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/penguins")
public class PenguinController {
    private final PenguinService penguinService;

    public PenguinController(PenguinService penguinService) {
        this.penguinService = penguinService;
    }

    @GetMapping
    public List<Penguin> getAllPenguins() {
        return penguinService.getAllPenguins();
    }
//    @PostMapping
//    public Penguin createPenguin(@RequestBody Penguin penguin) {
//        return penguinService.createPenguin(penguin);
//    }
//    @DeleteMapping("/{penguin_id}")
//    public void deletePenguin(@PathVariable int penguin_id) {
//        penguinService.deletePenguin(penguin_id);
//    }
//    @PostMapping
//    public ResponseEntity<Penguin> createPenguin(@RequestBody Penguin penguin) {
//        try {
//            Penguin savedPenguin = penguinService.addPenguin(penguin);
//            return ResponseEntity.status(HttpStatus.CREATED).body(savedPenguin);
//        } catch (RuntimeException e) {
//            return ResponseEntity.status(HttpStatus.CONFLICT).build();
//        }
//    }
    @PostMapping("/api/penguins")
    @ResponseStatus(HttpStatus.CREATED)
    public Penguin createPenguin(@RequestBody Penguin penguin) throws Exception {
       return penguinService.createPenguin(penguin);
        //return ResponseEntity.status(HttpStatus.CREATED).body(savedPenguin);
    }
}
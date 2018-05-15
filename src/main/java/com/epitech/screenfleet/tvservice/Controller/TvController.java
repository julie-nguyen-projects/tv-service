package com.epitech.screenfleet.tvservice.Controller;

import com.epitech.screenfleet.tvservice.Model.Tv;
import com.epitech.screenfleet.tvservice.Repository.TvRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TvController {

    @Autowired
    private TvRepository repository;

    @GetMapping("/tv")
    public List<Tv> getAllTvs() {
        return repository.findAll();
    }

    @GetMapping("/tv/{id}")
    public Optional<Tv> getTvById(@PathVariable Long id) {
        return repository.findById(id);
    }

    @DeleteMapping("/tv/{id}")
    public String deleteTv(@PathVariable Long id) {
        System.out.println("DELETE TELEVISION WITH ID : " + id);
        try {
            repository.deleteById(id);
        } catch (Exception e) {
            return "Error";
        }
        return "Done";
    }

    @PostMapping("/tv")
    public Tv createTv(@RequestBody Tv television) {
        System.out.println("REST REQUEST to save Tv : " + television);

        if (television.getId() != null) {
            System.out.println("A new television cannot have an ID");
            return null;
        }
        Tv newTv = repository.save(television);
        return newTv;
    }

}

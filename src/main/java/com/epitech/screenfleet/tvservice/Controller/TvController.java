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
    private TvRepository repositoryTv;

    @CrossOrigin(origins = "http://localhost:8080")
    @GetMapping("/tv")
    public List<Tv> getAllTvs() {
        return repositoryTv.findAll();
    }

    @CrossOrigin(origins = "http://localhost:8080")
    @GetMapping("/tv/{id}")
    public Optional<Tv> getTvById(@PathVariable Long id) {
        return repositoryTv.findById(id);
    }

    @CrossOrigin(origins = "http://localhost:8080")
    @DeleteMapping("/tv/{id}")
    public String deleteTv(@PathVariable Long id) {
        System.out.println("DELETE TELEVISION WITH ID : " + id);
        try {
            repositoryTv.deleteById(id);
        } catch (Exception e) {
            return "Error";
        }
        return "Done";
    }

    @CrossOrigin(origins = "http://localhost:8080")
    @PostMapping("/tv")
    public Tv createTv(@RequestBody Tv television) {
        System.out.println("REST REQUEST to save Tv : " + television);

        if (television.getId() != null) {
            System.out.println("A new television cannot have an ID");
            return null;
        }
        Tv newTv = repositoryTv.save(television);
        return newTv;
    }

    @CrossOrigin(origins = "http://localhost:8080")
    @RequestMapping(value = "/tv/{id}", method = RequestMethod.PUT)
    public Tv updateTv(@RequestBody Tv television) {
        System.out.println("REST REQUEST to update Tv : " + television);
        Tv updatedTv = repositoryTv.save(television);
        return  updatedTv;
    }
}

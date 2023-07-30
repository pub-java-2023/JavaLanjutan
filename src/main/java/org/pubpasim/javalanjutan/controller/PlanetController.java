package org.pubpasim.javalanjutan.controller;

import org.pubpasim.javalanjutan.model.Planet;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@CrossOrigin("http://localhost:5731")
@RestController
@RequestMapping("api")
public class PlanetController {
    @GetMapping("hello")
    String helloWorld() {
        return "Hello, world!";
    }

    @PostMapping("hi")
    String hi() {
        return "Hi, Java!";
    }

    @PutMapping("salam")
    String salam() {
        return "Assalamu'alaikum!";
    }

    @DeleteMapping("hapus")
    String hapus() {
        return "Berhasil menghapus.";
    }

    @GetMapping("planet_hashmap")
    Map<String, Object> planetWithHashMap() {
        Map<String, Object> planet = new HashMap<>();
        planet.put("id", 1);
        planet.put("name", "Merkurius");
        planet.put("diameter", 5000.3);
        return planet;
    }

    @GetMapping("planet_class")
    Planet planetWithClass() {
        Planet planet = new Planet();
        planet.setId(2L);
        planet.setName("Venus");
        planet.setDiameter(6000.7);
        return planet;
    }
}

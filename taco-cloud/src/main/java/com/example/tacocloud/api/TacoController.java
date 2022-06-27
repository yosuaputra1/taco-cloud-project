//package com.example.tacocloud.web;
//
//import com.example.tacocloud.domain.Taco;
//import com.example.tacocloud.data.TacoRepository;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.data.domain.Sort;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.Optional;
//
//import static org.springframework.http.HttpStatus.CREATED;
//import static org.springframework.http.HttpStatus.NOT_FOUND;
//
//@RestController
//@RequestMapping(path = "api/tacos",
//        produces = "application/json")
//@CrossOrigin(origins = "http://localhost:8080")
//public class TacoController {
//
//    private TacoRepository tacoRepository;
//
//    public TacoController(TacoRepository tacoRepository){
//        this.tacoRepository = tacoRepository;
//    }
//
//    @GetMapping(params = "recent")
//    public Iterable<Taco> recentTacos(){
//        PageRequest page = PageRequest.of(0, 12, Sort.by("createdAt").descending());
//        return tacoRepository.findAll(page).getContent();
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<Taco> tacoById(@PathVariable("id") Long id){
//        Optional<Taco> optTaco = tacoRepository.findById(id);
//        if (optTaco.isPresent()){
//            return new ResponseEntity<>(optTaco.get(), HttpStatus.OK);
//        }
//        return new ResponseEntity<>(null, NOT_FOUND);
//    }
//
//    @PostMapping(consumes = "application/json")
//    @ResponseStatus(CREATED)
//    public Taco postTaco(@RequestBody Taco taco){
//        return tacoRepository.save(taco);
//    }
//
//}

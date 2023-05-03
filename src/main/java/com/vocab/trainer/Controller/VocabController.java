package com.vocab.trainer.Controller;

import com.vocab.trainer.Service.VocabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class VocabController {
    @Autowired
    private VocabService service;

    @PostMapping("/newVocab")
    public HttpStatus newVocab(@RequestParam String title){
        if (service.addVocabulary(title)){
            return HttpStatus.OK;
        }
        return HttpStatus.BAD_REQUEST;
    }
    @DeleteMapping("/deleteVocab")
    public HttpStatus deleteVocab(@RequestParam String id){
        if (service.deleteVocabulary(id)) {
            return HttpStatus.OK;
        }
        return HttpStatus.BAD_REQUEST;
    }
    @PostMapping("/addVocabToVocabulary")
    public HttpStatus addVocabToVocabulary(@RequestParam String id,
                                           @RequestParam String primary,
                                           @RequestParam String secondary){
        if (service.addVocabToVocabulary(id, primary, secondary)) {
            return HttpStatus.OK;
        }
        return HttpStatus.BAD_REQUEST;
    }



}

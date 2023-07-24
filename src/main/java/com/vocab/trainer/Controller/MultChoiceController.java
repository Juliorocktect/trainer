package com.vocab.trainer.Controller;

import com.vocab.trainer.Model.MultipleChoiceTest;
import com.vocab.trainer.Service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class MultChoiceController {

    @Autowired
    private TestService service;
}

package com.vocab.trainer.Model;

import org.springframework.data.annotation.Id;

import java.util.Map;

public class Vocabulary {
    @Id
    String id;
    Map<String,String> vocab;


}

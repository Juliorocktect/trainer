package com.vocab.trainer.Model;

import lombok.Data;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Component
@Getter
@Data
@Document("Vocabularay")
public class Vocabulary {
    @Id
    private String id;

    private String title;

    private List<Vocab> vocab;

    private Map<String,Integer> learnedRank;

    private LocalDateTime uploadTime;

    public Vocabulary(String title) {
        this.title = title;
        this.vocab = new ArrayList<>();
        this.learnedRank = new HashMap<>();
        this.uploadTime = LocalDateTime.now();
    }

    public void addVocab(String primary,String secondary){
        Vocab vocabs = new Vocab(primary,secondary);
        vocab.add(vocabs);
    }
    public void removeVocab(String id){

    }
    @Override
    protected void finalize() {
    }
}

package com.vocab.trainer.Service;

import com.vocab.trainer.Model.Vocabulary;
import com.vocab.trainer.Repository.VocabRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class VocabService {
    @Autowired
    private VocabRepository repo;

    public boolean addVocabulary(String title){
        repo.insert(new Vocabulary(title));
        return true;
    }
    public boolean addVocabToVocabulary(String id,String primary,String secondary){
        Optional<Vocabulary> byId = repo.findById(id);
        byId.ifPresent(vocabulary -> vocabulary.addVocab(primary, secondary));
        repo.save(byId.get());
        return true;
    }
    public boolean deleteVocabulary(String id){
        repo.delete(repo.findById(id).get());
        if (!repo.findById(id).isPresent()){
            return true;
        }
        return false;
    }

}

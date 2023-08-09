package com.vocab.trainer.Service;

import com.vocab.trainer.Model.Vocab;
import com.vocab.trainer.Model.Vocabulary;
import com.vocab.trainer.Repository.VocabRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
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
    public void deleteVocabFromVocab(String id,String key){
        Vocabulary vocab = repo.findById(id).get();
        List<Vocab> vocabList = vocab.getVocab();
        int elementToDelete = 0;
        for (int i = 0;i < vocabList.size();i++){
            if (vocabList.get(i).getPrimary().equals(key) || vocabList.get(i).getSecondary().equals(key)){
                elementToDelete = i;
            }
        }
        vocabList.remove(elementToDelete);
        repo.save(vocab);
    }

    public boolean check(String id, String key,int status) {
        Vocabulary vocabulary = repo.findById(id).get();
        for (int i = 0;i < vocabulary.getVocab().size();i++){
            if (vocabulary.getVocab().get(i).getPrimary().equals(key) && status == 1){
                return true;
            } else if (vocabulary.getVocab().get(i).getSecondary().equals(key) && status == 2) {
                return true;
            }
        }
       return false;
    }
}

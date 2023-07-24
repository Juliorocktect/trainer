package com.vocab.trainer.Service;

import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.vocab.trainer.Model.MultipleChoiceTest;
import com.vocab.trainer.Repository.MultipleChoiceRepo;
import com.vocab.trainer.Repository.VocabRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    @Autowired
    private VocabRepository repo;
    @Autowired
    private MultipleChoiceRepo choiceRepo;
    public void newMultipleChoiceTest(int correct, String firstQuestion, String secondQuestion, String thirdQuestion,String forthQuestion){
        choiceRepo.insert(new MultipleChoiceTest(correct,firstQuestion,secondQuestion,thirdQuestion,forthQuestion));
    }
    public int compare(int number,String id){
        int correct = choiceRepo.findById(id).get().getCorrect();
        if ( correct == number){
            return correct;
        }
        return correct;
    }
    public boolean mutlipleChoiceTest(int selectedNumber, MultipleChoiceTest test){
        if (test.getCorrect() == selectedNumber){
            return true;
        }
        return false;
    }
}

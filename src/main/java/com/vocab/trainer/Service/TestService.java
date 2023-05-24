package com.vocab.trainer.Service;

import com.vocab.trainer.Model.MultipleChoiceTest;

public class TestService {
    public boolean mutlipleChoiceTest(int selectedNumber, MultipleChoiceTest test){
        if (test.getCorrect() == selectedNumber){
            return true;
        }
        return false;
    }
}

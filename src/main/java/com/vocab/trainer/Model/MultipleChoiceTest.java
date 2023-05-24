package com.vocab.trainer.Model;

import lombok.Getter;
import org.springframework.stereotype.Component;

@Component
@Getter
public class MultipleChoiceTest {
    private int correct;
    private String firstQuestion;
    private String secondQuestion;
    private String thirdQuestion;
    private String fourthQuestion;

    public MultipleChoiceTest(int correct, String firstQuestion, String secondQuestion, String thirdQuestion, String fourthQuestion) {
        this.correct = correct;
        this.firstQuestion = firstQuestion;
        this.secondQuestion = secondQuestion;
        this.thirdQuestion = thirdQuestion;
        this.fourthQuestion = fourthQuestion;
    }
}

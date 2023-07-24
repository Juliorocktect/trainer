package com.vocab.trainer.Repository;

import com.vocab.trainer.Model.MultipleChoiceTest;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MultipleChoiceRepo extends MongoRepository<MultipleChoiceTest,String> {
}

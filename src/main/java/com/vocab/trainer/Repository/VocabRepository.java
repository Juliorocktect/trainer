package com.vocab.trainer.Repository;

import com.vocab.trainer.Model.Vocabulary;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VocabRepository extends MongoRepository<Vocabulary,String> {
}

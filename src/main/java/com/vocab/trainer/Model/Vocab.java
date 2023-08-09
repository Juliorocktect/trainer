package com.vocab.trainer.Model;

import lombok.Data;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@Getter
public class Vocab{
    private String primary;
    private String secondary;

    public Vocab(String primary, String secondary) {
        this.primary = primary;
        this.secondary = secondary;
    }

    @Override
    protected void finalize() {

    }
}

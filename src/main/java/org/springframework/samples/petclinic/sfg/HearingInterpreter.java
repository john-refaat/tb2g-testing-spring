package org.springframework.samples.petclinic.sfg;

import org.springframework.stereotype.Service;

/**
 * Created By john on Aug, 2019
 **/

@Service
public class HearingInterpreter {

    private final WordProducer wordProducer;

    public HearingInterpreter(WordProducer wordProducer) {
        this.wordProducer = wordProducer;
    }

    public String whatIheard() {
        String word = wordProducer.getWord();
        System.out.println(word);
        return word;
    }
}

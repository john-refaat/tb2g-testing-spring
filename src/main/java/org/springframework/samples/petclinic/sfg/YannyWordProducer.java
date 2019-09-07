package org.springframework.samples.petclinic.sfg;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created By john on Aug, 2019
 **/

@Profile("yanny")
@Primary
@Component
public class YannyWordProducer implements WordProducer {

    @Override
    public String getWord() {
        return "Yanny";
    }
}

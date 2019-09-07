package org.springframework.samples.petclinic.sfg.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.samples.petclinic.sfg.LaurelWordProducer;

/**
 * Created By john on Sep, 2019
 **/

@Profile("base-test")
@Configuration
public class LaurelConfig {

    @Bean
    LaurelWordProducer laurelWordProducer() {
        return new LaurelWordProducer();
    }
}

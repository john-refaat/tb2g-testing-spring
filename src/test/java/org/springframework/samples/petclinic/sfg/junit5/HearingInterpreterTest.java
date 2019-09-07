package org.springframework.samples.petclinic.sfg.junit5;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.sfg.conf.BaseConfig;
import org.springframework.samples.petclinic.sfg.HearingInterpreter;
import org.springframework.samples.petclinic.sfg.conf.LaurelConfig;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created By john on Sep, 2019
 **/

@ActiveProfiles("base-test")
@SpringJUnitConfig(classes = {BaseConfig.class, LaurelConfig.class})
class HearingInterpreterTest {

    @Autowired
    private HearingInterpreter hearingInterpreter;

    @Test
    void whatIheard() {
        String word = hearingInterpreter.whatIheard();
        assertEquals("Laurel", word);
    }
}
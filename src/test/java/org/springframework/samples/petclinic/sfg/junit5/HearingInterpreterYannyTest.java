package org.springframework.samples.petclinic.sfg.junit5;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.sfg.conf.BaseConfig;
import org.springframework.samples.petclinic.sfg.HearingInterpreter;
import org.springframework.samples.petclinic.sfg.conf.YannyConfig;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.Assert.assertEquals;

/**
 * Created By john on Sep, 2019
 **/
@ActiveProfiles("base-test")
@SpringJUnitConfig(classes = {BaseConfig.class, YannyConfig.class})
class HearingInterpreterYannyTest {

    @Autowired
    private HearingInterpreter hearingInterpreter;

    @Test
    void whatIheard() {
        String word = hearingInterpreter.whatIheard();
        assertEquals("Yanny", word);
    }
}
package org.springframework.samples.petclinic.sfg;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.sfg.conf.BaseConfig;
import org.springframework.samples.petclinic.sfg.conf.LaurelConfig;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created By john on Sep, 2019
 **/

@ActiveProfiles("base-test")
@RunWith(SpringRunner.class)
@ContextConfiguration(classes =  {BaseConfig.class, LaurelConfig.class})
public class HearingInterpreterTest {

    @Autowired
    private HearingInterpreter hearingInterpreter;

    @Test
    public void whatIheard() {
        String word = hearingInterpreter.whatIheard();
            assertEquals("Laurel", word);
    }
}
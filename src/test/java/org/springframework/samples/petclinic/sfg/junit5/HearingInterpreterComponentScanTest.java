package org.springframework.samples.petclinic.sfg.junit5;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.samples.petclinic.sfg.HearingInterpreter;
import org.springframework.samples.petclinic.sfg.LaurelWordProducer;
import org.springframework.samples.petclinic.sfg.YannyWordProducer;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.Assert.assertEquals;

/**
 * Created By john on Sep, 2019
 **/

@ActiveProfiles("component-scan")
@SpringJUnitConfig(classes = HearingInterpreterComponentScanTest.TestConfig.class)
class HearingInterpreterComponentScanTest {

    @Profile("component-scan")
    @Configuration
    @ComponentScan(basePackages = {"org.springframework.samples.petclinic.sfg"}, excludeFilters =   @ComponentScan.Filter(type = FilterType.REGEX, pattern = "org.*.conf.*Config"))
    static class TestConfig {

    }

    @Autowired
    private HearingInterpreter hearingInterpreter;

    @Test
    void whatIheard() {
        String word = hearingInterpreter.whatIheard();
        assertEquals("Laurel", word);
    }
}
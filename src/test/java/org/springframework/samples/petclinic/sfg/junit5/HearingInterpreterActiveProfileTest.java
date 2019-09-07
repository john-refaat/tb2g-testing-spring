package org.springframework.samples.petclinic.sfg.junit5;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Profile;
import org.springframework.samples.petclinic.sfg.HearingInterpreter;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created By john on Sep, 2019
 **/
@ActiveProfiles("yanny")
@SpringJUnitConfig(classes = {HearingInterpreterActiveProfileTest.TestConfig.class})
class HearingInterpreterActiveProfileTest {

    @Profile("yanny")
    @Configuration
    @ComponentScan(basePackages = {"org.springframework.samples.petclinic.sfg"}, excludeFilters =   @ComponentScan.Filter(type = FilterType.REGEX, pattern = "org.*.conf.*Config"))
    static class TestConfig {

    }


    @Autowired
    private HearingInterpreter hearingInterpreter;


    @Test
    void whatIheard() {
        String word =  hearingInterpreter.whatIheard();
        assertEquals("Yanny", word);
    }


}
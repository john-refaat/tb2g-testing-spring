package org.springframework.samples.petclinic.sfg.junit5;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.samples.petclinic.sfg.HearingInterpreter;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created By john on Sep, 2019
 **/

@SpringJUnitConfig(classes = {PropertiesLaurelTest.TestConfig.class})
@ActiveProfiles("laurel-properties")
@TestPropertySource("classpath:laurel.properties")
public class PropertiesLaurelTest {


    @Configuration
    @ComponentScan(basePackages = {"org.springframework.samples.petclinic.sfg"}, excludeFilters =   @ComponentScan.Filter(type = FilterType.REGEX, pattern = "org.*.conf.*Config"))
    static class TestConfig {

    }

    @Autowired
    private HearingInterpreter hearingInterpreter;


    @Test
    void whatIheard() {
        String word =  hearingInterpreter.whatIheard();
        assertEquals("LauRel", word);
    }

}

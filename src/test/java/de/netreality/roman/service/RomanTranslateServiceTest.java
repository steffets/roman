package de.netreality.roman.service;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class RomanTranslateServiceTest {

    @InjectMocks
    private RomanTranslateService romanTranslateService;

    @Test
    void translate_I() {
        String number = romanTranslateService.translate("I");

        Assertions.assertThat(number).isEqualTo("1");
    }

}
package de.netreality.roman.service;

import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@Slf4j
@ExtendWith(MockitoExtension.class)
class RomanTranslateServiceTest {

    @InjectMocks
    private RomanTranslateService romanTranslateService;

    @Test
    void getCode() {
        String code = "LXXXVII,CV,CXIV,XXXII,XCVIII,CI,CV,XXXII,C,CI,CXIV,XXXII,LXXXIII,CXVI,CXVII,CXVI,CXVI,CIII,XCVII,CXIV,CXVI,CI,CXIV,XXXII,LXXXVI,CI,CXIV,CXV,CV,XCVX,CIV,CI,CXIV,CXVII,CX,CIII,XXXII,CXV,CV,CX,C,XXXII,C,CV,CI,XXXII,XCVIII,CI,CXV,CXVI,CI,CX,XXXII,LXXX,CXIV,CXI,CIII,CXIV,XCVII,CVX,CVX,CV,CI,CXIV,CI,CXIV,XXXII,LVIII,XLI";
        String msg = romanTranslateService.getCode( romanTranslateService.translate(code));
        log.info(msg);
    }

    @Test
    void translate_I() {
        String encoded = romanTranslateService.translate("I");

        Assertions.assertThat(encoded).isEqualTo("1");
    }

}
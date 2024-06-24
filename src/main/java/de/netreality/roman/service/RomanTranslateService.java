package de.netreality.roman.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class RomanTranslateService {

    public String translate(String roman) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getCode(String arabian) {
        StringBuilder sb = new StringBuilder();
        Arrays.stream(arabian.split(",")).forEach(s -> sb.append((char) Integer.valueOf(s).intValue()));
        return sb.toString();
    }

}

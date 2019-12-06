package com.terenko.cipher;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {
    final String sh = "abcdefghijklmnopqrstuvwxyz";
    String shL="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    @RequestMapping(value = "/encrypt", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public file encrypt(@RequestParam String plain, int b) {
        try {
            for (int i = 0; i < plain.length(); i++) {
                if (!sh.contains(plain.substring(i, i + 1))) throw new illegalCharException();
            }
            return new file(Ciphert.encryption(plain, b));

        } catch (Exception e) {
            return new file(e.getMessage());
        }
    }

    @RequestMapping(value = "/decrypt", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public file decrypt(@RequestParam String plain, int b) {
        try {

            for (int i = 0; i < plain.length(); i++) {
                if (!shL.contains(plain.substring(i, i + 1))) throw new illegalCharException();
            }
            return new file(Ciphert.dencryption(plain, b));

        } catch (Exception e) {
            return new file(e.getMessage());
        }
    }
}

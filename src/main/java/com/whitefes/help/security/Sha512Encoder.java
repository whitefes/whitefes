package com.whitefes.help.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.encoding.ShaPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class Sha512Encoder {

    public String encodeToSha512(String rawPassword) {
        ShaPasswordEncoder shaPasswordEncoder = new ShaPasswordEncoder(512);
        shaPasswordEncoder.setEncodeHashAsBase64(true);

//        shaPasswordEncoder.isPasswordValid()

        return "";
    }

}

package com.jmorg.demojwtblog.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import java.security.interfaces.RSAPublicKey;
import java.security.interfaces.RSAPrivateKey;

@ConfigurationProperties(prefix = "rsa")
public record RSAKeyProperties(RSAPublicKey rsaPublicKey, RSAPrivateKey rsaPrivateKey) {
    
}

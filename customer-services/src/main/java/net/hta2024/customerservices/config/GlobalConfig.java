package net.hta2024.customerservices.config;

import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@ConfigurationProperties("global.params")
public class GlobalConfig {
    private int p1;
    private int p2;
}

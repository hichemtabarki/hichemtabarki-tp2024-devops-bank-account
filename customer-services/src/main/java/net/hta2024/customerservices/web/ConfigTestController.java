package net.hta2024.customerservices.web;

import net.hta2024.customerservices.config.GlobalConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigTestController {
    @Autowired
    GlobalConfig globalConfig;
    @GetMapping("/globalConfig")
    public GlobalConfig getGlobalConfig(){
        return globalConfig;
    }
}

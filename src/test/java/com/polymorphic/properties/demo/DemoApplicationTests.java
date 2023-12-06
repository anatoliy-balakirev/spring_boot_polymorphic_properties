package com.polymorphic.properties.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.polymorphic.properties.demo.config.Config;
import java.nio.file.Files;
import java.nio.file.Paths;
import lombok.Data;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private Config configAutowired;

    @Test
    void contextLoads() throws Exception {
        Config configParsed = readConfig();

        assertEquals(configParsed, configAutowired);
    }

    private Config readConfig() throws Exception {
        ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());
        String content = new String(Files.readAllBytes(Paths.get("src/main/resources/application.yaml")));
        return objectMapper.readValue(content, ConfigHolder.class).getRoot();
    }

    @Data
    public static class ConfigHolder {
        private Config root;
    }
}

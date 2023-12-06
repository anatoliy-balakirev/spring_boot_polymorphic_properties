package com.polymorphic.properties.demo.config;

import java.util.List;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "root")
public class Config {
    private List<FieldAggregation> fieldAggregations;
}

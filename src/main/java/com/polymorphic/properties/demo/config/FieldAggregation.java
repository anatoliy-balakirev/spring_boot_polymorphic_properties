package com.polymorphic.properties.demo.config;

import java.util.List;
import lombok.Data;

@Data
public class FieldAggregation {
    private String id;
    private List<TransformationDefinition> fieldTransformationDefinitions;
}


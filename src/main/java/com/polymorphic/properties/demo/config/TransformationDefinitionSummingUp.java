package com.polymorphic.properties.demo.config;

import java.util.List;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class TransformationDefinitionSummingUp extends TransformationDefinition {
    private List<TransformationDefinition> fieldTransformationDefinitions;
}

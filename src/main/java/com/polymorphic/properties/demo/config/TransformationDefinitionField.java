package com.polymorphic.properties.demo.config;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class TransformationDefinitionField extends TransformationDefinition {
    private String dataFieldId;
}

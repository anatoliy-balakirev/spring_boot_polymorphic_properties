package com.polymorphic.properties.demo.config;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import lombok.Data;

@Data
@JsonTypeInfo(use = Id.NAME, property = "transformationDefinitionType", visible = true)
@JsonSubTypes({
      @JsonSubTypes.Type(value = TransformationDefinitionField.class, name = "TransformationDefinitionField"),
      @JsonSubTypes.Type(value = TransformationDefinitionSummingUp.class, name = "TransformationDefinitionSummingUp")
})
public class TransformationDefinition {
    private String transformationDefinitionType;
    private Transformation transformation;
}


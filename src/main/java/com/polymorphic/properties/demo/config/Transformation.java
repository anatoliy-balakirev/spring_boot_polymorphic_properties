package com.polymorphic.properties.demo.config;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Data;

@Data
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "transformationType", visible = true)
@JsonSubTypes({
      @JsonSubTypes.Type(value = TransformationLimitingAtThresholds.class, name = "TransformationLimitingAtThresholds"),
      @JsonSubTypes.Type(value = TransformationMultiplyingByConstant.class, name = "TransformationMultiplyingByConstant"),
      @JsonSubTypes.Type(value = TransformationValueOrDefault.class, name = "TransformationValueOrDefault"),
})
public class Transformation {
    private String transformationType;
}


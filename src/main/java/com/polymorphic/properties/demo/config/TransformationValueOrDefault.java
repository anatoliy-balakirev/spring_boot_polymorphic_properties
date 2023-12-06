package com.polymorphic.properties.demo.config;

import java.math.BigDecimal;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class TransformationValueOrDefault extends Transformation {
    private BigDecimal defaultValue;
}

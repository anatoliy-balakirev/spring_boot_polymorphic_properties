package com.polymorphic.properties.demo.config;

import java.math.BigDecimal;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class TransformationLimitingAtThresholds extends Transformation {
    private BigDecimal minThreshold;
    private BigDecimal maxThreshold;
}


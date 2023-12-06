package com.polymorphic.properties.demo.config;

import java.math.BigDecimal;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class TransformationMultiplyingByConstant extends Transformation {
    private BigDecimal constant;
}

package com.ribbonmix.core.entity.converter;

import org.apache.commons.lang3.StringUtils;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.time.ZoneId;

/**
 * Created by Amer on 8/11/2016.
 */

@Converter(autoApply = true)
public class ZoneIdAttributeConverter implements AttributeConverter<ZoneId, String> {

    @Override
    public String convertToDatabaseColumn(ZoneId attribute) {

        if (attribute == null) {
            return null;
        } else {
            return attribute.getId();
        }
    }

    @Override
    public ZoneId convertToEntityAttribute(String dbData) {

        if (StringUtils.isEmpty(dbData)) {
            return null;
        } else {
            return ZoneId.of(dbData);
        }
    }
}

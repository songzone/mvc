package com.github.catstiger.mvc.converter;

import org.apache.commons.lang3.StringUtils;

public class ByteValueConverter extends PrimitiveConverter<Byte> {

  @Override
  public Byte convert(Object value) {
    if(value == null) {
      return null;
    }
    
    String trimmed = StringUtils.trimToEmpty(value.toString());
    if(isNull(trimmed)) {
      return null;
    }
    return (isHexNumber(trimmed) ? Byte.decode(trimmed) : Byte.valueOf(trimmed));
  }

}


package jp.co.wisdom.sample.mapstruct.service.valueConversionMapping;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/** マッパーサンプルのサンプル */
@Mapper(imports = DateUtil.class)
public interface ValueConversionMapper {

    /** サンプルメソッド */
    @Mapping(target = "date", expression = "java(DateUtil.parse(response.strDate()))")
    ValueConversionDto toDto(ValueConversionBackendResponse response);
}

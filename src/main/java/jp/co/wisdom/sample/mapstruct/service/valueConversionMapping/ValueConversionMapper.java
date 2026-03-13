package jp.co.wisdom.sample.mapstruct.service.valueConversionMapping;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/** 変換処理を挟む場合のサンプル */
@Mapper(imports = DateUtil.class)
public interface ValueConversionMapper {

    /** 変換処理を挟む場合のサンプルメソッド */
    @Mapping(target = "date", expression = "java(DateUtil.parse(response.strDate()))")
    ValueConversionDto toDto(ValueConversionBackendResponse response);
}

package jp.co.wisdom.sample.mapstruct.service.differentFieldNames;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/** マッパーサンプルのサンプル */
@Mapper
public interface DifferentFieldNamesMapper {

    /** サンプルメソッド */
    @Mapping(target = "userName", source = "name")
    @Mapping(target = "userAge", source = "age")
    DifferentFieldNamesDto toDto(DifferentFieldNamesBackendResponse response);
}

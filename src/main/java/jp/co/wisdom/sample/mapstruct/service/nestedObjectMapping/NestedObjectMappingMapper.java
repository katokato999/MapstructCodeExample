package jp.co.wisdom.sample.mapstruct.service.nestedObjectMapping;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/** マッパーサンプルのサンプル */
@Mapper
public interface NestedObjectMappingMapper {

    /** サンプルメソッド */
    @Mapping(target = "userName", source = "userInfo.name")
    @Mapping(target = "userAge", source = "userInfo.age")
    NestedObjectMappingDto toDto(NestedObjectMappingBackendResponse response);
}

package jp.co.wisdom.sample.mapstruct.service.nestedObjectMapping;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/** ネストしたオブジェクトをマッピングするサンプル */
@Mapper
public interface NestedObjectMappingMapper {

    /** ネストしたオブジェクトをマッピングするサンプルメソッド */
    @Mapping(target = "userName", source = "userInfo.name")
    @Mapping(target = "userAge", source = "userInfo.age")
    NestedObjectMappingDto toDto(NestedObjectMappingBackendResponse response);
}

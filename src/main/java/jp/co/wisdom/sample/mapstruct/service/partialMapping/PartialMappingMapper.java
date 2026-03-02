package jp.co.wisdom.sample.mapstruct.service.partialMapping;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/** マッパーサンプルのサンプル */
@Mapper
public interface PartialMappingMapper {

    /** サンプルメソッド */
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "userName", source = "name")
    @Mapping(target = "userAge", source = "age")
    PartialMappingDto toDto(PartialMappingBackendResponse response);
}

package jp.co.wisdom.sample.mapstruct.service.partialMapping;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/** 一部だけマッピングしたい場合のサンプル */
@Mapper
public interface PartialMappingMapper {

    /** 一部だけマッピングしたい場合のサンプルメソッド */
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "userName", source = "name")
    @Mapping(target = "userAge", source = "age")
    PartialMappingDto toDto(PartialMappingBackendResponse response);
}

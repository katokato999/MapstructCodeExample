package jp.co.wisdom.sample.mapstruct.service.conditionMapping;

import java.util.Objects;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/** 特定条件を満たす場合のみマッピングするサンプル */
@Mapper(imports = Objects.class)
public interface ConditionMappingMapper {

    /** 特定条件を満たす場合のみマッピングするサンプルメソッド */
    @Mapping(
            target = "lastName",
            conditionExpression = "java(!Objects.isNull(response.lastName()))")
    @Mapping(
            target = "firstName",
            conditionExpression = "java(!Objects.isNull(response.firstName()))")
    ConditionMappingDto toDto(ConditionMappingBackendResponse response);
}

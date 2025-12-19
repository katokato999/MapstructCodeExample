package jp.co.wisdom.sample.mapstruct.service.basic;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/** マッパーサンプルのサンプル */
@Mapper
public interface BasicMapper {

    /** サンプルメソッド */
    @Mapping(target = "userName", source = "name")
    UserDto toResponse(BackendResponse response);
}

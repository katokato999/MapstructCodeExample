package jp.co.wisdom.sample.mapstruct.service.basic;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/** マッパーサンプルのサンプル */
@Mapper
public interface BasicMapper {

    /** サンプルメソッド */
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "userName", source = "name")
    UserDto toDestination(UserEntity source);
}

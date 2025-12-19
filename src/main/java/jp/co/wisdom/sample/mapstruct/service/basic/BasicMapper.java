package jp.co.wisdom.sample.mapstruct.service.basic;

import org.mapstruct.Mapper;

/** マッパーサンプルのサンプル */
@Mapper
public interface BasicMapper {

    /** サンプルメソッド */
    BasicDto toDto(BasicBackendResponse response);
}

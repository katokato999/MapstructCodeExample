package jp.co.wisdom.sample.mapstruct.service.basic;

import org.mapstruct.Mapper;

/** 基本的なフィールドマッピングのサンプル */
@Mapper
public interface BasicMapper {

    /** 基本的なフィールドマッピングのサンプルメソッド */
    BasicDto toDto(BasicBackendResponse response);
}

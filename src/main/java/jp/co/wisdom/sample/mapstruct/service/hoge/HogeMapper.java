package jp.co.wisdom.sample.mapstruct.service.hoge;

import org.mapstruct.Mapper;

/** マッパーサンプルのサンプル */
@Mapper
public interface HogeMapper {

    /** サンプルメソッド */
    HogeDestination toDestination(HogeSource source);
}

package jp.co.wisdom.sample.mapstruct.service.listMapping;

import java.util.List;

import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;

/** マッパーサンプルのサンプル */
@Mapper
public interface ListMappingMapper {

    /** サンプルメソッド */
    @IterableMapping(numberFormat = "000")
    List<String> toZeroPadding(List<Integer> numbers);
}

package jp.co.wisdom.sample.mapstruct.service.listMapping;

import java.util.List;

import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;

/** リストのマッピングのサンプル */
@Mapper
public interface ListMappingMapper {

    /** リストのマッピングサンプルメソッド */
    @IterableMapping(numberFormat = "000")
    List<String> toZeroPadding(List<Integer> numbers);
}

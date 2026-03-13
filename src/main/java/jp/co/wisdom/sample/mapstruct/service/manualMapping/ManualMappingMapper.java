package jp.co.wisdom.sample.mapstruct.service.manualMapping;

import org.mapstruct.Mapper;

/** 自動マッピングができない場合のサンプル */
@Mapper
public interface ManualMappingMapper {

    /** 自動マッピングができない場合のサンプルメソッド */
    default ManualMappingDto toDto(ManualMappingBackendResponse response) {
        String name = response.firstName() + response.lastName();
        Status status;
        if (Status.OK.getCode().equals(response.statusCode()) && response.activeFlag()) {
            status = Status.OK;
        } else {
            status = Status.NG;
        }
        return new ManualMappingDto(name, status);
    }
}

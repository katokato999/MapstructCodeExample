package jp.co.wisdom.sample.mapstruct.service.manualMapping;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Status {
    OK("1"),
    NG("2");

    private final String code;
}

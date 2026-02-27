package jp.co.wisdom.sample.mapstruct.service.valueConversionMapping;

import java.time.LocalDate;

public class DateUtil {
    public static LocalDate parse(String date) {
        return LocalDate.parse(date);
    }
}

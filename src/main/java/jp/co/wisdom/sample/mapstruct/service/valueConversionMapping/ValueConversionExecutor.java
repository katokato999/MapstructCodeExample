package jp.co.wisdom.sample.mapstruct.service.valueConversionMapping;

import org.springframework.stereotype.Service;

import jp.co.wisdom.sample.mapstruct.service.CodeSampleService;
import lombok.RequiredArgsConstructor;

@Service("valueConversionMapping")
@RequiredArgsConstructor
public class ValueConversionExecutor implements CodeSampleService {

    private final ValueConversionMapper mapper;

    @Override
    public void execute() {
        var result = mapper.toDto(new ValueConversionBackendResponse("2026-01-01"));
        System.out.println("date:" + result.date());
    }
}

package jp.co.wisdom.sample.mapstruct.service.listMapping;

import java.util.Arrays;

import org.springframework.stereotype.Service;

import jp.co.wisdom.sample.mapstruct.service.CodeSampleService;
import lombok.RequiredArgsConstructor;

@Service("listMapping")
@RequiredArgsConstructor
public class ListMappingExecutor implements CodeSampleService {

    private final ListMappingMapper mapper;

    @Override
    public void execute() {
        var results = mapper.toZeroPadding(Arrays.asList(1, 2, 30, 400));
        System.out.println("numbers:" + results);
    }
}

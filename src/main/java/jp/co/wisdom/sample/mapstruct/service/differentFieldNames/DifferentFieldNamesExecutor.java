package jp.co.wisdom.sample.mapstruct.service.differentFieldNames;

import org.springframework.stereotype.Service;

import jp.co.wisdom.sample.mapstruct.service.CodeSampleService;
import lombok.RequiredArgsConstructor;

@Service("differentFieldNames")
@RequiredArgsConstructor
public class DifferentFieldNamesExecutor implements CodeSampleService {

    private final DifferentFieldNamesMapper mapper;

    @Override
    public void execute() {
        var result = mapper.toDto(new DifferentFieldNamesBackendResponse("田中太郎", 100));
        System.out.println("name:" + result.userName() + ", age:" + result.userAge());
    }
}

package jp.co.wisdom.sample.mapstruct.service.nestedObjectMapping;

import org.springframework.stereotype.Service;

import jp.co.wisdom.sample.mapstruct.service.CodeSampleService;
import lombok.RequiredArgsConstructor;

@Service("nestedObjectMapping")
@RequiredArgsConstructor
public class NestedObjectMappingExecutor implements CodeSampleService {

    private final NestedObjectMappingMapper mapper;

    @Override
    public void execute() {
        var result =
                mapper.toDto(
                        new NestedObjectMappingBackendResponse(
                                "001",
                                new NestedObjectMappingBackendResponse.UserInfo("田中太郎", 100)));
        System.out.println("name:" + result.userName() + ", age:" + result.userAge());
    }
}

package jp.co.wisdom.sample.mapstruct.service.partialMapping;

import org.springframework.stereotype.Service;

import jp.co.wisdom.sample.mapstruct.service.CodeSampleService;
import lombok.RequiredArgsConstructor;

@Service("partialMapping")
@RequiredArgsConstructor
public class PartialMappingExecutor implements CodeSampleService {

    private final PartialMappingMapper mapper;

    @Override
    public void execute() {
        var result =
                mapper.toDto(
                        new PartialMappingBackendResponse(
                                "001", "田中太郎", 100, "tanaka@mail", "09012345678"));
        System.out.println("name:" + result.userName() + ", age:" + result.userAge());
    }
}

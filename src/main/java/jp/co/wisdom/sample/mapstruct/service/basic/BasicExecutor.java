package jp.co.wisdom.sample.mapstruct.service.basic;

import org.springframework.stereotype.Service;

import jp.co.wisdom.sample.mapstruct.service.CodeSampleService;
import lombok.RequiredArgsConstructor;

@Service("basic")
@RequiredArgsConstructor
public class BasicExecutor implements CodeSampleService {

    private final BasicMapper mapper;

    @Override
    public void execute() {
        var result = mapper.toDto(new BasicBackendResponse("田中太郎", 100));
        System.out.println("name:" + result.name() + ", age:" + result.age());
    }
}

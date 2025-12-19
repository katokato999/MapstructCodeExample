package jp.co.wisdom.sample.mapstruct.service.basic;

import org.springframework.stereotype.Service;

import jp.co.wisdom.sample.mapstruct.service.CodeSampleService;
import lombok.RequiredArgsConstructor;

@Service("hoge")
@RequiredArgsConstructor
public class BasicExecutor implements CodeSampleService {

    private final BasicMapper mapper;

    @Override
    public void execute() {
        var result = mapper.toResponse(new BackendResponse("田中太郎", 100));
        System.out.println("name:" + result.userName() + ", age:" + result.age());
    }
}

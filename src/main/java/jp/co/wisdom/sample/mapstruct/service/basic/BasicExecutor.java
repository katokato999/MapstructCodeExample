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
        var result = mapper.toDestination(new UserEntity("hoge", 100));
        System.out.println("name:" + result.userName() + ", value:" + result.value());
    }
}

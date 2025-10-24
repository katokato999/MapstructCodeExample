package jp.co.wisdom.sample.mapstruct.service.hoge;

import org.springframework.stereotype.Service;

import jp.co.wisdom.sample.mapstruct.service.CodeSampleService;
import lombok.RequiredArgsConstructor;

/** サンプルなので書き方を理解したらhogeというパッケージごと消してください */
@Service("hoge")
@RequiredArgsConstructor
public class HogeExecutor implements CodeSampleService {

    private final HogeMapper mapper;

    @Override
    public void execute() {
        var result = mapper.toDestination(new HogeSource("hoge", 100));
        System.out.println("name:" + result.name() + ", value:" + result.value());
    }
}

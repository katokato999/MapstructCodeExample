package jp.co.wisdom.sample.mapstruct;

import java.util.Map;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import jp.co.wisdom.sample.mapstruct.service.CodeSampleService;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class SampleCodeRunner implements ApplicationRunner {

    private final Map<String, CodeSampleService> beans;

    /** 起動オプションで指定された実装クラスのロジックを実行 */
    @Override
    public void run(ApplicationArguments args) {
        var serviceName = args.getOptionValues("serviceName").getFirst();
        beans.get(serviceName).execute();
    }
}

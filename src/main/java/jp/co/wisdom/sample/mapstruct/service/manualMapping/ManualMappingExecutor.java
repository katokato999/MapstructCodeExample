package jp.co.wisdom.sample.mapstruct.service.manualMapping;

import org.springframework.stereotype.Service;

import jp.co.wisdom.sample.mapstruct.service.CodeSampleService;
import lombok.RequiredArgsConstructor;

@Service("manualMapping")
@RequiredArgsConstructor
public class ManualMappingExecutor implements CodeSampleService {

    private final ManualMappingMapper mapper;

    @Override
    public void execute() {
        var result = mapper.toDto(new ManualMappingBackendResponse("田中", "太郎", "1", true));
        System.out.println("name:" + result.name() + ", status:" + result.status());
    }
}

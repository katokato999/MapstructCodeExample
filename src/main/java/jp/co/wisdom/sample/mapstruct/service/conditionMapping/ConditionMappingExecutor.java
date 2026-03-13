package jp.co.wisdom.sample.mapstruct.service.conditionMapping;

import org.springframework.stereotype.Service;

import jp.co.wisdom.sample.mapstruct.service.CodeSampleService;
import lombok.RequiredArgsConstructor;

@Service("conditionMapping")
@RequiredArgsConstructor
public class ConditionMappingExecutor implements CodeSampleService {

    private final ConditionMappingMapper mapper;

    @Override
    public void execute() {
        var result = mapper.toDto(new ConditionMappingBackendResponse("田中", null));
        System.out.println("lastName:" + result.lastName() + ", firstName:" + result.firstName());
    }
}

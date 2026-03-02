package jp.co.wisdom.sample.mapstruct.service.nestedObjectMapping;

/** マップ元 */
public record NestedObjectMappingBackendResponse(String id, UserInfo userInfo) {

    public record UserInfo(String name, int age) {}
}

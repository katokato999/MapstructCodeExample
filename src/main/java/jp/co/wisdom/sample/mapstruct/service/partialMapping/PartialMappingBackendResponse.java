package jp.co.wisdom.sample.mapstruct.service.partialMapping;

/** マップ元 */
public record PartialMappingBackendResponse(
        String id, String name, int age, String mailAddress, String phoneNumber) {}

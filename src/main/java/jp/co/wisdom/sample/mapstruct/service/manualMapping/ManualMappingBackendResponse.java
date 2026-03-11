package jp.co.wisdom.sample.mapstruct.service.manualMapping;

/** マップ元 */
public record ManualMappingBackendResponse(
        String firstName, String lastName, String statusCode, boolean activeFlag) {}

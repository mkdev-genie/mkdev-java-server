package com.mkdev.type;

import com.mkdev.description.Description;
import java.util.List;
import java.util.stream.Collectors;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class TypeResponseDto {

    private int typeId;

    private String summary;

    private String nameKR;

    private String nameEN;

    private String quoteKR;

    private String quoteEN;

    private List<String> descriptions;

    public TypeResponseDto(Type type) {
        this.typeId = type.getTypeId();
        this.summary = type.getSummary();
        this.nameKR = type.getNameKR();
        this.nameEN = type.getNameEN();
        this.quoteKR = type.getQuoteKR();
        this.quoteEN = type.getQuoteEN();
        this.descriptions = type.getDescriptions().stream()
            .map(Description::getDescription).collect(Collectors.toList());
    }
}

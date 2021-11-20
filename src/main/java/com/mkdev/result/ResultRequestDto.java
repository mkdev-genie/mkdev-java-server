package com.mkdev.result;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ResultRequestDto {

    @Min(1)
    @Max(12)
    @NotNull
    private int typeId;

    @NotNull
    private Boolean isUser;

    public Result toEntity() {
        return Result.builder().typeId(typeId).build();
    }
}

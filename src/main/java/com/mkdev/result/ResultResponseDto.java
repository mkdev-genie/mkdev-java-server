package com.mkdev.result;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ResultResponseDto {

    private long result;

    public ResultResponseDto(long result) {
        this.result = result;
    }
}

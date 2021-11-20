package com.mkdev.result;

import static org.springframework.http.HttpStatus.OK;

import com.mkdev.type.TypeResponseDto;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import javax.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class ResultController {

    private final ResultService resultService;

    @ApiOperation(value = "결과값 서버 전송 및 타입 반환")
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "결과값 서버 전송 및 타입 반환 성공")
    })
    @PostMapping("/results")
    public ResponseEntity<TypeResponseDto> save(@Valid @RequestBody ResultRequestDto requestDto) {
        return ResponseEntity.status(OK).body(resultService.save(requestDto));
    }
}

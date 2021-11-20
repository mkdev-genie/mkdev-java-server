package com.mkdev.result;

import com.mkdev.type.TypeResponseDto;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import javax.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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
        return ResponseEntity.status(HttpStatus.OK).body(resultService.save(requestDto));
    }

    @ApiOperation(value = "총 참여한 인원 수 반환")
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "총 참여한 인원 수 반환 성공")
    })
    @GetMapping("/users")
    public ResponseEntity<ResultResponseDto> count() {
        return ResponseEntity.status(HttpStatus.OK).body(resultService.count());
    }

}

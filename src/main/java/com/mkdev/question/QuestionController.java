package com.mkdev.question;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class QuestionController {

    private final QuestionService questionService;

    @ApiOperation(value = "문제 및 보기 반환")
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "문제 및 보기 반환 성공")
    })
    @GetMapping("/questions")
    public ResponseEntity<List<QuestionResponseDto>> findAll() {
        return ResponseEntity.status(HttpStatus.OK).body(questionService.findAll());
    }
}

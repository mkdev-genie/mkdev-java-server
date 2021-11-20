package com.mkdev.question;

import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class QuestionService {

    private final QuestionRepository questionRepository;

    @Transactional(readOnly = true)
    public List<QuestionResponseDto> findAll() {
        return questionRepository.findAll().stream().map(QuestionResponseDto::new).collect(Collectors.toList());
    }

}

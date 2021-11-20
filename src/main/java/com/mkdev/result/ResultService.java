package com.mkdev.result;

import com.mkdev.type.Type;
import com.mkdev.type.TypeRepository;
import com.mkdev.type.TypeResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class ResultService {

    private final ResultRepository resultRepository;

    private final TypeRepository typeRepository;

    @Transactional
    public TypeResponseDto save(ResultRequestDto requestDto) {
        if (requestDto.getIsUser()) {
            resultRepository.save(requestDto.toEntity());
        }
        Type type = typeRepository.findById(requestDto.getTypeId())
            .orElseThrow(() -> new IllegalArgumentException("해당 타입은 존재하지 않습니다. typeId=" + requestDto.getTypeId()));
        return new TypeResponseDto(type);
    }

    @Transactional(readOnly = true)
    public ResultResponseDto count() {
        return new ResultResponseDto(resultRepository.count());
    }
}

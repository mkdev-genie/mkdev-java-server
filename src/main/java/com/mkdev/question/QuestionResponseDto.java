package com.mkdev.question;

import com.mkdev.choice.Choice;
import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class QuestionResponseDto {

    private int qid;

    private String content;

    private List<Choice> choice;

    public QuestionResponseDto(Question question) {
        this.qid = question.getQid();
        this.content = question.getContent();
        this.choice = question.getChoice();
    }
}

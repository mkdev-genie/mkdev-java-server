package com.mkdev.question;

import com.mkdev.choice.Choice;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
public class Question {

    @Id
    private int index;

    @Column
    private int qid;

    @Column(length = 100, nullable = false)
    private String content;

    @OneToMany
    @JoinColumn(name = "qid")
    private List<Choice> choices;
}
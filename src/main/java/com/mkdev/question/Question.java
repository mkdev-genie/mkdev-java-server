package com.mkdev.question;

import com.mkdev.choice.Choice;
import java.io.Serializable;
import java.util.ArrayList;
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
public class Question implements Serializable {

    private static final long serialVersionUID = 1905122041950251207L;

    @Id
    private int index;

    @Column
    private int qid;

    @Column(length = 100, nullable = false)
    private String content;

    @OneToMany
    @JoinColumn(name = "qid", referencedColumnName = "qid")
    private List<Choice> choice = new ArrayList<>();
}
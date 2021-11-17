package com.mkdev.choice;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
public class Choice {

    @Id
    private int index;

    @Column
    private int qid;

    @Column(length = 100, nullable = false)
    private String content;

    @Column
    private int type1;

    @Column
    private int type2;

    @Column
    private int type3;

    @Column
    private int type4;

    @Column
    private int type5;

    @Column
    private int type6;

    @Column
    private int type7;

    @Column
    private int type8;

    @Column
    private int type9;

    @Column
    private int type10;

    @Column
    private int type11;

    @Column
    private int type12;
}
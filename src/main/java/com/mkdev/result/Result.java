package com.mkdev.result;

import com.mkdev.common.BaseTimeEntity;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
public class Result extends BaseTimeEntity {

    @Id
    private int index;

    private int typeId;
}
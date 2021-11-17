package com.mkdev.description;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
public class Description {

    @Id
    private int index;

    @Column
    private int typeId;

    @Column(length = 300, nullable = false)
    private String description;
}

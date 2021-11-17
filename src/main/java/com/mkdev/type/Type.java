package com.mkdev.type;

import com.mkdev.description.Description;
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
public class Type {

    @Id
    private int typeId;

    @Column(length = 100, nullable = false)
    private String summary;

    @Column(length = 30, nullable = false)
    private String nameKR;

    @Column(length = 30, nullable = false)
    private String nameEN;

    @Column(length = 300, nullable = false)
    private String quoteKR;

    @Column(length = 300, nullable = false)
    private String quoteEN;

    @OneToMany
    @JoinColumn(name = "typeId")
    private List<Description> descriptions;
}
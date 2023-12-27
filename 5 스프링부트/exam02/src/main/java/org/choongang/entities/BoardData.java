package org.choongang.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.codehaus.groovy.util.ListHashMap;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class BoardData extends Base {
    @Id
    @GeneratedValue
    private Long seq;

    @Column(length=100, nullable = false)
    public String subject;

    @Lob
    @Column(nullable = false)
    public String content;

    @JoinColumn(name = "userNo")
    @ManyToOne(fetch = FetchType.LAZY)
    private Member member;

    @ManyToMany(fetch = FetchType.LAZY)
    private List<HashTag> tags = new ArrayList<>();
}

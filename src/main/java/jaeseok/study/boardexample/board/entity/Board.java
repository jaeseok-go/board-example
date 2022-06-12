package jaeseok.study.boardexample.board.entity;

import jaeseok.study.boardexample.member.entity.Member;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import java.sql.Blob;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "board")
public class Board {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @Column(name = "title", unique = false, nullable = false)
    private String title;

    @Lob
    @Column(name = "content", unique = false, nullable = false)
    private Blob content;

    @ColumnDefault("0")
    @Column(name = "inquery_count", unique = false, nullable = false)
    private Integer inqueryCount;

    @ManyToOne(targetEntity = Member.class, fetch = FetchType.LAZY)
    @Column(name = "writer_id", unique = false, nullable = false)
    private Member writer;
}

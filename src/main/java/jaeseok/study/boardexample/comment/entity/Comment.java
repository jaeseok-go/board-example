package jaeseok.study.boardexample.comment.entity;

import jaeseok.study.boardexample.board.entity.Board;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "comment")
public class Comment {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = true)
    private Long id;

    @Column(name = "content", unique = false, nullable = false)
    private String content;

    @ManyToOne(targetEntity = Board.class, fetch = FetchType.LAZY)
    @Column(name = "board_id", unique = false, nullable = false)
    private Board board;
}

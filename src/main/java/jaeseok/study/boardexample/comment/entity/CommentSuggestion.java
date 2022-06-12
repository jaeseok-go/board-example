package jaeseok.study.boardexample.comment.entity;

import jaeseok.study.boardexample.member.entity.Member;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "comment_suggestion")
public class CommentSuggestion {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "id", unique = true, nullable = false)
    private Long id;

    @ManyToOne(targetEntity = Comment.class, fetch = FetchType.LAZY)
    @Column (name = "comment_id", unique = false, nullable = false)
    private Comment comment;

    @ManyToOne(targetEntity = Member.class, fetch = FetchType.LAZY)
    @Column (name = "member_id", unique = false, nullable = false)
    private Member member;


}
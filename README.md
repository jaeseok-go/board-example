# 게시판 서비스

## 주요기능
1. 회원가입 기능
  - 회원가입 (아이디, 비밀번호, 이름, 닉네임, 이메일, 휴대폰번호)
  - 아이디 규칙은 특수문자 사용불가, 4~20자리의 문자열
  - 비밀번호 규칙은 대소문자 모두 포함, 10~20자리의 문자열, 특수문자 포함
  - 닉네임 규칙은 10자리 이하의 한글,영어,숫자
  - 회원가입 시 이메일이나 휴대폰번호로 인증번호 발송
  - 인증완료 시 회원가입 성공

2. 로그인 기능
  - OAuth 로그인 기능
  - jwt로 로그인 기능 구현
  - Redis 활용하여 토큰 관리

3. 게시물 게시 기능
  - 게시물 제목, 내용 입력해서 업로드
  - 내용에 사진 첨부 가능

4. 게시물 조회 기능
  - 목록조회 기능
  - 목록조회 시 검색 기능
  - 목록조회 시 페이징 기능
  - 상세조회 기능(해당 게시물의 댓글도 함께 조회 가능)
  - 상세조회 시 조회수 +1

5. 댓글 기능
  - 특정 게시물에 댓글 조회 가능
  - 댓글 좋아요 기능
  - 댓글 추천 기능

## 데이터베이스 설계
<img width="1320" alt="image" src="https://user-images.githubusercontent.com/66155356/172039840-71a73d34-05e5-439a-a622-1b843db9c6bf.png">


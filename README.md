# ScalableMSA
- 프로젝트 목적 : Dummy Service들로 MSA를 구성하며 서비스적 제한사항 없이 다양한 기술들을 높은 완성도로 구현하여 기술을 습득하는 프로젝트
- 구현 예정
  - **DB** : MSA구조 안에서 RDBMS와 NoSQL을 이용해 이중화, 백업·복원, 클러스터링, 샤딩, 대용량 트랜잭션 튜닝 등
  - **백엔드** : 비즈니스 로직을 최소화한; Redis 이용한 캐싱, spring security
  - **프론트** : 데이터·작동 확인을 위한 최소한의 구성
- 개발인원
  - 이대근 [github](https://github.com/DGUN52)
  - 김소이 [github](https://github.com/soy9)


# changelog
- 아래에 버전벌 변경사항을 기록한다. 시맨틱 버전을 따르며 서비스가 추가될 때마다 주번호를 증가시킨다.
----
- v0.0.0 / 2023.12.15 : 레포지토리 및 readme 생성 
- v1.0.0 / 2024.01.10 : User서비스 배포 완료
----

# changelog detail
- 버전벌 변경사항의 디테일을 기록한다. 시간 내림차순으로 기록한다.
----
- v.1.0.0
  - 배포 서버 : `AWS EC2` 
    - ip : 43.200.8.28
  - CI : `Github Action`, `AWS S3`
  - CD : `AWS CodeDeploy`, `Shell Script`
  - BE : `Java`, `Spring`, `Hibernate(JPA)`
  - DB : `AWS RDS`
    - table : scalablemsa_user(id, name, signed_date) 
  - 추가된 API :  `user/check`, `user/list`
    - 포스트맨 API 테스트 화면![img.png](ReadmeResource/img.png)
  - 후속추가사항
    - swagger 추가(중요도 높음)
    - elastic ip 적용(중요도 ?)
      - 추가금 요소 있을 경우 적용하지 않음. 추후 서비스 다량 도입 시 적용 고려.
    - security 추가(중요도 낮음)

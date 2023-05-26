# Sk-Sunny
SK-Sunny 프로젝트 

## 누나들을 위한 깃 메뉴얼
---

1. 팀원의 작업 내용이 반영된 main 브랜치의 최신 내용을 가져온다.

```bash
$ git pull origin main (내 브랜치)
```
2. 개발을 한다.

3. 변경된 내용을 add 한다.
```bash
$ git add [내가 저장소에 반영할 내용]
```

4. 내가 작업한 내용을 커밋한다. **그냥 하루종일 계속 개발하다가 커밋하지 말고 했던 업무별로 커밋 나누기**
예) 액티비티 추가, 리팩토링, 리니어레이아웃을 라디오그룹으로 변경

5. 내가 작업한 내용을 원격 저장소에 올린다.

누가 내가 작업 중인 브랜치에서 개발 중일 수 있으므로 **반드시** pull 받고 나서 push.
```
$ git pull origin [작업 중인 브랜치]
$ git push origin [작업 중인 브랜치] # upstream 설정을 했다면 그냥 git push
```
6. 원격 저장소의 내 브랜치로 올린 커밋들을 origin/main에 반영

- 내가 한 내용을 설명하는 제목으로 pull request
- 충돌을 해겷하고 merge, 내가 해결하기 어려운 문제가 있다면 팀원에게 merge 요청


### 그 외에 알아야 할 것들 

브랜치 바꾸기
```bash
$ git checkout [이동하고 싶은 브랜치]
```

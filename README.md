# java-chess
체스 게임 구현을 위한 저장소

###1단계
1. 게임 시작 정보 출력
2. 사용자 입력받기
    - 'start', 'end' 가 아니라면 재입력
3. start 입력 시
    - 초기화된 체스 게임판 출력
4. end 입력 시
    - 종료


###2단계
1. 게임 이동 명령 입력받기
    - move source위치 target위치
2. source위치에 말이 존재하지 않는다면 이동 불가
3. target위치와 source위치의 말들의 색깔이 일치하면 이동 불가
4. 말이 이동할 수 있는 규칙에 벗어난다면 이동 불가


###3단계
1. King이 잡히면 게임을 종료한다
2. 현재 남아 있는 말에 대한 점수를 구한다
    - queen 9점, rook 5점, bishop 3점, knight 2.5점
    - pawn은 기본 1점. 하지만 세로줄에 같은 색 폰이 있는 경우 0.5점
    - 팀 별로 점수를 계산한다
3. 'status' 명령을 입력하면 각 진영의 점수와 승패 결과를 볼 수 있다
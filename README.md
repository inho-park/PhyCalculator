# 물리학 기반의 계산기

## api 가이드
### 1. speed/
```
1. 1차원 좌표계에서 위치 변화량에 따른 속도 계산
request
- distance : double(m)
- time : double(s)
response
- speed : double(m/s)

2. 1차원 좌표계에서 좌표에 따른 속도 계산
request
- start : double(m)
- rear : double(m)
- time : double(s)
response
- speed : double(m/s)

3. 1차원 좌표계에서 속도 변화에 따른 가속도 계산
request
- firstSpeed : double(m)
- lastSpeed : double(m)
- time : double(s)
response
- acceleration : double(m/s)
```
<p align="center">
    <img width="200px;" src="https://raw.githubusercontent.com/woowacourse/atdd-subway-admin-frontend/master/images/main_logo.png"/>
</p>
<p align="center">
  <img alt="npm" src="https://img.shields.io/badge/npm-%3E%3D%205.5.0-blue">
  <img alt="node" src="https://img.shields.io/badge/node-%3E%3D%209.3.0-blue">
  <a href="https://edu.nextstep.camp/c/R89PYi5H" alt="nextstep atdd">
    <img alt="Website" src="https://img.shields.io/website?url=https%3A%2F%2Fedu.nextstep.camp%2Fc%2FR89PYi5H">
  </a>
  <img alt="GitHub" src="https://img.shields.io/github/license/next-step/atdd-subway-service">
</p>

<br>

# 인프라공방 샘플 서비스 - 지하철 노선도

<br>

## 🚀 Getting Started

### Install
#### npm 설치
```
cd frontend
npm install
```
> `frontend` 디렉토리에서 수행해야 합니다.

### Usage
#### webpack server 구동
```
npm run dev
```
#### application 구동
```
./gradlew clean build
```
<br>


### 1단계 - 웹 성능 테스트

* 요구사항 
- [ ] 웹 성능 테스트
  - [ ] 웹 성능 예산을 작성
  - [ ] WebPageTest, PageSpeed 등 테스트해보고 개선이 필요한 부분을 파악


#### 성능 측정
* 지표 
  * [FCP](https://web.dev/fcp) (First Contentful Paint) 
  > 콘텐츠가 포함된 콘텐츠가 포함된 첫 페인트는 첫 번째 텍스트 또는 이미지가 표시되는 시간을 나타냅니다.
  * [TTI](https://web.dev/tti/) (Time to Interactive)
  > 사용할 수 있을 때까지 걸리는 시간은 완전히 페이지와 상호작용할 수 있게 될 때까지 걸리는 시간입니다.
  * [Speed Index](https://web.dev/speed-index) 
  > 속도 색인은 페이지 콘텐츠가 얼마나 빨리 표시되는지 보여줍니다
  * [TBT](https://web.dev/i18n/ko/tbt/) (Total Blocking Time)
  > FCP와 상호작용 시간 사이의 모든 시간의 합으로 작업 지속 시간이 50ms를 넘으면 밀리초 단위로 표현됩니다.
  * [LCP](https://web.dev/i18n/ko/lcp/) (Largest Contentful Paint)
  > 콘텐츠가 포함된 최대 페인트는 최대 텍스트 또는 이미지가 표시되는 시간을 나타냅니다
  * [CLS](https://web.dev/i18n/ko/cls/#-9) (Cumulative Layout Shift)  
  > 누적 레이아웃 변경은 표시 영역 안에 보이는 요소의 이동을 측정합니다.
 
* 내 사이트 성능 (https://www.kbh0581.r-e.kr/)
   
    |환경 |FCP    |TTI   |Speed Index|TBT    |LCP   |CLS|
    |----|-------|------|-----------|-------|------|---|
    |모바일|14.6초 |15.3초 |14.6초     |550밀리초|15.2초|0.0041|
    |웹   |2.7초  |2.8초  |2.7초      |50밀리초 |2.8초 |0.004|
 
  ![성능.png](성능.png)

* 경쟁사 성능 


* 질문 
  1. 웹 성능예산은 어느정도가 적당하다고 생각하시나요

  2. 웹 성능예산을 바탕으로 현재 지하철 노선도 서비스는 어떤 부분을 개선하면 좋을까요



---

### 2단계 - 부하 테스트 
1. 부하테스트 전제조건은 어느정도로 설정하셨나요

2. Smoke, Load, Stress 테스트 스크립트와 결과를 공유해주세요

---

### 3단계 - 로깅, 모니터링
1. 각 서버내 로깅 경로를 알려주세요

2. Cloudwatch 대시보드 URL을 알려주세요




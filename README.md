# MongoDB 로깅을 사용하는 Kafka Producer

이 프로젝트는 Spring Boot로 구축된 간단한 Kafka Producer 애플리케이션입니다. Kafka 토픽으로 메시지를 전송하고, 이러한 메시지를 MongoDB 데이터베이스에 로그로 저장합니다.

## 사전 준비 사항

- Java 17 이상
- Docker Desktop
- MongoDB
- Kafka

## 설정

1. **저장소 클론**
   ```bash
   git clone https://github.com/wowDongHyeon/kafka-consumer.git
   ```

2. kafka-docker  repo 참고

3. **MongoDB 구성**
   - MongoDB가 기본 포트(27017)에서 로컬로 실행 중인지 확인합니다.

4. **애플리케이션 속성 구성**
   - 필요에 따라 `src/main/resources/application.properties` 파일에서 MongoDB URI 및 Kafka 설정을 업데이트합니다.

## 애플리케이션 실행

- 다음 명령어를 사용하여 애플리케이션을 실행합니다:
  ```bash
  ./gradlew bootRun
  ```

## 애플리케이션 테스트

- Postman 또는 curl을 사용하여 애플리케이션에 POST 요청을 보냅니다:
  ```bash
  curl -X POST "http://localhost:8080/send?topic=test-topic&message=HelloKafka"
  ```

- MongoDB에서 메시지가 `logs` 컬렉션에 기록되었는지 확인합니다.

##데모 캡처본


![curl 요청](https://github.com/user-attachments/assets/288d41de-5dab-4081-8f1e-841e25946ba9)
![image](https://github.com/user-attachments/assets/4b3e8bb3-5ee0-4d94-b6b8-f84caa8eaf8e)



## 라이선스

이 프로젝트는 MIT 라이선스에 따라 라이선스가 부여됩니다. 

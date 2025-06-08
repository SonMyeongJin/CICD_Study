FROM openjdk:17-jdk-slim

WORKDIR /app

# Gradle wrapper와 build 파일들을 복사
COPY gradlew .
COPY gradle gradle
COPY build.gradle .
COPY settings.gradle .

# 소스 코드 복사
COPY src src

# 실행 권한 부여 및 애플리케이션 빌드
RUN chmod +x ./gradlew
RUN ./gradlew bootJar --no-daemon

# 빌드된 JAR 파일을 app.jar로 복사
RUN cp build/libs/*.jar app.jar

# 포트 노출
EXPOSE 8080

# 애플리케이션 실행
ENTRYPOINT ["java", "-jar", "app.jar"]

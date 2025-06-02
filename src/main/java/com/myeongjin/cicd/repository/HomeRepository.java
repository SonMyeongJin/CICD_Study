package com.myeongjin.cicd.repository;

import org.springframework.stereotype.Repository;

@Repository
public class HomeRepository {

    /**
     * 홈 메시지를 반환하는 메서드
     */
    public String getHomeMessage() {
        return "안녕하세요";
    }
}

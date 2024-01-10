package org.scalablemsa.user;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserApplicationTests {

	@Test
	void contextLoads() {
		try {
			// 컨텍스트 로드 관련 작업을 수행하는 코드
		} catch (Exception e) {
			e.printStackTrace();
			throw e; // 예외를 다시 던져서 테스트가 실패했음을 나타냄
		}
	}

}

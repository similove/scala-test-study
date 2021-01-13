package com.zjw.test;

import java.time.Instant;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

/**
 * Created by zjwblog<co.zjwblog@gmail.com> on 2021/1/13
 */
@DisplayName("Hello工具类测试")
public class HelloTest {
  public static String hello(Instant now) {
    return "现在时间是：" + now.toString();
  }

  @BeforeAll
  static void beforeAll() {

  }

  @BeforeEach
  void beforeEach() {

  }

  @Test
  void hello() {
    Instant now = Instant.now();
    String expect = "现在时间是：" + now.toString();
    Assertions.assertEquals(expect, hello(now));
  }

  @Test
  void asserts() {
    Assertions.assertEquals(1, 1, () -> "1要是1");
  }

  @Test
  void assume() {
    Assumptions.assumingThat("DEV".equals(System.getenv("ENV")),
        () -> {
          // 如果不为true这里将不执行
          Assertions.assertEquals(1, 1);
        });

    Assumptions.assumeTrue("DEV".equals(System.getenv("ENV")),
        () -> "Aborting test: not on developer workstation");
    // 如果不为true这里将不执行
  }

  @Test
  @EnabledOnOs(OS.MAC)
  void testOnMac() {
    System.out.println("exec on mac");
  }

  @Test
  @EnabledOnOs({OS.WINDOWS, OS.LINUX})
  void testOnOs() {
    System.out.println("exec on windows or linux");
  }

  @AfterAll
  static void afterAll() {

  }

  @AfterEach
  void afterEach() {

  }
}

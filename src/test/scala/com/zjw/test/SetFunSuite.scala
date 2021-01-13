package com.zjw.test

import org.scalatest.funsuite.AnyFunSuite

/**
 * Created by zjwblog<co.zjwblog@gmail.com> on 2021/1/13
 *
 * The FunSuite style
 */
class SetFunSuite extends AnyFunSuite {
  test("An empty Set should have size 0") {
    assert(Set.empty.isEmpty)
  }

  test("Invoking head on an empty Set should produce NoSuchElementException") {
    assertThrows[NoSuchElementException] {
      Set.empty.head
    }
  }
}

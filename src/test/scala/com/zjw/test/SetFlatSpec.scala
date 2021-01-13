package com.zjw.test

import org.scalatest.flatspec.AnyFlatSpec

/**
 * Created by zjwblog<co.zjwblog@gmail.com> on 2021/1/13
 *
 * The FlatSpec style
 */
class SetFlatSpec extends AnyFlatSpec {

  "An empty Set" should "have size 0" in {
    assert(Set.empty.size == 0)
  }

  it should "produce NoSuchElementException when head is invoked" in {
    assertThrows[NoSuchElementException] {
      Set.empty.head
    }
  }
}

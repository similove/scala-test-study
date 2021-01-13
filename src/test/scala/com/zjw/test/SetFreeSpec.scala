package com.zjw.test

import org.scalatest.freespec.AnyFreeSpec

/**
 * Created by zjwblog<co.zjwblog@gmail.com> on 2021/1/13
 */
class SetFreeSpec extends AnyFreeSpec {

  "A Set" - {
    "when empty" - {
      "should have size 0" in {
        assert(Set.empty.size == 0)
      }

      "should produce NoSuchElementException when head is invoked" in {
        assertThrows[NoSuchElementException] {
          Set.empty.head
        }
      }
    }
  }
}

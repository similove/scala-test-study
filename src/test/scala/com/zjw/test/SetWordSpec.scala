package com.zjw.test

import org.scalatest.wordspec.AnyWordSpec

/**
 * Created by zjwblog<co.zjwblog@gmail.com> on 2021/1/13
 *
 * The WordSpec style
 */
class SetWordSpec extends AnyWordSpec {

  "A Set" when {
    "empty" should {
      "have size 0" in {
        assert(Set.empty.size == 0)
      }

      "produce NoSuchElementException when head is invoked" in {
        assertThrows[NoSuchElementException] {
          Set.empty.head
        }
      }
    }
  }
}
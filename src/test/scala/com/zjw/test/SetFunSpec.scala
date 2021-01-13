package com.zjw.test

import org.scalatest.funspec.AnyFunSpec

/**
 * Created by zjwblog<co.zjwblog@gmail.com> on 2021/1/13
 *
 * The FunSpec style
 */
class SetFunSpec extends AnyFunSpec {
  describe("A Set") {
    describe("when empty") {
      it("should have size 0") {
        assert(Set.empty.size == 0)
      }

      it("should produce NoSuchElementException when head is invoked") {
        assertThrows[NoSuchElementException] {
          Set.empty.head
        }
      }
    }
  }
}

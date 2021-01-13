package com.zjw.test

import org.scalatest.refspec.RefSpec
/**
 * Created by zjwblog<co.zjwblog@gmail.com> on 2021/1/13
 */
class SetRefSpec extends RefSpec {

  object `A Set` {
    object `when empty` {
      def `should have size 0` {
        assert(Set.empty.size == 0)
      }

      def `should produce NoSuchElementException when head is invoked` {
        assertThrows[NoSuchElementException] {
          Set.empty.head
        }
      }
    }
  }
}
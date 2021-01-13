package com.zjw.test

import org.scalatest.matchers._
import org.scalatest.prop._
import org.scalatest.propspec.AnyPropSpec

import scala.collection.BitSet
import scala.collection.immutable.{HashSet, TreeSet}


/**
 * Created by zjwblog<co.zjwblog@gmail.com> on 2021/1/13
 */
class SetPropSpec extends AnyPropSpec with TableDrivenPropertyChecks with should.Matchers {


  val examples = Table(
    "set",
    BitSet.empty,
    HashSet.empty[Int],
    TreeSet.empty[Int]
  )

  property("an empty Set should have size 0") {
    forAll(examples) { set =>
      set.size should be(0)
    }
  }

  property("invoking head on an empty set should produce NoSuchElementException") {
    forAll(examples) { set =>
      a[NoSuchElementException] should be thrownBy {
        set.head
      }
    }
  }

}
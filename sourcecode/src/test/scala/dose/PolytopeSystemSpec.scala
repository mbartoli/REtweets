package bbdl.space

import bbdl.space.SampleDataFunctions.PreExpansion._
import breeze.linalg.{DenseVector, DenseMatrix}
import org.scalatest.{Matchers, FlatSpec}

/**
 * Created by B on 5/21/2015.
 * note- theo is theoretical (expected) and exp is experimental
 */
class SimpleAdditionSpec() extends FlatSpec with Matchers{
  val someConstant= 50
  "SimpleAddition assertion" should "successfully add two integers" in {
    assert((40+10) == someConstant)
  }
}
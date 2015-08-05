package dose.tools
import breeze.linalg.{DenseVector, DenseMatrix}
import org.scalatest.{Matchers, FlatSpec}
/**
 * Created by B on 5/21/2015.
 * note- theo is theoretical (expected) and exp is experimental
 */
class oldspec() extends FlatSpec with Matchers{
  val someConstant= 50
  "SimpleAddition assertion" should "successfully add two integers" in {
    assert((40+10) == someConstant)
  }
}
class simpleAdditionSpec() extends FlatSpec with Matchers{
  val someConstant = 60
  "simpleAddition" should "successfully add two identical big integers" in {
  	val expected = someConstant
  	val num = 30
  	val experimental = simpleAddition(num,num)
    assert(experimental == expected)
  }  
  "simpleAddition" should "successfully add one big and one small integer" in {
  	val expected = 60
  	val bigNum = 50
  	val smallNum = 10
  	val experimental = simpleAddition(bigNum,smallNum)
    assert(experimental == expected)
  }
}
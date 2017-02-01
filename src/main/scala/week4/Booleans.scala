package week4

//package idealized.scala

abstract class Booleans {
  def ifThenElse[T](t: => T, e: => T): T

  def &&(x: => Booleans): Booleans = ifThenElse(x, false)

  def ||(x: => Booleans): Booleans = ifThenElse(true, x)

  def unary_! : Booleans = ifThenElse(false, true)

  def ==(x: Booleans): Booleans = ifThenElse(x, x.unary_!)

  def !=(x: Booleans): Booleans = ifThenElse(x.unary_!, x)
}
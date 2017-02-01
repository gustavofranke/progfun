package week3

object scratch {
  new Rational(1, 2)                              //> res0: week3#21.Rational#32910 = 1/2

  def error(msg: String) = throw new Error(msg)   //> error: (msg#54850: String#16919)Nothing#3098
  
  error("src/test")                                   //> java.lang.Error: test
                                                  //| 	at week3.scratch$$anonfun$main$1.error$1(week3.scratch.scala:6)
                                                  //| 	at week3.scratch$$anonfun$main$1.apply$mcV$sp(week3.scratch.scala:8)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at week3.scratch$.main(week3.scratch.scala:3)
                                                  //| 	at week3.scratch.main(week3.scratch.scala)
}
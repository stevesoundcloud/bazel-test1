package bazeltest1

import com.google.common.base.Strings
import com.twitter.algebird.Semigroup

object HelloScala extends App {
  System.out.println(Strings.repeat("HelloScala", 3))
  System.out.println(Semigroup.plus("Hello", "Semigroup"))
}

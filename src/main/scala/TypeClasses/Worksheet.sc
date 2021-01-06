import spire.algebra._
import spire._
import spire.implicits._
import spire.math._
import spire.syntax.literals._


def timesTwo[A : AdditiveSemigroup] (a: A) = a + a

timesTwo(r"3/8")
timesTwo(2)
timesTwo(Map("Score" -> r"3/8"))

def powTwo[A: MultiplicativeMonoid] (a: A) = a * a

powTwo(1)
powTwo(-1)
MultiplicativeMonoid.times(0, 2)

def powTwoX[A: MultiplicativeSemigroup] (a: A) = a * a

powTwoX(1)
powTwoX(-1)

  trait Group[A] {
    def append(x: A, y: A) : A // Semigroup
    def zero: A // Monoid
    def reduce(x: A, y: A) : A
  }
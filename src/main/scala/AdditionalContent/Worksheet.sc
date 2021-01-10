import spire.implicits._
import spire.math._

/***************************************
 *    Pseudo Random number generator
 **************************************/
import spire.random.Dist

val rng = spire.random.rng.Cmwc5()

val n = rng.next[Double]
val i = rng.next[Int]

val cN = rng.next[Complex[Double]]

implicit val map = Dist.map[Int, Complex[Double]](10, 20)
val m = rng.next[Map[Int, Complex[Double]]]

/***************************************
 *               Sorting
 **************************************/
val unsortedArray = Array[Int](1, 3, 5, 7, 4, 5, 6, 7, 5, 3, 2, 4, 5, 7, 8, 9, 10)

//  Mutable
Sorting.quickSort(unsortedArray)      //  nlog(n) -> worst case n^2
unsortedArray
Sorting.insertionSort(unsortedArray)  //  nlog(n) -> additional temporary space
unsortedArray
Sorting.mergeSort(unsortedArray)      //  n^2 stable and fast for small arrays
unsortedArray

/***************************************
 *               Select
 **************************************/

val selectionArray1 = Array[Int](1, 3, 5, 7, 4, 5, 6, 7, 5, 3, 2, 4, 5, 7, 8, 9, 10)
val selectionArray2 = Array[Int](1, 3, 5, 7, 4, 5, 6, 7, 5, 3, 2, 4, 5, 7, 8, 9, 10)

QuickSelect.select(selectionArray1, 4)
selectionArray1
LinearSelect.select(selectionArray2, 4)
selectionArray2

/***************************************
 *               Search
 **************************************/

val searchArray = IndexedSeq("Hello", "World", "Scala", "Spire", "Hello", "World", "Scala", "Spire")

val index = Searching.search(searchArray, "Hello")
val lastIndex = Searching.search(searchArray, "Hello", 3, 6)

/***************************************
 *               Interval
 **************************************/

val intervalOpen = Interval.open(1, 5)
val intervalOpenLower = Interval.openLower(1, 5)
val intervalOpenUpper = Interval.openUpper(1, 5)
val intervalClosed = Interval.apply(1, 5)

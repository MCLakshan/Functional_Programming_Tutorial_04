import scala.io.StdIn

object tute_04 extends App{

	def PatternMatching(x:Int):String = x match {
		case x if x <= 0 => "Negative/Zero"
		case x if x % 2 == 0 => "Even"
		case x if x % 2 != 0 => "Odd"
	}

	printf("Enter a integer number : ")
	var num = StdIn.readInt()
	printf("The input is : %s\n", PatternMatching(num))
}
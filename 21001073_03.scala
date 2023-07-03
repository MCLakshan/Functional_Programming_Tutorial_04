import scala.io.StdIn

object tute_04 extends App{

	def toUpper(s:String):String = s.toUpperCase()

	def toLower(s:String):String = s.toLowerCase()

	def formatNames(name:String, op:String=>String):String = op(name)

	println(formatNames("Benny", toUpper))
	println(formatNames("Ni", toUpper) + formatNames("roshan", toLower))
	println(formatNames("Saman", toLower))
	println(formatNames("K", toUpper) + formatNames("umar", toLower) + formatNames("a", toUpper))


}
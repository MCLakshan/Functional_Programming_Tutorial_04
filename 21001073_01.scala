import scala.io.StdIn

object tute_03 extends App{

	def interest(dip_amount:Double):Double = dip_amount match{
		case x if x <= 20000 => x * 0.02
		case x if x <= 200000 => x * 0.04
		case x if x <= 2000000 => x * 0.035
		case x if x > 2000000 => x * 0.065
	}

	printf("Enter the deposit amount: ")
	var dip_amount: Double = StdIn.readDouble()
	printf("Interest = %f\n", interest(dip_amount))
}

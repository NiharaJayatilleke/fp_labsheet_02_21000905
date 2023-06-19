object Q3 extends App{

  def normalWH(hours: Double) : Double = 250 * hours
  def OTHours(hours: Double) : Double = 85 * hours
  def tax(Amount : Double) : Double = Amount * 12 / 100
  def takeHomeSalary(WH : Double, OT : Double) : Double = normalWH(WH) + OTHours(OT) - tax(normalWH(WH) + OTHours(OT))

  println("The weekly take home salary : " + takeHomeSalary(40, 30))

}

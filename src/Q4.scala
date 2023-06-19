object Q4 extends App {

  def count(tp : Double) : Double = {
    if (tp == 15) {
      120
    }
    else if (tp < 15) {
      120 + ((15 - tp) / 5 * 20)
    }
    else {
      120 - ((tp - 15) / 5 * 20)
    }
  }

  def profit(tp : Double) : Double =(tp * count(tp) - (500 + count(tp) * 3))

  var x : Double = 1;
  var btp : Double = 0;
  var PrevProfit : Double = 0;
  var CurProfit : Double = 1;
  var bool = false;

  println("RELATIONSHIP BETWEEN PROFIT AND TICKET PRICE \n")

  do {

    CurProfit = profit(x)
    println("Ticket Price : "+ x);
    println("Profit : "+ CurProfit + "\n");

    if(CurProfit > PrevProfit) {
      btp = x
      //println(btp)
    }else if (CurProfit > 0){
      bool = false
    }else{
      bool = true
    }

    //x = x + 5;
    x = x + 1;
    PrevProfit = CurProfit
  } while( bool)

  def bestTicketPrice() : Double = btp

  println("THE BEST TICKET PRICE : " + bestTicketPrice())

}
object Q2 extends App{

  var a : Int = 2
  var b : Int = 3
  var c : Int = 4
  var d : Int = 5
  var k : Float = 4.3f

//  println( --b * a + c * d--);
    b-=1;
    println(b * a + c * d);
    d-=1;

//  println(a++);
    println(a);
    a+=1;

//  println (-2 * ( g - k ) +c); // a variable named 'g' has not been declared or initialized therefore this expression cannot be computed
    println(-2 * ( a - k ) + c); // taking g as a

//  println (c = c++);
    println(c);
    c+=1;

//  println (c = ++c * a++);
    c+=1;
    println(c * a);
    a+=1;

}

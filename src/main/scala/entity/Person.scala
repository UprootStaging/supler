package entity

import form.Supler
import scala.scalajs.js.annotation.JSExport

@JSExport
class Person {
  var name: String = "" // require, default
  var lastName: Option[String] = None // optional
  var shoeNumber: Int = 0
}

object PersonMeta extends Supler[Person] {
  val shoeNumberField = field(_.shoeNumber).validate(le(48))
}
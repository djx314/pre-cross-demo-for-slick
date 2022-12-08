package demo.slick

object `Have a test only in Scala 2 that create a Table with 26 columns` {

  case class Model26(
    id: Option[Int],
    i2: String,
    i3: Int,
    i4: String,
    i5: Int,
    i6: String,
    i7: Int,
    i8: String,
    i9: Int,
    i10: String,
    i11: Int,
    i12: String,
    i13: Int,
    i14: String,
    i15: Int,
    i16: String,
    i17: Int,
    i18: String,
    i19: Int,
    i20: String,
    i21: Int,
    i22: String,
    i23: Int,
    i24: String,
    i25: Int,
    i26: String
  )

  import slick.jdbc.MySQLProfile.api._
  import slick.lifted.ProvenShape

  class Table26(tag: Tag) extends Table[Model26](tag, "table_26") {
    def id  = column[Int]("id")
    def i2  = column[String]("i2")
    def i3  = column[Int]("i3")
    def i4  = column[String]("i4")
    def i5  = column[Int]("i5")
    def i6  = column[String]("i6")
    def i7  = column[Int]("i7")
    def i8  = column[String]("i8")
    def i9  = column[Int]("i9")
    def i10 = column[String]("i10")
    def i11 = column[Int]("i11")
    def i12 = column[String]("i12")
    def i13 = column[Int]("i13")
    def i14 = column[String]("i14")
    def i15 = column[Int]("i15")
    def i16 = column[String]("i16")
    def i17 = column[Int]("i17")
    def i18 = column[String]("i18")
    def i19 = column[Int]("i19")
    def i20 = column[String]("i20")
    def i21 = column[Int]("i21")
    def i22 = column[String]("i22")
    def i23 = column[Int]("i23")
    def i24 = column[String]("i24")
    def i25 = column[Int]("i25")
    def i26 = column[String]("i26")

    override def * : ProvenShape[Model26] =
      TableForModel.forTuple(id.?, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, i25, i26).mapTo[Model26]
  }

  object Table26 extends TableQuery(tag => new Table26(tag))

}

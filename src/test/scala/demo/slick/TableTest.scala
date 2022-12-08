package demo.slick

object `Have a test in Scala 2 and Scala 3 with Slick Table Model Type` {

  class Tag[T]
  object Tag {
    def apply[T]: Tag[T]          = new Tag[T]
    def apply[T](v: => T): Tag[T] = new Tag[T]
  }
  def assertType[T](tag1: Tag[T], tag2: Tag[T]): List[Tag[T]] = List(tag1, tag2)

  def getTableType[T <: AbsSlickTable](table: T): Option[TableForModel.TakeModel[T]] = Option.empty

  class SlickT1 extends SlickTable[String]
  class SlickT2 extends SlickTable[Int]
  class SlickT3 extends SlickTable[String]

  val tag1 = Tag(getTableType(new SlickT1).get)
  val tag2 = Tag(getTableType(new SlickT2).get)
  val tag3 = Tag(getTableType(new SlickT3).get)

  assertType(tag1, Tag[String])
  assertType(tag2, Tag[Int])
  assertType(tag3, Tag[String])
  assertType(tag1, tag3)

}

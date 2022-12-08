package demo.slick

trait AbsSlickTable

trait SlickTable[T] extends AbsSlickTable

package impl:

  trait GetModelTypeFromTable:
    type TakeModel[U <: AbsSlickTable] = U match
      case SlickTable[t] => t
    end TakeModel
  end GetModelTypeFromTable

  trait GenTupleLike:
    transparent inline def forTuple(inline tuple: Tuple): tuple.type = tuple
  end GenTupleLike

end impl

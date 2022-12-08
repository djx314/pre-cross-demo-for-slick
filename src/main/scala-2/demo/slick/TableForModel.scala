package demo.slick

trait AbsSlickTable {
  type MC
}

trait SlickTable[NI] extends AbsSlickTable {
  type MC = NI
}

package impl {

  trait GetModelTypeFromTable {
    type TakeModel[T <: AbsSlickTable] = T#MC
  }

  trait GenTupleLike {
    // Just codegen to 256 parameters.

    @inline def forTuple[I1](i1: I1): Tuple1[I1] = Tuple1(i1)

    @inline def forTuple[I1, I2](i1: I1, i2: I2): Tuple2[I1, I2] = Tuple2(i1, i2)

    @inline def forTuple[I1, I2, I3](i1: I1, i2: I2, i3: I3): Tuple3[I1, I2, I3] = Tuple3(i1, i2, i3)

    @inline def forTuple[I1, I2, I3, I4](i1: I1, i2: I2, i3: I3, i4: I4): Tuple4[I1, I2, I3, I4] = Tuple4(i1, i2, i3, i4)

    @inline def forTuple[I1, I2, I3, I4, I5](i1: I1, i2: I2, i3: I3, i4: I4, i5: I5): Tuple5[I1, I2, I3, I4, I5] =
      Tuple5(i1, i2, i3, i4, i5)

    @inline def forTuple[I1, I2, I3, I4, I5, I6](i1: I1, i2: I2, i3: I3, i4: I4, i5: I5, i6: I6): Tuple6[I1, I2, I3, I4, I5, I6] =
      Tuple6(i1, i2, i3, i4, i5, i6)

    @inline def forTuple[I1, I2, I3, I4, I5, I6, I7](
      i1: I1,
      i2: I2,
      i3: I3,
      i4: I4,
      i5: I5,
      i6: I6,
      i7: I7
    ): Tuple7[I1, I2, I3, I4, I5, I6, I7] =
      Tuple7(i1, i2, i3, i4, i5, i6, i7)

    @inline def forTuple[I1, I2, I3, I4, I5, I6, I7, I8](
      i1: I1,
      i2: I2,
      i3: I3,
      i4: I4,
      i5: I5,
      i6: I6,
      i7: I7,
      i8: I8
    ): Tuple8[I1, I2, I3, I4, I5, I6, I7, I8] =
      Tuple8(i1, i2, i3, i4, i5, i6, i7, i8)

    @inline def forTuple[I1, I2, I3, I4, I5, I6, I7, I8, I9](
      i1: I1,
      i2: I2,
      i3: I3,
      i4: I4,
      i5: I5,
      i6: I6,
      i7: I7,
      i8: I8,
      i9: I9
    ): Tuple9[I1, I2, I3, I4, I5, I6, I7, I8, I9] =
      Tuple9(i1, i2, i3, i4, i5, i6, i7, i8, i9)

    @inline def forTuple[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10](
      i1: I1,
      i2: I2,
      i3: I3,
      i4: I4,
      i5: I5,
      i6: I6,
      i7: I7,
      i8: I8,
      i9: I9,
      i10: I10
    ): Tuple10[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10] =
      Tuple10(i1, i2, i3, i4, i5, i6, i7, i8, i9, i10)

    @inline def forTuple[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11](
      i1: I1,
      i2: I2,
      i3: I3,
      i4: I4,
      i5: I5,
      i6: I6,
      i7: I7,
      i8: I8,
      i9: I9,
      i10: I10,
      i11: I11
    ): Tuple11[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11] =
      Tuple11(i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11)

    @inline def forTuple[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12](
      i1: I1,
      i2: I2,
      i3: I3,
      i4: I4,
      i5: I5,
      i6: I6,
      i7: I7,
      i8: I8,
      i9: I9,
      i10: I10,
      i11: I11,
      i12: I12
    ): Tuple12[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12] =
      Tuple12(i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12)

    @inline def forTuple[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13](
      i1: I1,
      i2: I2,
      i3: I3,
      i4: I4,
      i5: I5,
      i6: I6,
      i7: I7,
      i8: I8,
      i9: I9,
      i10: I10,
      i11: I11,
      i12: I12,
      i13: I13
    ): Tuple13[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13] =
      Tuple13(i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13)

    @inline def forTuple[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14](
      i1: I1,
      i2: I2,
      i3: I3,
      i4: I4,
      i5: I5,
      i6: I6,
      i7: I7,
      i8: I8,
      i9: I9,
      i10: I10,
      i11: I11,
      i12: I12,
      i13: I13,
      i14: I14
    ): Tuple14[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14] =
      Tuple14(i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14)

    @inline def forTuple[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15](
      i1: I1,
      i2: I2,
      i3: I3,
      i4: I4,
      i5: I5,
      i6: I6,
      i7: I7,
      i8: I8,
      i9: I9,
      i10: I10,
      i11: I11,
      i12: I12,
      i13: I13,
      i14: I14,
      i15: I15
    ): Tuple15[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15] =
      Tuple15(i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15)

    @inline def forTuple[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16](
      i1: I1,
      i2: I2,
      i3: I3,
      i4: I4,
      i5: I5,
      i6: I6,
      i7: I7,
      i8: I8,
      i9: I9,
      i10: I10,
      i11: I11,
      i12: I12,
      i13: I13,
      i14: I14,
      i15: I15,
      i16: I16
    ): Tuple16[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16] =
      Tuple16(i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16)

    @inline def forTuple[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17](
      i1: I1,
      i2: I2,
      i3: I3,
      i4: I4,
      i5: I5,
      i6: I6,
      i7: I7,
      i8: I8,
      i9: I9,
      i10: I10,
      i11: I11,
      i12: I12,
      i13: I13,
      i14: I14,
      i15: I15,
      i16: I16,
      i17: I17
    ): Tuple17[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17] =
      Tuple17(i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17)

    @inline def forTuple[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18](
      i1: I1,
      i2: I2,
      i3: I3,
      i4: I4,
      i5: I5,
      i6: I6,
      i7: I7,
      i8: I8,
      i9: I9,
      i10: I10,
      i11: I11,
      i12: I12,
      i13: I13,
      i14: I14,
      i15: I15,
      i16: I16,
      i17: I17,
      i18: I18
    ): Tuple18[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18] =
      Tuple18(i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18)

    @inline def forTuple[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19](
      i1: I1,
      i2: I2,
      i3: I3,
      i4: I4,
      i5: I5,
      i6: I6,
      i7: I7,
      i8: I8,
      i9: I9,
      i10: I10,
      i11: I11,
      i12: I12,
      i13: I13,
      i14: I14,
      i15: I15,
      i16: I16,
      i17: I17,
      i18: I18,
      i19: I19
    ): Tuple19[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19] =
      Tuple19(i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19)

    @inline def forTuple[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20](
      i1: I1,
      i2: I2,
      i3: I3,
      i4: I4,
      i5: I5,
      i6: I6,
      i7: I7,
      i8: I8,
      i9: I9,
      i10: I10,
      i11: I11,
      i12: I12,
      i13: I13,
      i14: I14,
      i15: I15,
      i16: I16,
      i17: I17,
      i18: I18,
      i19: I19,
      i20: I20
    ): Tuple20[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20] =
      Tuple20(i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20)

    @inline def forTuple[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, I21](
      i1: I1,
      i2: I2,
      i3: I3,
      i4: I4,
      i5: I5,
      i6: I6,
      i7: I7,
      i8: I8,
      i9: I9,
      i10: I10,
      i11: I11,
      i12: I12,
      i13: I13,
      i14: I14,
      i15: I15,
      i16: I16,
      i17: I17,
      i18: I18,
      i19: I19,
      i20: I20,
      i21: I21
    ): Tuple21[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, I21] =
      Tuple21(i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21)

    @inline def forTuple[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, I21, I22](
      i1: I1,
      i2: I2,
      i3: I3,
      i4: I4,
      i5: I5,
      i6: I6,
      i7: I7,
      i8: I8,
      i9: I9,
      i10: I10,
      i11: I11,
      i12: I12,
      i13: I13,
      i14: I14,
      i15: I15,
      i16: I16,
      i17: I17,
      i18: I18,
      i19: I19,
      i20: I20,
      i21: I21,
      i22: I22
    ): Tuple22[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, I21, I22] =
      Tuple22(i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22)

    import slick.collection.heterogeneous._

    @inline def forTuple[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, I21, I22, I23](
      i1: I1,
      i2: I2,
      i3: I3,
      i4: I4,
      i5: I5,
      i6: I6,
      i7: I7,
      i8: I8,
      i9: I9,
      i10: I10,
      i11: I11,
      i12: I12,
      i13: I13,
      i14: I14,
      i15: I15,
      i16: I16,
      i17: I17,
      i18: I18,
      i19: I19,
      i20: I20,
      i21: I21,
      i22: I22,
      i23: I23
    ): HNil.type# ::[I23]# ::[I22]# ::[I21]# ::[I20]# ::[I19]# ::[I18]# ::[I17]# ::[I16]# ::[I15]# ::[I14]# ::[I13]# ::[I12]# ::[I11]# ::[I10]# ::[I9]# ::[I8]# ::[I7]# ::[I6]# ::[
      I5
    ]# ::[I4]# ::[I3]# ::[I2]# ::[I1] =
      i1 :: i2 :: i3 :: i4 :: i5 :: i6 :: i7 :: i8 :: i9 :: i10 :: i11 :: i12 :: i13 :: i14 :: i15 :: i16 :: i17 :: i18 :: i19 :: i20 :: i21 :: i22 :: i23 :: HNil

    @inline def forTuple[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, I21, I22, I23, I24](
      i1: I1,
      i2: I2,
      i3: I3,
      i4: I4,
      i5: I5,
      i6: I6,
      i7: I7,
      i8: I8,
      i9: I9,
      i10: I10,
      i11: I11,
      i12: I12,
      i13: I13,
      i14: I14,
      i15: I15,
      i16: I16,
      i17: I17,
      i18: I18,
      i19: I19,
      i20: I20,
      i21: I21,
      i22: I22,
      i23: I23,
      i24: I24
    ): HNil.type# ::[I24]# ::[I23]# ::[I22]# ::[I21]# ::[I20]# ::[I19]# ::[I18]# ::[I17]# ::[I16]# ::[I15]# ::[I14]# ::[I13]# ::[I12]# ::[I11]# ::[I10]# ::[I9]# ::[I8]# ::[I7]# ::[
      I6
    ]# ::[
      I5
    ]# ::[I4]# ::[I3]# ::[I2]# ::[I1] =
      i1 :: i2 :: i3 :: i4 :: i5 :: i6 :: i7 :: i8 :: i9 :: i10 :: i11 :: i12 :: i13 :: i14 :: i15 :: i16 :: i17 :: i18 :: i19 :: i20 :: i21 :: i22 :: i23 :: i24 :: HNil

    @inline def forTuple[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, I21, I22, I23, I24, I25](
      i1: I1,
      i2: I2,
      i3: I3,
      i4: I4,
      i5: I5,
      i6: I6,
      i7: I7,
      i8: I8,
      i9: I9,
      i10: I10,
      i11: I11,
      i12: I12,
      i13: I13,
      i14: I14,
      i15: I15,
      i16: I16,
      i17: I17,
      i18: I18,
      i19: I19,
      i20: I20,
      i21: I21,
      i22: I22,
      i23: I23,
      i24: I24,
      i25: I25
    ): HNil.type# ::[I25]# ::[I24]# ::[I23]# ::[I22]# ::[I21]# ::[I20]# ::[I19]# ::[I18]# ::[I17]# ::[I16]# ::[I15]# ::[I14]# ::[I13]# ::[I12]# ::[I11]# ::[I10]# ::[I9]# ::[
      I8
    ]# ::[I7]# ::[
      I6
    ]# ::[
      I5
    ]# ::[I4]# ::[I3]# ::[I2]# ::[I1] =
      i1 :: i2 :: i3 :: i4 :: i5 :: i6 :: i7 :: i8 :: i9 :: i10 :: i11 :: i12 :: i13 :: i14 :: i15 :: i16 :: i17 :: i18 :: i19 :: i20 :: i21 :: i22 :: i23 :: i24 :: i25 :: HNil

    @inline def forTuple[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, I21, I22, I23, I24, I25, I26](
      i1: I1,
      i2: I2,
      i3: I3,
      i4: I4,
      i5: I5,
      i6: I6,
      i7: I7,
      i8: I8,
      i9: I9,
      i10: I10,
      i11: I11,
      i12: I12,
      i13: I13,
      i14: I14,
      i15: I15,
      i16: I16,
      i17: I17,
      i18: I18,
      i19: I19,
      i20: I20,
      i21: I21,
      i22: I22,
      i23: I23,
      i24: I24,
      i25: I25,
      i26: I26
    ): HNil.type# ::[I26]# ::[I25]# ::[I24]# ::[I23]# ::[I22]# ::[I21]# ::[I20]# ::[I19]# ::[I18]# ::[I17]# ::[I16]# ::[I15]# ::[I14]# ::[I13]# ::[I12]# ::[I11]# ::[I10]# ::[
      I9
    ]# ::[
      I8
    ]# ::[I7]# ::[
      I6
    ]# ::[
      I5
    ]# ::[I4]# ::[I3]# ::[I2]# ::[I1] =
      i1 :: i2 :: i3 :: i4 :: i5 :: i6 :: i7 :: i8 :: i9 :: i10 :: i11 :: i12 :: i13 :: i14 :: i15 :: i16 :: i17 :: i18 :: i19 :: i20 :: i21 :: i22 :: i23 :: i24 :: i25 :: i26 :: HNil
  }
}

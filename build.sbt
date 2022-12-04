import ContextValues._

val rootFile            = file(".")
val codegenFile         = rootFile / "codegen"
val `compat-slick/file` = rootFile / "compat-slick"

scalaVersion := scalaV.v213

lazy val root           = project in rootFile
lazy val codegen        = project in codegenFile
lazy val `compat-slick` = project in `compat-slick/file`

scalaVersion := "2.13.12"
scalacOptions ++= Seq("-deprecation", "-feature", "-unchecked", "-Xlint")

semanticdbEnabled := true
semanticdbVersion := scalafixSemanticdb.revision

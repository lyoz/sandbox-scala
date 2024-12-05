scalaVersion := "2.13.15"
scalacOptions ++= Seq("-deprecation", "-feature", "-unchecked", "-Xlint")

semanticdbEnabled := true
semanticdbVersion := scalafixSemanticdb.revision

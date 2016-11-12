
scalaVersion := "2.11.8"

lazy val stubby = RootProject(uri("ssh://git@github.com:/scala-stubby/stubby.git#fb03336"))

dependsOn(stubby)

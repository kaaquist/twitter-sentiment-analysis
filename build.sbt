name := "twitter-sentiment-analysis"

version := "0.1"

scalaVersion := "2.11.7"

resolvers += "Akka Repository" at "http://repo.akka.io/releases/"


libraryDependencies ++= Seq(
  //Logger
  "org.log4s"                 %%        "log4s"                     % "1.6.1",
  "ch.qos.logback"            %         "logback-classic"           % "1.2.3",
  "org.scalatest"             %%        "scalatest"                 % "3.0.5"     % "test",
  "org.apache.spark"          %%        "spark-core"                % "2.4.0",
  "org.apache.spark"          %%        "spark-streaming"           % "2.4.0",
  "org.apache.bahir"          %%        "spark-streaming-twitter"   % "2.3.2",
  "org.twitter4j"             %         "twitter4j-stream"          % "3.0.3",
  "edu.stanford.nlp"          %         "stanford-corenlp"          % "3.9.2",
  "edu.stanford.nlp"          %         "stanford-corenlp"          % "3.9.2"     classifier "models",
  "org.elasticsearch"         %%        "elasticsearch-spark-20"    % "6.5.4"     % "compile"
)

assemblyMergeStrategy in assembly := {
  case PathList("META-INF", xs @ _*) => MergeStrategy.discard
  case x => MergeStrategy.first
}
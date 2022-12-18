import mill._, scalalib._

object Spring extends ScalaModule {
  def scalaVersion = "2.13.1"

  def ivyDeps = Agg(
  
ivy"org.springframework.boot:spring-boot-starter-web:2.4.3",
ivy"org.springframework.boot:spring-boot-starter-thymeleaf:2.4.3",
ivy"org.springframework.boot:spring-boot-starter-data-jpa:2.4.3",
ivy"org.apache.derby:derby:10.13.1.1",
ivy"javax.annotation:javax.annotation-api:1.3.2"
  )
}

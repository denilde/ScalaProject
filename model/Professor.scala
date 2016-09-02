package model
import java.lang.Long

case class Professor(var id: Long, pessoa: Pessoa, var login: String,
    var senha: String, var nome: String, var email: String) extends Usuario() {

}
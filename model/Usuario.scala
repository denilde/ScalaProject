package model
import java.lang.Long

abstract class Usuario(){var id: Long; var login: String; var senha: String;
var nome: String; var email: String; var chaveRedefinicaoSenha: String = null; 
   var isAvaliador: Boolean=false;

var isProfessor: Boolean =false;

  var isGestor: Boolean=false;

  var isAdministrador: Boolean=false;

  var isAtivo: Boolean = false
}
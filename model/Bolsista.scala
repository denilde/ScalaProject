package model
import java.lang.Long
import java.util.HashSet;
import java.util.Set;



case class Bolsista(id: Long, nome: String, email: String, matricula: String,
cpf: String, projeto: Projeto, pessoa: Pessoa){
  
}
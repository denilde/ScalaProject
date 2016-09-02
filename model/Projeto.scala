package model

import java.util.Date
import java.text.SimpleDateFormat
import java.lang.Long


case class Projeto(id: Long, nome: String, dataCadastro: Date, agencia: String, 
areaConhecimento: String, professor: List[Professor] = List[Professor](), bolsista: List[Bolsista] = List[Bolsista](), 
edital: Edital, campus: Campus){ 
  
}
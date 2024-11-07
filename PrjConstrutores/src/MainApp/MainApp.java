/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainApp;
import domain.*;
/**
 *
 * @author Aluno
 */
public class MainApp {
  public static void main (String [] args ){
      Marca m = new Marca();
      Marca marca3 = new Marca(10, "GM");
      //marca3.setNome("GM");
      System.out.println("id/Marca: " 
              + marca3.getId() + " / "
              + marca3.getNome().toLowerCase());
      Marca marca1 = new Marca("Ford");
      marca1.setId(19);
      //marca1.setNome("ford");
      
      Marca marca2 = new Marca ("Nissan");
      marca2.setId(2);
      //marca2.setNome("Nissan");
      
      Modelo mod = new Modelo();
      mod.setMarca(marca2);
      
      Modelo modelo1 = new Modelo(15, "Frontier", marca1);
//      modelo1.setId(15);
//      modelo1.setDescricao("Sedans");
//      modelo1.setMarca(marca2);
//      
      Modelo modelo2 = new Modelo();
      modelo2.setId(2);
      modelo2.setDescricao("Picapes");
      modelo2.setMarca(marca1);
      
      Veiculo veiculo1 = new Veiculo();
      veiculo1.setId(5);
      veiculo1.setPlaca("AAA-1232");
      veiculo1.setModelo(modelo1);
      
      Veiculo veiculo2 = new Veiculo();
      veiculo2.setId(2);
      veiculo2.setPlaca("ABC-0123");
      veiculo2.setModelo(modelo2);
      
      print(veiculo1);
      print(veiculo2);
      
  }
  
  public static void print(Veiculo veiculo) {
      System.out.println("Informações Carros\n\n");
      System.out.println("ID:\t" +veiculo.getId());
      System.out.println("Modelo:\t"+
              veiculo.getModelo().getDescricao());
      System.out.println("Marca:\t"+
              veiculo.getModelo().getMarca().getNome());
      System.out.println("Placa:\t" + veiculo.getPlaca());
            
  }
    
}

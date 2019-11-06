/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introoop;

/**
 *
 * @author bruno.191196
 */
class Somador {
  double area=0;
  
  void adicionarRetangulo(Retangulo ret) {
    area = area + ret.area();
  }
  
  void adicionarTriangulo(Triangulo tri) {
    area = area + tri.area();
  }
  
  void adicionarCirculo(Circulo circ) {
    area = area + circ.area();
  }

}

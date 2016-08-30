/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenParcial;

/**
 *
 * @author Israel
 */
public class ConcreteFactory extends Factory{

    @Override
    protected App2 factoryMethod(String tipoApp) {
        App2 a;
        switch (tipoApp)
                {
                case "juegos":
                        a = new Juegos();
                        break;
                case  "fitness":   
                    a= new Fitness();
                    break;
                case "idiomas":
                    a= new Idiomas();
                    break;
                case "Musica":
                    a=new Musica();
                    break;
                    default :
                        a = null;
                        break;
                    }      
                 return a;
                }
            };
    
    


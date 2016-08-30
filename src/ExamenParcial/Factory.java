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
public abstract class Factory {
     protected abstract App2 factoryMethod(String tipoCompu);
   
   public App2  createApp(String tipoApp)
   {
       App2 a = factoryMethod(tipoApp);
       a.concepcion();
       a.diseño();
       a.planificacion();
       a.produccion();
       a.pruebas();
       return a;
   }
   
    
 static Factory getInstance()
    {
        if(singleton== null)
        {
            singleton =new Factory() {
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
     
        }
         return singleton;
    }
 
        private static Factory singleton;
}

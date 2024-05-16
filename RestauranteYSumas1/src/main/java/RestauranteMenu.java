
import javax.swing.JOptionPane;


public class RestauranteMenu {

    public static void main(String[] args) {
      int codMenuPpal=0,codMenuTipico=0, codMenuCarta=0, codMenuInternacional=0, platosProcesados=0, conteoTipicos=0,conteoCarta=0, conteoInternacional=0, platosAPagar=0;
      String nombre="";
    
        JOptionPane.showInputDialog("Digite su nombre: ");
      do{
          String menu="MENU RESTAURANTE\n\n";
          menu+="1. Plato tipico\n";
          menu+="2. Plato a la carta\n";
          menu+="3. Plato Internacional\n";
          menu+="4. Salir\n\n";
          menu+="Por favor seleccione una opcion\n";
          codMenuPpal=Integer.parseInt(JOptionPane.showInputDialog(menu ));
      
switch (codMenuPpal) {
    case 1:
        do{
        String menuTipico="MENU TIPICO\n\n";
        menuTipico+="1. Frijoles\n";
        menuTipico+="2. Sopa de verduras\n";
        menuTipico+="3. Regresar\n";
        menuTipico+="4. Por favor seleccione una opcion \n";
        codMenuTipico= Integer.parseInt(JOptionPane.showInputDialog(menuTipico ));
        switch (codMenuTipico){
        case 1:
                JOptionPane.showMessageDialog(null, "Se ha solicitado un plato de Frijoles, el costo es de $"+12000);
                platosProcesados++; conteoTipicos++; platosAPagar+=12000;
                
        break;
        case 2:
                JOptionPane.showMessageDialog(null, "Se ha solicitado una sopa de verduras, el costo es de $"+8000);
                platosProcesados++; conteoTipicos++; platosAPagar+=8000;
              
         break;
        case 3:
            
          break;
        default:  JOptionPane.showMessageDialog(null, "  No corresponde a "
        +"un codigo valido", "ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
          break;
        }
          JOptionPane.showMessageDialog(null, "Cantidad total de platos tipicos procesados son : "+ conteoTipicos);
        codMenuTipico=Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1 si desea repetir "
        + "el menu tipico, de lo contrario regresará al menu principal" ));
        
        if (codMenuTipico!=1) {
            codMenuTipico=3;
        }
        }while (codMenuTipico!=3);
        break;
        //FIN CASO 1
        case 2:
        do{
        String menuCarta="PLATO A LA CARTA\n\n";
        menuCarta+="1. Pastas a la Alfredo\n";
        menuCarta+="2. Arroz Ranchero\n";
        menuCarta+="3. Regresar\n";
        menuCarta+="4. Por favor seleccione una opcion \n";
        codMenuCarta= Integer.parseInt(JOptionPane.showInputDialog( menuCarta));
        switch (codMenuCarta){
        case 1:
                JOptionPane.showMessageDialog(null, "Se ha solicitado un plato de pastas a la Alfredo $"+19000);
                platosProcesados++; conteoCarta++;  platosAPagar+=19000;
        break;
        case 2:
                JOptionPane.showMessageDialog(null, "Se ha solicitado un plato de Arroz Ranchero $"+15000);
                platosProcesados++;  conteoCarta++;  platosAPagar+=15000;
         break;
        case 3:
            
          break;
        default:  JOptionPane.showMessageDialog(null, "  No corresponde a "
        +"un codigo valido", "ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
          break;
        }
          JOptionPane.showMessageDialog(null, "Cantidad total de platos a la Carta procesados son : "+ conteoCarta);
        codMenuCarta=Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1 si desea repetir "
        + "el menu tipico, de lo contrario regresará al menu principal" ));
        
        if (codMenuCarta!=1) {
            codMenuCarta=3;
        }
        }while (codMenuCarta!=3);
        break;
        //fin caso 2
        case 3:
         do{
        String menuInternacional="PLATO INTERNACIONAL\n\n";
        menuInternacional+="1. Pizza Italiana\n";
        menuInternacional+="2. CarneRodizio\n";
        menuInternacional+="3. Regresar\n";
        menuInternacional+="4. Ensalada Cesar \n";
        codMenuInternacional= Integer.parseInt(JOptionPane.showInputDialog( menuInternacional));
        switch (codMenuInternacional){
        case 1:
                JOptionPane.showMessageDialog(null, "Se ha solicitado un plato de Pizza Italiana $"+25000);
                platosProcesados++; conteoInternacional++;  platosAPagar+=25000;
        break;
        case 2:
                JOptionPane.showMessageDialog(null, "Se ha solicitado un corte de Carne Rodizio $"+45000);
                platosProcesados++; conteoInternacional++;  platosAPagar+=45000;
         break;
        case 3:
            
          break;
        case 4: 
             JOptionPane.showMessageDialog(null, "Se ha solicitado un plato de Ensalada Cesar $"+28000);
             platosProcesados++; conteoInternacional++;  platosAPagar+=28000;
              
         break;
         
            
        default:  JOptionPane.showMessageDialog(null, "  No corresponde a "
        +"un codigo valido", "ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
          break;
        }
         JOptionPane.showMessageDialog(null, "Cantidad total de platos Internacionales procesados son: "+ conteoInternacional);
        codMenuCarta=Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1 si desea repetir "
        + "el menu tipico, de lo contrario regresará al menu principal" ));
        
        if (codMenuCarta!=1) {
            codMenuCarta=3;
        }
        }while (codMenuCarta!=3);
        break;
       //fin menu 3
        case 4:
        JOptionPane.showMessageDialog(null, "Siempre Bienvenidos en el Rancho De Juancho");
        break;
        default:
            JOptionPane.showInputDialog(null, "No corresponde a un"
                    + "codigo valido", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
            break;
}
      } while  (codMenuPpal!=4);
      
       JOptionPane.showMessageDialog(null, "Cantidad total de platos procesados: "+ platosProcesados);
        
       String factura ="FACTURA: \n";
       factura +="Nombre del cliente: "+ nombre+"\n";
       factura +="Platos Procesados: "+ platosProcesados+"\n";
       factura +="platos tipicos: "+ conteoTipicos +"\n";
       factura +="platos a la carta : "+ conteoCarta+"\n";
       factura +="Platos Internacionales: "+ conteoInternacional+"\n";
       factura +="Total a pagar : "+ platosAPagar+"\n";
        JOptionPane.showMessageDialog(null, factura);
}
}

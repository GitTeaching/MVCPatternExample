import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.SwingUtilities;

import org.soa.ws.tp2.HelloWorld;
import org.soa.ws.tp2.HelloWorldImplService;
import org.soa.ws.tp3.Convertisseur;
import org.soa.ws.tp3.ConvertisseurImplService;
import org.soa.ws.tp4.Product;
import org.soa.ws.tp4.CatalogMagasin;
import org.soa.ws.tp4.ShopCatalogImplService;


public class ControleurMVCwithWS implements ActionListener{
     
	double montantConv;

	@Override
	public void actionPerformed(ActionEvent e) {
		
		HelloWorldImplService hello = new HelloWorldImplService();
		HelloWorld stub = hello.getHelloWorldImplPort();
		double randomValue = stub.getMontant();
		System.out.println("getMontant : \n\tRandom Value: " + randomValue);
		
		ConvertisseurImplService convertisseur = new ConvertisseurImplService();
		Convertisseur stubBis = convertisseur.getConvertisseurImplPort();
		montantConv = stubBis.getDinarFromEuro(randomValue);
		System.out.println("GetDinar/Euro : \n\tConversion Dinar/Euro: " + montantConv);
	    
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				MyThirdJFrameMVC frame = new MyThirdJFrameMVC(montantConv);
				frame.setVisible(true);
			}
	    });
		

		 
		ShopCatalogImplService shop1 = new ShopCatalogImplService ();
		CatalogMagasin stubCatalog = shop1.getShopCatalogImplPort();
        
		List<Product> products = new ArrayList<Product>();		
		products = stubCatalog.tousLesProduits();		
		for(int i=0; i<products.size(); i++)
		     System.out.println("id = " + products.get(i).getId() + " Categ = " + products.get(i).getCateg());
		
	}
}

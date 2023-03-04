package Clase1;

public class OperacionesBasicas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		int nroDesde = 5;
		int nroHasta = 21;
		boolean MuestraImpares = true;
				
		while (nroDesde <= nroHasta) {
						
			if (nroDesde % 2 == 0) 
			    {
			      System.out.println(nroDesde);
			    }
            else 
			    {
					if (MuestraImpares == true) 
					   {
				         System.out.println(nroDesde);
					   }
			    }
			
			nroDesde += 1;
		}
		
		 System.out.println("---");
		 
		nroHasta = 5;
		for( nroDesde = 21; nroDesde >= nroHasta; nroDesde--){
			if (nroDesde % 2 == 0) 
		    {
		      System.out.println(nroDesde);
		    }
        else 
		    {
				if (MuestraImpares == true) 
				   {
			         System.out.println(nroDesde);
				   }
		    }
	    }
		
	}

}

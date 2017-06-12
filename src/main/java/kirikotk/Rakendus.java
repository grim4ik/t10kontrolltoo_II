package kirikotk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class Rakendus{
		
		public static void main(String[] args) {
			Jogi jogi1= new Jogi();
			jogi1.nimetus = "Suur-jogi";
			jogi1.pikkus = 700;
			Jogi jogi2= new Jogi();
			jogi2.nimetus = "Vaike-jogi";
			jogi2.pikkus = 240;
			if(jogi1.pikkus != 0){
				double vastus1= jogi1.pikkus + jogi2.pikkus;
				System.out.println("Vastus 1 on " + vastus1 + " km mereni");
			}
			if(jogi2.pikkus != 0){
				double vastus2= jogi1.pikkus - jogi2.pikkus;
				System.out.println("Vastus 2 on " + vastus2 + " km mereni");
			}
			if(jogi1.pikkus != 0){
				double vastus3= jogi1.pikkus;
				System.out.println("Vastus 3 on " + vastus3 + " km mereni");
			}

		}
	
}

/*
Vastus 1 on 940.0 km mereni
Vastus 2 on 460.0 km mereni
Vastus 3 on 700.0 km mereni
*/
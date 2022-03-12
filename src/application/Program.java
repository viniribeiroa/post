package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Coment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Coment c1 = new Coment("tenha uma boa viajem");
		Coment c2 = new Coment("nossa que legal");
		
		Post p1 = new Post(
				sdf.parse("21/06/2018 13:05:44"), 
				"viajando para o Canada",
				" conhecendo este país lindo",
				 15);
		
		p1.addComent(c1);
		p1.addComent(c2);

	}

}

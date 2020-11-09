package com.travelExpress.TravelExpress;

import com.travelExpress.TravelExpress.dao.UtilisateursRepository;
import com.travelExpress.TravelExpress.entites.Utilisateurs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TravelExpressApplication implements CommandLineRunner {
	@Autowired
	private UtilisateursRepository utilisateursRepository;
	public static void main(String[] args) {
		SpringApplication.run(TravelExpressApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		utilisateursRepository.save(new Utilisateurs(null, "DIALLO", "Conakry"));
		utilisateursRepository.save(new Utilisateurs(null, "OKPAGNIDE", "Porto-Novo"));

		utilisateursRepository.findAll().forEach(p->{
			System.out.println(p.toString());
		});
	}
}

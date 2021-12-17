//modelo
//interface
//repositorio
//servicio
//controlador


package Reto2_Web;

import Reto2_Web.interfaces.InterfaceClothe;
import Reto2_Web.interfaces.InterfaceOrder;
import Reto2_Web.interfaces.InterfaceUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Reto2WebApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Reto2WebApplication.class, args);
	}
	@Autowired
	private InterfaceUser userRepository;
	@Autowired
	private InterfaceClothe clotheRepository;
	@Autowired
	private InterfaceOrder orderRepository;

	@Override
	public void run(String... args) throws Exception {
		userRepository.deleteAll();
		clotheRepository.deleteAll();
		orderRepository.deleteAll();
	}


}

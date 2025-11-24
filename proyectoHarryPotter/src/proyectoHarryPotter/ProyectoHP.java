package proyectoHarryPotter;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ProyectoHP {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("╔══════════════════════════════════════════════════════════════════════╗");
		System.out.println(
				"        			                                                                                         \n"
						+ "                                                                                                    \n"
						+ "      ▄ .▄ ▄▄▄· ▄▄▄  ▄▄▄   ▄· ▄▌     ▄▄▄·      ▄▄▄▄▄▄▄▄▄▄▄▄▄ .▄▄▄                                   \n"
						+ "     ██▪▐█▐█ ▀█ ▀▄ █·▀▄ █·▐█▪██▌    ▐█ ▄█▪     •██  •██  ▀▄.▀·▀▄ █·                                 \n"
						+ "     ██▀▐█▄█▀▀█ ▐▀▀▄ ▐▀▀▄ ▐█▌▐█▪     ██▀· ▄█▀▄  ▐█.▪ ▐█.▪▐▀▀▪▄▐▀▀▄                                  \n"
						+ "     ██▌▐▀▐█ ▪▐▌▐█•█▌▐█•█▌ ▐█▀·.    ▐█▪·•▐█▌.▐▌ ▐█▌· ▐█▌·▐█▄▄▌▐█•█▌                                 \n"
						+ "     ▀▀▀ · ▀  ▀ .▀  ▀.▀  ▀  ▀ •     .▀    ▀█▄▀▪ ▀▀▀  ▀▀▀  ▀▀▀ .▀  ▀                                 \n"
						+ " ▄▄▄·  ▌ ▐·▄▄▄ . ▐ ▄ ▄▄▄▄▄▄• ▄▌▄▄▄   ▄▄▄·                                    \n"
						+ "▐█ ▀█ ▪█·█▌▀▄.▀·•█▌▐█•██  █▪██▌▀▄ █·▐█ ▀█                                    \n"
						+ "▄█▀▀█ ▐█▐█•▐▀▀▪▄▐█▐▐▌ ▐█.▪█▌▐█▌▐▀▀▄ ▄█▀▀█                                    \n"
						+ "▐█ ▪▐▌ ███ ▐█▄▄▌██▐█▌ ▐█▌·▐█▄█▌▐█•█▌▐█ ▪▐▌                                   \n"
						+ " ▀  ▀ . ▀   ▀▀▀ ▀▀ █▪ ▀▀▀  ▀▀▀ .▀  ▀ ▀  ▀                                    \n"
						+ "     ▄▄·        ▐ ▄  ▌ ▐·▄▄▄ .▄▄▄  .▄▄ ·  ▄▄▄·  ▄▄· ▪         ▐ ▄  ▄▄▄· ▄▄▌  \n"
						+ "    ▐█ ▌▪▪     •█▌▐█▪█·█▌▀▄.▀·▀▄ █·▐█ ▀. ▐█ ▀█ ▐█ ▌▪██ ▪     •█▌▐█▐█ ▀█ ██•  \n"
						+ "    ██ ▄▄ ▄█▀▄ ▐█▐▐▌▐█▐█•▐▀▀▪▄▐▀▀▄ ▄▀▀▀█▄▄█▀▀█ ██ ▄▄▐█· ▄█▀▄ ▐█▐▐▌▄█▀▀█ ██▪  \n"
						+ "    ▐███▌▐█▌.▐▌██▐█▌ ███ ▐█▄▄▌▐█•█▌▐█▄▪▐█▐█ ▪▐▌▐███▌▐█▌▐█▌.▐▌██▐█▌▐█ ▪▐▌▐█▌▐▌\n"
						+ "    ·▀▀▀  ▀█▄▀▪▀▀ █▪. ▀   ▀▀▀ .▀  ▀ ▀▀▀▀  ▀  ▀ ·▀▀▀ ▀▀▀ ▀█▄▀▪▀▀ █▪ ▀  ▀ .▀▀▀      	                                                                                        \n"
						+ "                                                                                                           ");
		System.out.println("╚═══════════════════════════════════════════════════════════════════════════════╝");

		System.out.println();
		System.out.println();
		System.out.println();

		System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n"
				+ "░░░███████████████████████████████████████████████████████████████████████░░░░░░\n"
				+ "░░░██░░░░░░░░░░░░░░░░░░███░░░░░░░░░░░░░░░░░█░░░░░░░░░░░░░░░░░░░░░░░░░░░░██░░░░░░\n"
				+ "░░░██░░░░░░░░░░░░░░░░░░███░░░░░░░░░░░░░░░░░█░░░░░░░░░░░░░░░░░░░░░░░░░░░░██░░░░░░\n"
				+ "░░░██░░░░░░░░░░░░░░░░░░███░░░░░░░░░░░░░░░░░█░░░░░░░░░░░░░░░░░░░░░░░░░░░░██░░░░░░\n"
				+ "░░░██░░░░░░░░░███░░░░░░███░░░░░░░░░░░░░░░░░█░░░░░░░░░░░░░░░░░░░░░░░░░░░░██░░░░░░\n"
				+ "░░░██░░░░░░░░░███░░░░░░███░░░░░░░░░░░░░░░░░█░░░░░░░░░░░░░░░░░░░░░░░░░░░░██░░░░░░\n"
				+ "░░░██░░░░░░░░░███░░░░░░██████████▒▒▒████████░░░░░░░░░░░░░░░░░░░░░░░░░░░░██░░░░░░\n"
				+ "░░░██░░░░░░░░░███░░░░░░███░░░░░░░░░░░░░░░░░█░░░░░░░░░░░░░░░░░░░░░░░░░░░░██░░░░░░\n"
				+ "░░░██░░░░░░░░░███░░░░░░███░░░░░░░░░░░░░░░░░█░░░░░░░░░░░░░░░░░░░░░░░░░░░░██░░░░░░\n"
				+ "░░░██░░░░░░░░░███░░░░░░███░░░░░░░░░░░░░░░░░█░░░░░░░░░░░░░░░░░░░░░░░░░░░░██░░░░░░\n"
				+ "░░░██░░░░░░░░░███░░░░░░███░░░░░░░░░░░░░░░░░█░░░░░░░░░░░░░░░░░░░░░░░░░░░░██░░░░░░\n"
				+ "░░░██░░░░░░░░░████▒▒▒▒████░░░░░░░░░░░░░░░░░████████▒▒▒▒███████████▒▒▒█████░░░░░░\n"
				+ "░░░██░░░░░░░░░███░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██░░░░░░\n"
				+ "░░░██░░░░░░░░░███░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██░░░░░░\n"
				+ "░░░██░░░░░░░░░███░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██░░░░░░\n"
				+ "░░░██░░░░░░░░░███░░░░░░██████████▒▒▒█████████████░░░░░░░░█████████████████░░░░░░\n"
				+ "░░░██░░░░░░░░░███░░░░░░████░░░░░░░░░░░░░░░░░░░░░█░░░░░░░░▒░░░░░░░░░░░░░░██░░░░░░\n"
				+ "░░░██░░░░░░░░░███░░░░░░████░░░░░░░░░░░░░░░░░░░░░█░░░░░░░░▒░░░░░░░░░░░░░░██░░░░░░\n"
				+ "░░░██░░░░░░░░░███░░░░░░████░░░░░░░░░░░░░░░░░░░░░█░░░░░░░░█░░░░░░░░░░░░░░██░░░░░░\n"
				+ "░░░███████████████████████████████████████████████████████████████████████░░░░░░\n"
				+ "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n");

		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		int intentos = 0;
		boolean correcto = false;
		// bucle para que el usuario introduzca la contraseña

		while (intentos < 3 && !correcto) {

			// he visto esta nueva estructura para que las letras vayan más lentas que mola
			// un cacho
			String mensaje = "Introduce la contraseña: ";

			for (int i = 0; i < mensaje.length(); i++) {
				System.out.print(mensaje.charAt(i));
				try {
					Thread.sleep(50); // espera 50 milisegundos entre letras
				} catch (InterruptedException e) {
					e.printStackTrace(); // muestra el error si ocurre
				}
			}
			String passwd = sc.nextLine();

			if (passwd.equals("jugones")) {
				System.out.println("¡Contraseña correcta!");
				correcto = true;

				// inicio de variables y listas de nuestro jogo do harry popoter hehe
				ArrayList<String> inventarioObjetos = new ArrayList<>();
				ArrayList<String> inventarioHechizos = new ArrayList<>();
				int vida = 100;
				int moral = 50;
				int contadorHistoria = 0;
				String nombreFinalPersonaje = "Jugador";

				// Navegacion
				String zonaActual = "Vestíbulo";
				boolean puertaSecretaAbierta = false;
				// variables para usar los personajes
				boolean esMyrtle = false;
				boolean esDobby = false;
				boolean esEstudiante = false;

				// inicio del juego
				boolean valido = false;
				String personaje;

				do {
					System.out.println("¿Qué personaje quieres jugar?");
					System.out.println("1. Myrtle la llorona");
					System.out.println("2. Dobby, el elfo doméstico");
					System.out.println("3. Personaje random");

					personaje = sc.nextLine();
					// las stats de los personajes tipo moral y vida ademas de los objetos y
					// hechizos son mazo editables lo deje asi de forma provisional
					switch (personaje) {
						case "1":
							System.out.println("Has desbloqueado a Myrtle la llorona");
							esMyrtle = true;
							nombreFinalPersonaje = "Myrtle";
							vida = 80;
							moral = 40;
							inventarioObjetos.add("Gafas Rotas");
							inventarioHechizos.add("Grito Espectral");
							valido = true;
							break;
						case "2":
							System.out.println("Has desbloqueado a Dobby");
							esDobby = true;
							nombreFinalPersonaje = "Dobby";
							vida = 120;
							moral = 90;
							inventarioObjetos.add("Poción de Vida");
							inventarioObjetos.add("Calcetín");
							inventarioHechizos.add("Chasquido de Elfo");
							valido = true;
							break;
						case "3":
							System.out.println("Has desbloqueado personaje random");
							esEstudiante = true;
							valido = true;
							System.out.println("¿Cómo te llamas?");
							String nombre = sc.nextLine();
							nombreFinalPersonaje = nombre;
							inventarioObjetos.add("Varita de Acebo");
							inventarioHechizos.add("Flipendo");

							System.out.println("Era una mañana tranquila en Londres cuando de repente...");
							System.out.println("Viene un búho para entregarte un sobre");
							String carta = "Estimado/a " + nombre + ",\n"
									+ "Nos complace informarle que ha sido admitido/a en el Colegio Hogwarts de Magia y Hechicería.\n"
									+ "El curso comienza el 1 de septiembre. El tren parte de la estación de King's Cross,\n"
									+ "andén 9¾, a las once en punto.\n\n"
									+ "Adjunto encontrará la lista de libros y materiales necesarios.\n\n"
									+ "Atentamente,\n"
									+ "Minerva McGonagall\n"
									+ "Subdirectora de Hogwarts";
							for (int i = 0; i < carta.length(); i++) {
								System.out.print(carta.charAt(i));
								try {
									Thread.sleep(50); // espera 50 milisegundos entre letras
								} catch (InterruptedException e) {
									e.printStackTrace(); // muestra el error si ocurre
								}
							}

							// gorro seleccionador

							int slytherin = 0;
							int ravenclaw = 0;
							int hufflepuff = 0;
							int gryffindor = 0;

							boolean valido1;
							do {
								valido1 = true;
								System.out.println("¿Cómo preferirías ser recordado en la historia?");
								System.out.println("1. Como alguien Bueno (justo y leal).");
								System.out.println("2. Como alguien Sabio (inteligente e ingenioso).");
								System.out.println("3. Como alguien Valiente (heroico y audaz).");
								System.out.println("4. Como alguien Grande (poderoso y exitoso).");
								String opcion = sc.nextLine();

								switch (opcion) {
									case "1":
										hufflepuff++;
										break;
									case "2":
										ravenclaw++;
										break;
									case "3":
										gryffindor++;
										break;
									case "4":
										slytherin++;
										break;
									default:
										System.out.println("No has marcado bien la puntuación, vuelve a intentarlo.");
										valido1 = false;
										break;
								}
							} while (!valido1);

							// Pregunta 2
							do {
								valido1 = true;
								System.out.println("¿Cuál de estas cualidades valoras más en ti mismo/a?");
								System.out.println("1. Inteligencia.");
								System.out.println("2. Valentía.");
								System.out.println("3. Lealtad.");
								System.out.println("4. Ambición.");
								String opcion1 = sc.nextLine();

								switch (opcion1) {
									case "1":
										ravenclaw++;
										break;
									case "2":
										gryffindor++;
										break;
									case "3":
										hufflepuff++;
										break;
									case "4":
										slytherin++;
										break;
									default:
										System.out.println("No has marcado bien la puntuación, vuelve a intentarlo.");
										valido1 = false;
										break;
								}
							} while (!valido1);

							// Pregunta 3
							do {
								valido1 = true;
								System.out.println("Te enfrentas a un Boggart. ¿Qué es lo que más temes?");
								System.out.println("1. Ver a tus seres queridos fracasar o ser heridos.");
								System.out.println("2. Que te humillen públicamente por no saber una respuesta.");
								System.out.println("3. Un enemigo al que no puedes vencer.");
								System.out.println("4. Ser olvidado y fracasar en tus metas.");
								String opcion2 = sc.nextLine();

								switch (opcion2) {
									case "1":
										hufflepuff++;
										break;
									case "2":
										ravenclaw++;
										break;
									case "3":
										gryffindor++;
										break;
									case "4":
										slytherin++;
										break;
									default:
										System.out.println("No has marcado bien la puntuación, vuelve a intentarlo.");
										valido1 = false;
										break;
								}
							} while (!valido1);

							// Pregunta 4
							do {
								valido1 = true;
								System.out.println("¿Qué asignatura de Hogwarts te atrae más?");
								System.out.println("1. Pociones");
								System.out.println("2. Herbología.");
								System.out.println("3. Defensa contra las Artes Oscuras.");
								System.out.println("4. Encantamientos.");
								String opcion3 = sc.nextLine();

								switch (opcion3) {
									case "1":
										slytherin++;
										break;
									case "2":
										hufflepuff++;
										break;
									case "3":
										gryffindor++;
										break;
									case "4":
										ravenclaw++;
										break;
									default:
										System.out.println("No has marcado bien la puntuación, vuelve a intentarlo.");
										valido1 = false;
										break;
								}
							} while (!valido1);

							// Pregunta 5
							do {
								valido1 = true;
								System.out.println("Si tuvieras que elegir un animal mágico, ¿cuál sería?");
								System.out.println("1. Niffler.");
								System.out.println("2. Serpiente");
								System.out.println("3. Hipogrifo.");
								System.out.println("4. Fénix.");
								String opcion4 = sc.nextLine();

								switch (opcion4) {
									case "1":
										hufflepuff++;
										break;
									case "2":
										slytherin++;
										break;
									case "3":
										gryffindor++;
										break;
									case "4":
										ravenclaw++;
										break;
									default:
										System.out.println("No has marcado bien la puntuación, vuelve a intentarlo.");
										valido1 = false;
										break;
								}
							} while (!valido1);

							// Pregunta 6
							do {
								valido1 = true;
								System.out.println("¿Qué cualidad valoras más en un amigo?");
								System.out.println("1. Lealtad.");
								System.out.println("2. Valentía.");
								System.out.println("3. Inteligencia.");
								System.out.println("4. Poder.");
								String opcion5 = sc.nextLine();

								switch (opcion5) {
									case "1":
										hufflepuff++;
										break;
									case "2":
										gryffindor++;
										break;
									case "3":
										ravenclaw++;
										break;
									case "4":
										slytherin++;
										break;
									default:
										System.out.println("No has marcado bien la puntuación, vuelve a intentarlo.");
										valido1 = false;
										break;
								}
							} while (!valido1);

							// Pregunta 7
							do {
								valido1 = true;
								System.out.println("Si ganaras un premio, ¿qué preferirías que reconociera?");
								System.out.println("1. Tu bondad.");
								System.out.println("2. Tu sabiduría.");
								System.out.println("3. Tu ambición.");
								System.out.println("4. Tu valentía.");
								String opcion6 = sc.nextLine();

								switch (opcion6) {
									case "1":
										hufflepuff++;
										break;
									case "2":
										ravenclaw++;
										break;
									case "3":
										slytherin++;
										break;
									case "4":
										gryffindor++;
										break;
									default:
										System.out.println("No has marcado bien la puntuación, vuelve a intentarlo.");
										valido1 = false;
										break;
								}
							} while (!valido1);

							// Pregunta 8
							do {
								valido1 = true;
								System.out.println("¿Qué camino elegirías en un bosque?");
								System.out.println("1. El más seguro y tranquilo.");
								System.out.println("2. El más oscuro y desafiante.");
								System.out.println("3. El más misterioso y lleno de enigmas.");
								System.out.println("4. El más lleno de vida y aventuras.");
								String opcion7 = sc.nextLine();

								switch (opcion7) {
									case "1":
										hufflepuff++;
										break;
									case "2":
										slytherin++;
										break;
									case "3":
										ravenclaw++;
										break;
									case "4":
										gryffindor++;
										break;
									default:
										System.out.println("No has marcado bien la puntuación, vuelve a intentarlo.");
										valido1 = false;
										break;
								}
							} while (!valido1);

							// Pregunta 9
							do {
								valido1 = true;
								System.out.println("Si pudieras tener un poder mágico, ¿cuál elegirías?");
								System.out.println("1. Curar a los demás.");
								System.out.println("2. Luchar contra cualquier enemigo.");
								System.out.println("3. Conocer todos los secretos.");
								String opcion8 = sc.nextLine();

								switch (opcion8) {
									case "1":
										hufflepuff++;
										break;
									case "2":
										gryffindor++;
										break;
									case "3":
										ravenclaw++;
										break;
									default:
										System.out.println("No has marcado bien la puntuación, vuelve a intentarlo.");
										valido1 = false;
										break;
								}
							} while (!valido1);

							// Pregunta 10
							do {
								valido1 = true;
								System.out.println("¿Qué lugar de Hogwarts prefieres?");
								System.out.println("1. La cocina.");
								System.out.println("2. La sala común de Gryffindor.");
								System.out.println("3. La biblioteca.");
								String opcion9 = sc.nextLine();

								switch (opcion9) {
									case "1":
										hufflepuff++;
										break;
									case "2":
										gryffindor++;
										break;
									case "3":
										ravenclaw++;
										break;
									default:
										System.out.println("No has marcado bien la puntuación, vuelve a intentarlo.");
										valido1 = false;
										break;
								}
							} while (!valido1);

							if (hufflepuff >= ravenclaw && hufflepuff >= gryffindor && ravenclaw >= slytherin) {
								System.out.println("Enhorabuena eres de Hufflepuff");
								moral = 80;
							} else if (ravenclaw >= hufflepuff && ravenclaw >= gryffindor && ravenclaw >= slytherin) {
								System.out.println("Enhorabuena eres de ravenclaw");
								moral = 60;
							} else if (gryffindor >= hufflepuff && gryffindor >= ravenclaw && gryffindor >= slytherin) {
								System.out.println("Enhorabuena eres de gryffindor");
								moral = 70;
							} else {
								System.out.println("Enhorabuena eres de slytherin");
								moral = 30;
							}

							break;
						default:
							System.out.println("Opción no válida. Intenta de nuevo.");
							break;
					}
				} while (!valido);

				// A partir de aqui comienza lo que es el juego en si
				System.out.println();
				System.out.println("═════════════════════════════════════════════════╗");
				System.out.println("       COMIENZA LA AVENTURA EN HOGWARTS          ║");
				System.out.println("═════════════════════════════════════════════════╝");
				System.out.println("Debes investigar el castillo y fortalecerte antes de enfrentar al mal.");
				System.out.println("Consejito: Aprende hechizos como 'Alohomora' para abrir nuevas zonas ;)");

				boolean explorando = true;

				while (explorando) {

					// condicion para el FINAL, el contador de historia debe llegar a 5 y el usuario
					// debe conseguir abrir la puerta
					if (contadorHistoria >= 5 && puertaSecretaAbierta) {
						System.out.println("\n*** CLÍMAX ***");
						System.out.println("Has reunido suficiente poder y has abierto la Sala de los Menesteres.");
						System.out.println("El Mago Oscuro te espera dentro.");
						explorando = false;
						break;
					}
					// Esto sirve para que el jugador no se pierda por asi decirlo
					System.out.println("\n---------------------------------------------");
					System.out.println("UBICACIÓN ACTUAL: " + zonaActual.toUpperCase());
					System.out.println("---------------------------------------------");

					// Switch principal el tocho
					switch (zonaActual) {
						case "Vestíbulo":
							System.out
									.println("El gran hall de entrada. Las antorchas iluminan las paredes de piedra.");
							System.out.println("1. Ir al Gran Comedor");
							System.out.println("2. Bajar a las Mazmorras");
							System.out.println("3. Subir por la Gran Escalera");
							System.out.println("4. Salir a los Terrenos del Castillo");
							System.out.println("5. Ver Estado e Inventario");

							String op = sc.nextLine();
							switch (op) {
								case "1":
									zonaActual = "Gran Comedor";
									break;
								case "2":
									zonaActual = "Pasillo Mazmorras";
									break;
								case "3":
									zonaActual = "Gran Escalera";
									break;
								case "4":
									zonaActual = "Terrenos";
									break;
								case "5":
									System.out.println("Vida: " + vida + " | Moral: " + moral);
									System.out.println("Objetos: " + inventarioObjetos);
									System.out.println("Hechizos: " + inventarioHechizos);
									System.out.println("Progreso: " + contadorHistoria + "/5");
									break;
								default:
									System.out.println("Opción no válida.");
							}
							break;

						case "Gran Comedor":
							System.out
									.println("Mesas largas llenas de comida. Fantasmas flotan por el techo encantado.");
							System.out.println("1. Hablar con el Barón Sanguinario");
							System.out.println("2. Comer algo (Recuperar Vida)");
							System.out.println("3. Volver al Vestíbulo");

							String opComedor = sc.nextLine();
							switch (opComedor) {
								case "1":
									if (esMyrtle)
										System.out.println(
												"El Barón te saluda con respeto (miedo). Te da una pista sobre el bosque.");
									else
										System.out.println("El Barón te mira mal. Sientes un escalofrío.");
									break;
								case "2":
									System.out.println("Comes un pastel de calabaza. +10 Vida.");
									vida += 10;
									break;
								case "3":
									zonaActual = "Vestíbulo";
									break;
								default:
									System.out.println("Opción no válida.");
							}
							break;

						case "Pasillo Mazmorras":
							System.out.println(
									"Hace frío y huele a humedad. Hay una puerta cerrada con cadenas mágicas.");
							System.out.println("1. Intentar entrar en el Aula de Pociones");
							System.out.println("2. Usar 'Alohomora' en la puerta encadenada");
							System.out.println("3. Volver al Vestíbulo");

							String opMaz = sc.nextLine();
							switch (opMaz) {
								case "1":
									System.out.println("Entras. Snape está ahí.");
									System.out.println(
											"Snape: '¿Qué hace usted aquí? ¡Fuera!'. Te quita 5 puntos de moral.");
									moral -= 5;
									break;
								case "2":
									if (inventarioHechizos.contains("Alohomora")) {
										System.out.println("¡Click! Las cadenas caen. Entras a la Cámara Oculta.");
										System.out.println("Encuentras un HORROCRUX FALSO y una nota importante.");
										if (!inventarioObjetos.contains("Horrocrux Falso")) {
											inventarioObjetos.add("Horrocrux Falso");
											contadorHistoria += 2;
										}
									} else {
										System.out.println(
												"No puedes abrir la puerta bobo. Necesitas el hechizo de apertura.");
									}
									break;
								case "3":
									zonaActual = "Vestíbulo";
									break;
								default:
									System.out.println("Opción no válida.");
							}
							break;

						case "Gran Escalera":
							System.out.println("Las escaleras se mueven. Cuidado con no caerte.");
							System.out.println("1. Ir a la Biblioteca (Primer Piso)");
							System.out.println("2. Ir a la Enfermería (Segundo Piso)");
							System.out.println("3. Subir a la Torre de Astronomía");
							System.out.println("4. Ir al Séptimo Piso (Sala de los Menesteres)");
							System.out.println("5. Bajar al Vestíbulo");

							String opEscalera = sc.nextLine();
							switch (opEscalera) {
								case "1":
									zonaActual = "Biblioteca";
									break;
								case "2":
									zonaActual = "Enfermería";
									break;
								case "3":
									zonaActual = "Torre Astronomía";
									break;
								case "4":
									System.out.println("Estás frente al tapiz de Barnabas el Chiflado.");
									if (contadorHistoria >= 5) {
										System.out.println("¡La puerta aparece! Sientes el mal al otro lado.");
										System.out.println("¿Entrar? (s/n)");
										if (sc.nextLine().equalsIgnoreCase("s"))
											puertaSecretaAbierta = true;
									} else {
										System.out.println(
												"Paseas tres veces, pero la puerta no aparece. Te falta información (Puntos de historia: "
														+ contadorHistoria + "/5).");
									}
									break;
								case "5":
									zonaActual = "Vestíbulo";
									break;
								default:
									System.out.println("Opción no válida.");
							}
							break;

						case "Biblioteca":
							System.out.println("Silencio absoluto. Miles de libros te rodean.");
							System.out.println("1. Buscar un libro de hechizos");
							System.out.println("2. Hablar con Hermione");
							System.out.println("3. Volver a las Escaleras");

							int numeroHermione = rd.nextInt(1, 11); // número del 1 al 10
							String opBiblio = sc.nextLine();
							switch (opBiblio) {
								case "1":
									System.out.println("Lees el Libro 'Como aprender hechizos para tontos'");
									if (!inventarioHechizos.contains("Alohomora")) {
										System.out.println(
												"¡Has aprendido ALOHOMORA! Ahora puedes abrir puertas cerradas.");
										inventarioHechizos.add("Alohomora");
									} else {
										System.out.println("Ya te sabes este libro de memoria.");
									}
									break;
								case "2":
									if (inventarioObjetos.contains("Poción Inteligencia")) {
										System.out.println("Hermione: ya te di la poción... ¡Dejame estudiar!");
									} else {
										System.out.println(
												"Hermione: Estoy pensando en un número del 1 al 10. Si lo adivinas, te doy una Poción de Inteligencia.");
										System.out.print("¿Cuál crees que es? ");
										int intento = sc.nextInt();
										sc.nextLine(); // limpiar buffer

										if (intento == numeroHermione) {
											System.out.println(
													"¡Correcto! Hermione: Aquí tienes tu Poción de Inteligencia. Ahora déjame estudiar");
											inventarioObjetos.add("Poción Inteligencia");
										} else {
											System.out.println("Hermione: Mmm... no es ese. Vuelve otro momento.");
										}
										break;
									}
									break;
								case "3":
									zonaActual = "Gran Escalera";
									break;
								default:
									System.out.println("Opción no válida.");
							}
							break;

						case "Enfermería":
							System.out.println("Olor a desinfectante mágico. La Sra. Pomfrey vigila.");
							System.out.println("1. Pedir si te pueden curar.");
							System.out.println("2. Robar suministros (Riesgo Moral)");
							System.out.println("3. Volver a las Escaleras");

							String opEnf = sc.nextLine();
							switch (opEnf) {
								case "1":
									System.out.println(
											"Te tomas una poción curativa curativosa. Vida restaurada al 100% hehe, te quedas tan fresco como un labubu");
									vida = 100;
									break;
								case "2":
									System.out.println("Robas unas vendas.");
									moral -= 10;
									inventarioObjetos.add("Vendas");
									break;
								case "3":
									zonaActual = "Gran Escalera";
									break;
								default:
									System.out.println("Opción no válida.");
							}
							break;

						case "Terrenos":
							System.out
									.println("El aire fresco te golpea la cara. Ves la cabaña de Hagrid y el bosque.");
							System.out.println("1. Ir a la Cabaña de Hagrid");
							System.out.println("2. Entrar al Bosque Prohibido");
							System.out.println("3. Volver al Vestíbulo");

							String opTerreno = sc.nextLine();
							switch (opTerreno) {
								case "1":
									zonaActual = "Cabaña Hagrid";
									break;
								case "2":
									zonaActual = "Bosque Prohibido";
									break;
								case "3":
									zonaActual = "Vestíbulo";
									break;
								default:
									System.out.println("Opción no válida.");
							}
							break;

						case "Cabaña Hagrid":
							System.out.println("Hagrid está regando calabazas gigantes.");
							System.out.println("1. Preguntar por cosas extrañas.");
							System.out.println("2. Acariciar a Fang.");
							System.out.println("3. Volver a los Terrenos");

							String opCabana = sc.nextLine();
							switch (opCabana) {
								case "1":
									System.out
											.println("Hagrid: 'No debería deciros esto... pero seguid a las arañas'.");
									System.out.println("Has obtenido una pista clave.");
									contadorHistoria++;
									break;
								case "2":
									System.out.println("Fang te llena de babas. Te sientes feliz. +5 Moral.");
									moral += 5;
									break;
								case "3":
									zonaActual = "Terrenos";
									break;
								default:
									System.out.println("Opción no válida.");
							}
							break;

						case "Bosque Prohibido":
							System.out.println("Está muy oscurisisimo. Oyes ruidos de ramas rotas.");
							boolean tieneLuz = inventarioHechizos.contains("Lumos") || esDobby || esMyrtle;

							if (!tieneLuz) {
								System.out.println("¡Está demasiado oscuro! No puedes avanzar sin luz.");
								zonaActual = "Terrenos";
								break;
							}

							System.out.println("Lanzas el hechizo 'lumus' lo cual ilumina el camino.");
							System.out.println("1. Adentrarse en lo profundo");
							System.out.println("2. Buscar plantas raras");
							System.out.println("3. Salir corriendo");

							String opBosque = sc.nextLine();
							switch (opBosque) {
								case "1":
									System.out.println("¡Una Acromántula te ataca!");
									// aqui faltaria la escena de combate, habria que añadirla
									System.out.println("Logras vencerla y encuentras un objeto oscuro en su nido.");
									contadorHistoria += 2;
									break;
								case "2":
									System.out.println("Encuentras Dictamo.");
									inventarioObjetos.add("Dictamo");
									break;
								case "3":
									zonaActual = "Terrenos";
									break;
								default:
									System.out.println("Opción no válida.");
							}
							break;

						case "Torre Astronomía":
							System.out.println("La brisa nocturna es fuerte. Neville está aquí buscando su sapo.");
							System.out.println("1. Ayudar a Neville.");
							System.out.println("2. Mirar por el telescopio.");
							System.out.println("3. Bajar.");

							String opTorre = sc.nextLine();
							switch (opTorre) {
								case "1":
									System.out.println(
											"Encuentras a su sapo debajo de un banco. Neville te enseña el hechizo 'Lumos' como agradecimiento.");
									if (!inventarioHechizos.contains("Lumos"))
										inventarioHechizos.add("Lumos");
									break;
								case "2":
									System.out.println("Ves la Marca Tenebrosa en el cielo. El tiempo se acaba.");
									break;
								case "3":
									zonaActual = "Gran Escalera";
									break;
								default:
									System.out.println("Opción no válida.");
							}
							break;

						default:
							// Si el jugador se va una zona que no existe en el mapa, lo devuelve al
							// vestibulo
							System.out.println("ERROR DE NAVEGACIÓN. Vuelves al Vestíbulo.");
							zonaActual = "Vestíbulo";
							break;
					}
				}

				// FINAL DEL JUEGO
				System.out.println("\nLlegas a la Sala de los Menesteres. El ritual ha comenzado.");
				// aqui faltaria la escena de combate y algun dialogo con el mago malo maloso

				// Cálculo de finales según moral (HABRIA QUE REVISAR LA MORAL PORQUE PUSE
				// NUMEROS UN POCO RANDOM, Y ALOMEJOR HABRIA QUE HACER QUE ALGUNAS DECISIONES
				// CAMBIEN LA MORAL
				// Tambien son algo genericas las descripciones de los finales se puede dar mas
				// detalle la verdad
				if (moral > 80) {
					System.out.println("FINAL BAKANO: Has salvado Hogwarts con honor y valentía.");
				} else if (moral < 40) {
					System.out.println("FINAL OSCURO: Has vencido, pero el poder oscuro te ha corrompido.");
				} else {
					System.out.println("FINAL AMARGO: El enemigo huyó, pero Hogwarts está a salvo por hoy.");
				}

				System.out.println("\n--- FIN DEL JUEGO ---");

			} else {
				intentos++;
				System.out.println("Te has equivocado. Intento " + intentos + " de 3.");
			}
		}

		if (!correcto) {
			String txt = "Has agotado tus intentos... Se apaga el juego.";
			for (int i = 0; i < txt.length(); i++) {
				System.out.print(txt.charAt(i));
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

}

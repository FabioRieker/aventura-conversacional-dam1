package proyectoHarryPotter;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ProyectoHP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("╔══════════════════════════════════════════════════════════════════════╗");
		System.out.println(
				"        			                                                                                         \n"
						+ "                                                                                                    \n"
						+ "      ▄ .▄ ▄▄▄· ▄▄▄  ▄▄▄   ▄· ▄▌     ▄▄▄·      ▄▄▄▄▄▄▄▄▄▄▄▄▄ .▄▄▄                                   \n"
						+ "     ██▪▐█▐█ ▀█ ▀▄ █·▀▄ █·▐█▪██▌    ▐█ ▄█▪     •██  •██  ▀▄.▀·▀▄ █·                                 \n"
						+ "     ██▀▐█▄█▀▀█ ▐▀▀▄ ▐▀▀▄ ▐█▌▐█▪     ██▀· ▄█▀▄  ▐█.▪ ▐█.▪▐▀▀▪▄▐▀▀▄                                  \n"
						+ "     ██▌▐▀▐█ ▪▐▌▐█•█▌▐█•█▌ ▐█▀·.    ▐█▪·•▐█▌.▐▌ ▐█▌· ▐█▌·▐█▄▄▌▐█•█▌                                 \n"
						+ "     ▀▀▀ · ▀  ▀ .▀  ▀.▀  ▀  ▀ •     .▀    ▀█▄▀▪ ▀▀▀  ▀▀▀  ▀▀▀ .▀  ▀                                 \n"
						+ " ▄▄▄·  ▌ ▐·▄▄▄ . ▐ ▄ ▄▄▄▄▄▄• ▄▌▄▄▄   ▄▄▄·                                    \n"
						+ "▐█ ▀█ ▪█·█▌▀▄.▀·•█▌▐█•██  █▪██▌▀▄ █·▐█ ▀█                                    \n"
						+ "▄█▀▀█ ▐█▐█•▐▀▀▪▄▐█▐▐▌ ▐█.▪█▌▐█▌▐▀▀▄ ▄█▀▀█                                    \n"
						+ "▐█ ▪▐▌ ███ ▐█▄▄▌██▐█▌ ▐█▌·▐█▄█▌▐█•█▌▐█ ▪▐▌                                   \n"
						+ " ▀  ▀ . ▀   ▀▀▀ ▀▀ █▪ ▀▀▀  ▀▀▀ .▀  ▀ ▀  ▀                                    \n"
						+ "     ▄▄·        ▐ ▄  ▌ ▐·▄▄▄ .▄▄▄  .▄▄ ·  ▄▄▄·  ▄▄· ▪         ▐ ▄  ▄▄▄· ▄▄▌  \n"
						+ "    ▐█ ▌▪▪     •█▌▐█▪█·█▌▀▄.▀·▀▄ █·▐█ ▀. ▐█ ▀█ ▐█ ▌▪██ ▪     •█▌▐█▐█ ▀█ ██•  \n"
						+ "    ██ ▄▄ ▄█▀▄ ▐█▐▐▌▐█▐█•▐▀▀▪▄▐▀▀▄ ▄▀▀▀█▄▄█▀▀█ ██ ▄▄▐█· ▄█▀▄ ▐█▐▐▌▄█▀▀█ ██▪  \n"
						+ "    ▐███▌▐█▌.▐▌██▐█▌ ███ ▐█▄▄▌▐█•█▌▐█▄▪▐█▐█ ▪▐▌▐███▌▐█▌▐█▌.▐▌██▐█▌▐█ ▪▐▌▐█▌▐▌\n"
						+ "    ·▀▀▀  ▀█▄▀▪▀▀ █▪. ▀   ▀▀▀ .▀  ▀ ▀▀▀▀  ▀  ▀ ·▀▀▀ ▀▀▀ ▀█▄▀▪▀▀ █▪ ▀  ▀ .▀▀▀      	                                                                                        \n"
						+ "                                                                                                           ");
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
		String casa = "";
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
				ArrayList<String> inventarioHechizosMO = new ArrayList<>();
				ArrayList<String> inventarioHechizos = new ArrayList<>();
				ArrayList<Integer> daniosHechizos = new ArrayList<>();
				int vida = 100;
				int moral = 50;
				int contadorHistoria = 0;

				// esta variable de momento no se usa
				String nombreFinalPersonaje = "Jugador";
				// variables enemigos

				// Barón Sanguinario
				ArrayList<String> inventarioObjetosBaron = new ArrayList<>();
				ArrayList<String> inventarioHechizosBaron = new ArrayList<>();
				ArrayList<Integer> daniosHechizosBaron = new ArrayList<>();
				int vidaBaron = 45;
				inventarioObjetosBaron.add("cabeza");
				// Hechizos Barón
				// Índice 0
				inventarioHechizosBaron.add("Umbraculum");
				daniosHechizosBaron.add(5);
				// Índice 1
				inventarioHechizosBaron.add("Sanguinem");
				daniosHechizosBaron.add(10);
				// Índice 2
				inventarioHechizosBaron.add("Crimsonis");
				daniosHechizosBaron.add(15);

				// Acromántula
				ArrayList<String> inventarioHechizosTula = new ArrayList<>();
				ArrayList<Integer> daniosHechizosTula = new ArrayList<>();
				int vidaTula = 60;
				// Hechizos Tula
				// Índice 0
				inventarioHechizosTula.add("Telatrampa");
				daniosHechizosTula.add(6);
				// Índice 1
				inventarioHechizosTula.add("Picadura");
				daniosHechizosTula.add(12);
				// Índice 2
				inventarioHechizosTula.add("Plancha");
				daniosHechizosTula.add(18);

				// Mago malo maloso
				ArrayList<String> inventarioObjetosMago = new ArrayList<>();
				ArrayList<String> inventarioHechizosMago = new ArrayList<>();
				ArrayList<Integer> daniosHechizosMago = new ArrayList<>();
				int vidaMago = 75;
				inventarioObjetosMago.add("nariz");
				// Hechizos Mago
				// Índice 0
				inventarioHechizosMago.add("Fragorem");
				daniosHechizosMago.add(8);
				// Índice 1
				inventarioHechizosMago.add("Nebula Mortem");
				daniosHechizosMago.add(16);
				// Índice 2
				inventarioHechizosMago.add("Exanimus");
				daniosHechizosMago.add(24);

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
				String nombre = "";
				// variables batalla
				boolean turnoJugador;

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
							vida = 45;
							moral = 40;
							inventarioObjetos.add("Gafas Rotas");
							inventarioObjetos.add("Varita de Acebo");
							// Hechizos Myrtle
							// Índice 0
							inventarioHechizos.add("Susurrus");
							daniosHechizos.add(8);
							// Índice 1
							inventarioHechizos.add("Lacrimus");
							daniosHechizos.add(16);
							// Índice 2
							inventarioHechizos.add("Anima Vinculus");
							daniosHechizos.add(0);
							valido = true;
							break;
						case "2":
							System.out.println("Has desbloqueado a Dobby");
							esDobby = true;
							nombreFinalPersonaje = "Dobby";
							vida = 30;
							moral = 60;
							inventarioObjetos.add("Poción de Vida");
							inventarioObjetos.add("Calcetín");
							// Hechizos Dobby
							// Índice 0
							inventarioHechizos.add("Desarmar");
							daniosHechizos.add(5);
							// Índice 1
							inventarioHechizos.add("Aparición");
							daniosHechizos.add(10);
							// Índice 2
							inventarioHechizos.add("Explosiones Mágicas");
							daniosHechizos.add(25);
							valido = true;
							break;
						case "3":
							System.out.println("Has desbloqueado a Estudiante");
							esEstudiante = true;
							valido = true;
							System.out.println("¿Cómo te llamas?");
							nombre = sc.nextLine();
							nombreFinalPersonaje = nombre;
							vida = 60;
							moral = 80;
							inventarioObjetos.add("Varita de Acebo");
							// Hechizos Estudiante
							// Índice 0
							inventarioHechizos.add("Incendio");
							daniosHechizos.add(5);
							// Índice 1
							inventarioHechizos.add("Bombarda");
							daniosHechizos.add(10);
							// Índice 2
							inventarioHechizos.add("Glacius");
							daniosHechizos.add(20);

							System.out.println("Era una mañana tranquila en Londres cuando de repente...");
							System.out.println("Viene un búho para entregarte un sobre");
							String carta = "Estimado/a " + nombre + ",\n"
									+ "Nos complace informarle que ha sido admitido/a en el Colegio Hogwarts de Magia y Hechicería.\n"
									+ "El curso comienza el 1 de septiembre. El tren parte de la estación de King's Cross,\n"
									+ "andén 9¾, a las once en punto.\n\n"
									+ "Adjunto encontrará la lista de libros y materiales necesarios.\n\n"
									+ "Atentamente,\n" + "Minerva McGonagall\n" + "Subdirectora de Hogwarts";
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
								System.out.println("4. Poder manipular a los demás.");
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
									case "4":
										slytherin++;
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
								System.out.println("4. La habitación de los Profesores.");
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
									case "4":
										slytherin++;
										break;
									default:
										System.out.println("No has marcado bien la puntuación, vuelve a intentarlo.");
										valido1 = false;
										break;
								}
							} while (!valido1);
							if (hufflepuff >= ravenclaw && hufflepuff >= gryffindor && ravenclaw >= slytherin) {
								System.out.println("Enhorabuena eres de Hufflepuff.");
								moral = 80;
								casa = "Hufflepuff";
							} else if (ravenclaw >= hufflepuff && ravenclaw >= gryffindor && ravenclaw >= slytherin) {
								System.out.println("Enhorabuena eres de Ravenclaw.");
								moral = 60;
								casa = "Ravenclaw";
							} else if (gryffindor >= hufflepuff && gryffindor >= ravenclaw && gryffindor >= slytherin) {
								System.out.println("Enhorabuena eres de Gryffindor.");
								moral = 70;
								casa = "Gryffindor";
							} else {
								System.out.println("Enhorabuena eres de Slytherin.");
								moral = 30;
								casa = "Slytherin";
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
				System.out.println("       COMIENZA LA AVENTURA EN HOGWARTS          ║");
				System.out.println("═════════════════════════════════════════════════╝");
				System.out.println("Debes investigar el castillo y fortalecerte antes de enfrentar al mal.");
				System.out.println("Consejito: Aprende hechizos como 'Alohomora' para abrir nuevas zonas ;)");

				boolean explorando = true;

				while (explorando) {
					// Hace que salga un poltergeist que puede salir en todo el juego, en cualquier
					// zona. Hay un 15 % de posibilidades de que salga, si sale se calcula el daño
					// que te va a hacer
					if (rd.nextInt(100) < 15) {
						System.out.println("\n¡Peeves el Poltergeist aparece de la nada!");
						System.out.println("Peeves: Mocosoo! Te tira tizas a la cara ");
						// Calcula cuánto daño te va a hacer
						int danioPeeves = rd.nextInt(5) + 1;
						vida -= danioPeeves;
						System.out.println("Pierdes " + danioPeeves + " de vida por la humillación.");
					}

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
									.println(
											"El gran vestibulo de entrada. Las antorchas iluminan las paredes de piedra.");
							System.out.println("1. Ir al Gran Comedor");
							System.out.println("2. Bajar a las Mazmorras");
							System.out.println("3. Subir por la Gran Escalera");
							System.out.println("4. Salir a los Terrenos del Castillo");
							System.out.println("5. Ver Estado e Inventario");

							String op = sc.nextLine();
							// Esto es un codigo secreto que añade el hechizo Avada Kedavra, y te da tope
							// de vida. Flow codigo konami
							if (op.equals("travesura realizada")) {
								System.out.println("¡El Mapa del Merodeador te revela secretos!");
								inventarioHechizos.add("Avada Kedavra");
								daniosHechizos.add(100);
								vida = 999;
								System.out.println("Has obtenido poder ilimitado.");
							}
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
									System.out.println("HechizosMO: " + inventarioHechizosMO);
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
							System.out.println("4. Ir a los barriles de la cocina (Sala Común Hufflepuff)");

							String opComedor = sc.nextLine();
							switch (opComedor) {
								case "1":
									if (esMyrtle)
										System.out.println(
												"El Barón te saluda con respeto (miedo). Te da una pista sobre el bosque.");
									else
										System.out.println("El Barón te mira mal. Sientes un escalofrío.");
									System.out.println("¡Comienza la batalla!");

									// DECIDIR QUIÉN EMPIEZA
									if (Math.random() < 0.5) {
										turnoJugador = true;
										System.out.println("\n>> Empieza el jugador");
									} else {
										turnoJugador = false;
										System.out.println("\n>> Empieza el Barón Sanguinario");
									}

									// ========================================================================
									// BUCLE DE COMBATE
									// ========================================================================
									while (vida > 0 && vidaBaron > 0) {

										// ------------------- TURNO DEL JUGADOR -------------------
										if (turnoJugador) {
											System.out.println("\n------------------------------------------------");
											System.out.println("TU TURNO | Vida: " + vida + " | Barón: " + vidaBaron);
											System.out.println("¿Qué quieres hacer?");
											System.out.println("1. Atacar");
											System.out.println("2. Usar Objeto");

											int accion = sc.nextInt();

											// --- OPCIÓN 1: ATACAR ---
											if (accion == 1) {
												System.out.println("=== Hechizos disponibles ===");
												for (int i = 0; i < inventarioHechizos.size(); i++) {
													System.out.println(
															(i + 1) + ". " + inventarioHechizos.get(i) + " (Daño: "
																	+ daniosHechizos.get(i) + ")");
												}
												System.out.println("Elige ataque:");
												int opcionAtaque = sc.nextInt();

												if (opcionAtaque >= 1 && opcionAtaque <= inventarioHechizos.size()) {
													// Recuperar datos de las listas del jugador
													String ataqueSeleccionado = inventarioHechizos
															.get(opcionAtaque - 1);
													int danioBase = daniosHechizos.get(opcionAtaque - 1);

													System.out.println("¡Has lanzado " + ataqueSeleccionado + "!");

													// Determinar acierto
													int resultado = rd.nextInt(3); // 0=Total, 1=Parcial, 2=Fallo
													int danioFinal = 0;

													// --- LÓGICA DE EFECTOS ---
													if (ataqueSeleccionado.equals("Desarmar")
															&& inventarioObjetosBaron.contains("cabeza")
															&& resultado == 0
															|| resultado == 1) {
														inventarioObjetosBaron.remove("cabeza");
														danioBase = danioBase * 2;
													}

													if (resultado == 0) {
														danioFinal = danioBase;
														System.out.println(
																">> ¡Impacto Directo! El Barón recibe " + danioFinal
																		+ " de daño.");
													} else if (resultado == 1) {
														danioFinal = danioBase / 2;
														System.out.println(
																">> El Barón se cubre. Recibe " + danioFinal
																		+ " de daño.");
													} else {
														System.out.println(">> ¡El Barón esquivó tu ataque!");
													}

													// --- LÓGICA DE EFECTOS ---
													if (ataqueSeleccionado.equals("Desarmar")
															&& inventarioObjetosBaron.contains("cabeza")
															&& resultado == 0
															|| resultado == 1) {
														System.out.println(
																"La cabeza del Barón Sanguinario cayó al suelo.");
													}

													vidaBaron -= danioFinal;
													if (vidaBaron < 0)
														vidaBaron = 0;

													turnoJugador = false; // Turno finalizado

												} else {
													System.out.println("Ataque no válido. Vuelve a intentarlo.");
													continue; // Reinicia el bucle sin cambiar turno
												}

												// --- OPCIÓN 2: USAR OBJETO ---
											} else if (accion == 2) {
												if (inventarioObjetos.isEmpty()) {
													System.out.println("¡No tienes objetos en el inventario!");
													continue; // Vuelve al menú
												}

												System.out.println("=== Inventario ===");
												for (int i = 0; i < inventarioObjetos.size(); i++) {
													System.out.println((i + 1) + ". " + inventarioObjetos.get(i));
												}
												System.out.println("0. Cancelar");

												System.out.println("Elige objeto:");
												int opcionObjeto = sc.nextInt();

												if (opcionObjeto == 0) {
													continue; // Cancelar y volver al menú principal
												}

												if (opcionObjeto >= 1 && opcionObjeto <= inventarioObjetos.size()) {
													String objetoElegido = inventarioObjetos.get(opcionObjeto - 1);
													System.out.println("Usaste: " + objetoElegido);

													// --- LÓGICA DE EFECTOS ---
													if (objetoElegido.equals("Poción de Vida")) {
														int cura = 20; // Cantidad que cura
														vida += cura;
														System.out.println(">> ¡Recuperas " + cura + " de vida!");
													} else if (objetoElegido.equals("Calcetín")) {
														System.out.println(">> Te pones el calcetín. No pasa nada.");
													} else if (objetoElegido.equals("Vendas")) {
														int cura = 10; // Cantidad que cura
														vida += cura;
													} else {
														System.out.println(
																">> Este objeto no parece tener efecto en combate.");
													}

													// ELIMINAR EL OBJETO USADO
													inventarioObjetos.remove(opcionObjeto - 1);

													turnoJugador = false; // Turno finalizado tras usar objeto
												} else {
													System.out.println("Opción inválida.");
													continue;
												}

											} else {
												System.out.println("Acción no reconocida.");
												continue;
											}
										}
										// ------------------- TURNO DEL BARÓN (ENEMIGO) -------------------
										else {
											System.out.println("\n------------------------------------------------");
											System.out.println("TURNO DEL BARÓN SANGUINARIO");

											// Selección aleatoria del ataque usando el tamaño de su lista
											int indiceAleatorio = rd.nextInt(inventarioHechizosBaron.size());

											// Extraer nombre y daño con el mismo índice
											String nombreAtaque = inventarioHechizosBaron.get(indiceAleatorio);
											int danioBase = daniosHechizosBaron.get(indiceAleatorio);

											System.out.println("El Barón ataca con: ¡" + nombreAtaque + "!");

											// Calcular acierto
											int resultado = rd.nextInt(3);
											int danioFinal = 0;

											if (resultado == 0) {
												danioFinal = danioBase;
												System.out.println(
														">> ¡Te golpea brutalmente! Recibes " + danioFinal
																+ " de daño.");
											} else if (resultado == 1) {
												danioFinal = danioBase / 2;
												System.out.println(
														">> Te cubres a tiempo. Recibes solo " + danioFinal
																+ " de daño.");
											} else {
												System.out.println(">> ¡Has esquivado el ataque!");
											}

											vida -= danioFinal;
											if (vida < 0)
												vida = 0;
											System.out.println("Tu vida restante: " + vida);

											turnoJugador = true; // Le toca al jugador
										}
									}

									// ========================================================================
									// FIN DEL COMBATE
									// ========================================================================
									if (vida <= 0) {
										System.out.println("\n***********************************");
										System.out.println("      HAS SIDO DERROTADO...");
										System.out.println("***********************************");
										vidaBaron = 45;

									} else {
										System.out.println("\n***********************************");
										System.out.println(" ¡HAS VENCIDO AL BARÓN SANGUINARIO!");
										System.out.println("***********************************");

									}

									break;
								case "2":
									System.out.println("Comes un pastel de calabaza. +10 Vida.");
									vida += 10;
									break;
								case "3":
									zonaActual = "Vestíbulo";
									break;

								case "4":
									if (casa.equals("Hufflepuff")) {
										System.out
												.println(
														"Tocas el barril al ritmo del hipno de Hufflepuff. La tapa se abre ");
										System.out.println(
												"Es un lugar cálido y lleno de plantas. Te relajas profundamente.");
										System.out.println("Recuperas moral");
										moral += 10;

									} else {
										System.out.println(
												"Golpeas un barril y te rocía de vinagre. No eres de Hufflepuff.");
										moral -= 5;
										break;
									}
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
							System.out.println("4. Murmurar contraseña al muro (Sala Común Slytherin)");

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

								case "4":
									if (casa.equals("Slytherin")) {
										System.out.println("Susurras 'Sangre Pura'. La serpiente de piedra se mueve.");
										System.out.println(
												"La sala verde y plateada bajo el lago te hace sentir poderoso.");
										System.out.println("Tu ambición crece. +20 de Moral.");
										moral += 20;
									} else {
										System.out.println("El muro no se mueve. Un alumno de Slytherin se ríe de ti.");
										moral -= 10;
									}
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
							System.out.println("6. Retrato de la Señora Gorda");

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
								case "6":
									if (casa.equals("Gryffindor")) {
										System.out.println("Dices 'Caput Draconis'. El retrato gira.");
										System.out
												.println("El fuego crepita en la sala circular. Te sientes valiente.");
										System.out.println("Recuperas moral.");
										moral += 20;
									} else {
										System.out
												.println("La Señora Gorda no te deja pasar: '¡Contraseña incorrecta!'");
									}
									break;

								default:
									System.out.println("Opción no válida.");
							}
							break;

						case "Biblioteca":
							System.out.println("Silencio absoluto. Miles de libros te rodean.");
							System.out.println("1. Buscar un libro de hechizos");
							System.out.println("2. Hablar con Hermione");
							System.out.println("3. Forzar la puerta oxidada del fondo (Pasillo 3er Piso)");
							System.out.println("4. Volver a las Escaleras");

							int numeroHermione = rd.nextInt(1, 11);
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
									}
									break;
								case "3":
									System.out.println(
											"Apartas unas estanterías viejas y te cuelas en la zona prohibida...");
									zonaActual = "Pasillo Tercer Piso";
									break;

								case "4":
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
									System.out.println("Hola " + nombre + ", ¿Qué tal estás?");
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
							System.out.println(
									"Ves unas plantas extrañas, un sendero serpenteante, y en la lejanía vislumbras algo en la oscuridad del bosque");
							System.out.println("Que quieres hacer:");
							System.out.println("1. Adentrarse en lo profundo");
							System.out.println("2. Buscar plantas raras");
							System.out.println("3. Caminar por el sendero");
							System.out.println("4. Salir corriendo");

							String opBosque = sc.nextLine();
							switch (opBosque) {
								case "1":
									System.out.println("¡Una Acromántula te ataca!");
									System.out.println("¡Comienza la batalla!");

									// DECIDIR QUIÉN EMPIEZA
									if (Math.random() < 0.5) {
										turnoJugador = true;
										System.out.println("\n>> Empieza el jugador");
									} else {
										turnoJugador = false;
										System.out.println("\n>> Empieza la Acromántula");
									}

									// ========================================================================
									// BUCLE DE COMBATE
									// ========================================================================
									while (vida > 0 && vidaTula > 0) {

										// ------------------- TURNO DEL JUGADOR -------------------
										if (turnoJugador) {
											System.out.println("\n------------------------------------------------");
											System.out.println(
													"TU TURNO | Vida: " + vida + " | Acromántula: " + vidaTula);
											System.out.println("¿Qué quieres hacer?");
											System.out.println("1. Atacar");
											System.out.println("2. Usar Objeto");

											int accion = sc.nextInt();

											// --- OPCIÓN 1: ATACAR ---
											if (accion == 1) {
												System.out.println("=== Hechizos disponibles ===");
												for (int i = 0; i < inventarioHechizos.size(); i++) {
													System.out.println(
															(i + 1) + ". " + inventarioHechizos.get(i) + " (Daño: "
																	+ daniosHechizos.get(i) + ")");
												}
												System.out.println("Elige ataque:");
												int opcionAtaque = sc.nextInt();

												if (opcionAtaque >= 1 && opcionAtaque <= inventarioHechizos.size()) {
													// Recuperar datos de las listas del jugador
													String ataqueSeleccionado = inventarioHechizos
															.get(opcionAtaque - 1);
													int danioBase = daniosHechizos.get(opcionAtaque - 1);

													System.out.println("¡Has lanzado " + ataqueSeleccionado + "!");

													// Determinar acierto
													int resultado = rd.nextInt(3); // 0=Total, 1=Parcial, 2=Fallo
													int danioFinal = 0;

													if (resultado == 0) {
														danioFinal = danioBase;
														System.out.println(">> ¡Impacto Directo! La Acromántula recibe "
																+ danioFinal + " de daño.");
													} else if (resultado == 1) {
														danioFinal = danioBase / 2;
														System.out.println(
																">> La Acromántula se cubre. Recibe " + danioFinal
																		+ " de daño.");
													} else {
														System.out.println(">> ¡La Acromántula esquivó tu ataque!");
													}

													vidaTula -= danioFinal;
													if (vidaTula < 0)
														vidaTula = 0;

													// --- LÓGICA DE EFECTOS ---
													if (ataqueSeleccionado.equals("Anima Vinculus") && resultado == 0
															|| resultado == 1) {
														vida = (vida + vidaTula) / 2;
														vidaTula = (vida + vidaTula) / 2;
														System.out.println("¡Los combatientes compartieron su dolor!");
													}

													turnoJugador = false; // Turno finalizado

												} else {
													System.out.println("Ataque no válido. Vuelve a intentarlo.");
													continue; // Reinicia el bucle sin cambiar turno
												}

												// --- OPCIÓN 2: USAR OBJETO ---
											} else if (accion == 2) {
												if (inventarioObjetos.isEmpty()) {
													System.out.println("¡No tienes objetos en el inventario!");
													continue; // Vuelve al menú
												}

												System.out.println("=== Inventario ===");
												for (int i = 0; i < inventarioObjetos.size(); i++) {
													System.out.println((i + 1) + ". " + inventarioObjetos.get(i));
												}
												System.out.println("0. Cancelar");

												System.out.println("Elige objeto:");
												int opcionObjeto = sc.nextInt();

												if (opcionObjeto == 0) {
													continue; // Cancelar y volver al menú principal
												}

												if (opcionObjeto >= 1 && opcionObjeto <= inventarioObjetos.size()) {
													String objetoElegido = inventarioObjetos.get(opcionObjeto - 1);
													System.out.println("Usaste: " + objetoElegido);

													// --- LÓGICA DE EFECTOS ---
													if (objetoElegido.equals("Poción de Vida")) {
														int cura = 20; // Cantidad que cura
														vida += cura;
														System.out.println(">> ¡Recuperas " + cura + " de vida!");
													} else if (objetoElegido.equals("Calcetín")) {
														System.out.println(">> Te pones el calcetín. No pasa nada.");
													} else if (objetoElegido.equals("Vendas")) {
														int cura = 10; // Cantidad que cura
														vida += cura;
													} else {
														System.out.println(
																">> Este objeto no parece tener efecto en combate.");
													}

													// ELIMINAR EL OBJETO USADO
													inventarioObjetos.remove(opcionObjeto - 1);

													turnoJugador = false; // Turno finalizado tras usar objeto
												} else {
													System.out.println("Opción inválida.");
													continue;
												}

											} else {
												System.out.println("Acción no reconocida.");
												continue;
											}
										}
										// ------------------- TURNO DE LA ACROMÁNTULA (ENEMIGO) -------------------
										else {
											System.out.println("\n------------------------------------------------");
											System.out.println("TURNO DE LA ACROMÁNTULA");

											// Selección aleatoria del ataque usando el tamaño de su lista
											int indiceAleatorio = rd.nextInt(inventarioHechizosTula.size());

											// Extraer nombre y daño con el mismo índice
											String nombreAtaque = inventarioHechizosTula.get(indiceAleatorio);
											int danioBase = daniosHechizosTula.get(indiceAleatorio);

											System.out.println("La Acromántula ataca con: ¡" + nombreAtaque + "!");

											// Calcular acierto
											int resultado = rd.nextInt(3);
											int danioFinal = 0;

											if (resultado == 0) {
												danioFinal = danioBase;
												System.out.println(
														">> ¡Te golpea brutalmente! Recibes " + danioFinal
																+ " de daño.");
											} else if (resultado == 1) {
												danioFinal = danioBase / 2;
												System.out.println(
														">> Te cubres a tiempo. Recibes solo " + danioFinal
																+ " de daño.");
											} else {
												System.out.println(">> ¡Has esquivado el ataque!");
											}

											// --- LÓGICA DE EFECTOS ---
											if (nombreAtaque == ("Picadura") && resultado == 0 || resultado == 1) {
												if (inventarioObjetos.contains("Poción de Vida")) {
													vidaTula += 20;
													inventarioObjetos.remove("Poción de Vida");
													System.out.println(
															"La Acromántula te roba la Poción de Vida y se cura 20 HP.");
												} else if (inventarioObjetos.contains("Vendas")) {
													vidaTula += 10;
													inventarioObjetos.remove("Vendas");
													System.out.println(
															"La Acromántula te roba las Vendas y se cura 10 HP.");
												}
											}

											vida -= danioFinal;
											if (vida < 0)
												vida = 0;
											System.out.println("Tu vida restante: " + vida);

											turnoJugador = true; // Le toca al jugador
										}
									}

									// ========================================================================
									// FIN DEL COMBATE
									// ========================================================================
									if (vida <= 0) {
										System.out.println("\n***********************************");
										System.out.println("      HAS SIDO DERROTADO...");
										System.out.println("***********************************");
										vidaTula = 60;

									} else {
										System.out.println("\n***********************************");
										System.out.println(" ¡HAS VENCIDO A LA ACROMÁNTULA!");
										System.out.println("***********************************");
										System.out.println("Encuentras un objeto oscuro en su nido.");
										contadorHistoria += 2;
										// CAMBIO MATEO: Ahora da un colmillo
										if (!inventarioObjetos.contains("Colmillo Acromántula")) {
											inventarioObjetos.add("Colmillo Acromántula");
											System.out.println("Has obtenido: Colmillo Acromántula");
										}
									}

									break;
								case "2":
									System.out.println("Encuentras Dictamo.");
									inventarioObjetos.add("Dictamo");
									break;
								case "3":

									System.out.println(
											"Te encuentras con un pequeño labubu adorable, el cuál te saca los dientes y te ataca  \n ");
									if (esMyrtle) {
										System.out
												.println("El Labubu intenta morderte, pero sus dientes te atraviesan.");
										System.out.println("Myrtle: ¡Jiji! ¡Qué cosita más tonta, no puedes herirme!");
										System.out.println("El monstruo huye confundido, dejando caer unas hierbas.");
										inventarioObjetos.add("Dictamo");
									} else {
										System.out.println("El Labubu salta hacia tu cuello y todo se vuelve negro...");
										System.out.println(" "
												+ "███▄ ▄███▓ █    ██ ▓█████  ██▀███  ▓█████   ██████                     \n"
												+ "▓██▒▀█▀ ██▒ ██  ▓██▒▓█   ▀ ▓██ ▒ ██▒▓█   ▀ ▒██    ▒                     \n"
												+ "▓██    ▓██░▓██  ▒██░▒███   ▓██ ░▄█ ▒▒███   ░ ▓██▄                       \n"
												+ "▒██    ▒██ ▓▓█  ░██░▒▓█  ▄ ▒██▀▀█▄  ▒▓█  ▄   ▒   ██▒                    \n"
												+ "▒██▒   ░██▒▒▒█████▓ ░▒████▒░██▓ ▒██▒░▒████▒▒██████▒▒                    \n"
												+ "░ ▒░   ░  ░░▒▓▒ ▒ ▒ ░░ ▒░ ░░ ▒▓ ░▒▓░░░ ▒░ ░▒ ▒▓▒ ▒ ░                    \n"
												+ "░      ░    ░░░ ░ ░    ░     ░░   ░    ░   ░  ░  ░                      \n"
												+ "       ░      ░        ░  ░   ░        ░  ░      ░                      \n"
												+ "                                                                        \n"
												+ "       ▄▄▄       ▄████▄   ▄▄▄       ▄▄▄▄    ▄▄▄        ██████           \n"
												+ "      ▒████▄    ▒██▀ ▀█  ▒████▄    ▓█████▄ ▒████▄    ▒██    ▒           \n"
												+ "      ▒██  ▀█▄  ▒▓█    ▄ ▒██  ▀█▄  ▒██▒ ▄██▒██  ▀█▄  ░ ▓██▄             \n"
												+ "      ░██▄▄▄▄██ ▒▓▓▄ ▄██▒░██▄▄▄▄██ ▒██░█▀  ░██▄▄▄▄██   ▒   ██▒          \n"
												+ "       ▓█   ▓██▒▒ ▓███▀ ░ ▓█   ▓██▒░▓█  ▀█▓ ▓█   ▓██▒▒██████▒▒          \n"
												+ "       ▒▒   ▓▒█░░ ░▒ ▒  ░ ▒▒   ▓▒█░░▒▓███▀▒ ▒▒   ▓▒█░▒ ▒▓▒ ▒ ░          \n"
												+ "        ▒   ▒▒ ░            ░   ▒    ░    ░   ░   ▒   ░  ░            \n"
												+ "            ░  ░░ ░            ░  ░ ░            ░  ░      ░            \n"
												+ "                ░                        ░                              \n"
												+ "▓█████▄ ▓█████   ██████  ▄▄▄       ███▄    █   ▄████  ██▀███   ▄▄▄      ▓█████▄  ▒█████  					\n"
												+ "▒██▀ ██▌▓█   ▀ ▒██    ▒ ▒████▄     ██ ▀█   █  ██▒ ▀█▒▓██ ▒ ██▒▒████▄    ▒██▀ ██▌▒██▒  ██▒				\n"
												+ "░██   █▌▒███   ░ ▓██▄   ▒██  ▀█▄  ▓██  ▀█ ██▒▒██░▄▄▄░▓██ ░▄█ ▒▒██  ▀█▄  ░██   █▌▒██░  ██▒				\n"
												+ "░▓█▄   ▌▒▓█  ▄   ▒   ██▒░██▄▄▄▄██ ▓██▒  ▐▌██▒░▓█  ██▓▒██▀▀█▄  ░██▄▄▄▄██ ░▓█▄   ▌▒██   ██░				\n"
												+ "░▒████▓ ░▒████▒▒██████▒▒ ▓█   ▓██▒▒██░   ▓██░░▒▓███▀▒░██▓ ▒██▒ ▓█   ▓██░▒████▓ ░ ████▓▒░				\n"
												+ " ▒▒▓  ▒ ░░ ▒░ ░▒ ▒▓▒ ▒ ░ ▒▒   ▓▒█░░ ▒░   ▒ ▒  ░▒   ▒ ░ ▒▓ ░▒▓░ ▒▒   ▓▒█░	▒▒▓  ▒ ░ ▒░▒░▒░				\n"
												+ " ░ ▒  ▒  ░ ░  ░░ ░▒  ░ ░  ▒   ▒▒ ░░ ░░   ░ ▒░  ░   ░   ░▒ ░ ▒░  ▒   ▒▒ ░	░ ▒  ▒   ░ ▒ ▒░				\n"
												+ " ░ ░  ░    ░   ░  ░      ░   ▒      ░   ░ ░ ░ ░   ░   ░░   ░   ░   ▒   	░ ░  ░ ░ ░ ░ ▒				\n"
												+ "   ░       ░  ░      ░        ░  ░         ░       ░    ░           ░  ░							\n"
												+ " ░                                                                      ");

										System.out.println("Has muerto devorado por una criatura adorable.");
										vida = 0;
										return;
									}
									break;

								case "4":
									zonaActual = "Terrenos";
									break;
								default:
									System.out.println("Opción no válida.");
							}
							break;

						case "Torre Astronomía":
							System.out.println("La brisa nocturna es fuerte. Neville está mirando las estrellas.");
							System.out.println("1. Hablar con Neville Longbottom.");
							System.out.println("2. Mirar por el telescopio.");
							System.out.println("3. Bajar a la Gran Escalera.");
							System.out.println("4. Hablar con la aldaba de águila (Sala Común Ravenclaw).");

							String opTorre = sc.nextLine();
							switch (opTorre) {

								case "1":
									// CASO 1: ERES EL ESTUDIANTE (El único que necesita Lumos)
									if (esEstudiante) {
										if (inventarioHechizos.contains("Lumos")) {
											System.out.println("Neville: ¡Ya te enseñé el hechizo! Corre al bosque.");
										} else {
											System.out.println("Neville: Hola " + nombre + ". ¿Quieres ir al bosque?");
											System.out.println(
													"Neville: Está muy oscuro. Necesitas luz, pero primero debes demostrar que conoces tu historia.");
											System.out.println(
													"PREGUNTA: ¿Quién es el fundador de tu casa (" + casa + ")?");

											String respuesta = sc.nextLine().toLowerCase();
											boolean esCorrecto = false;

											// Validamos la respuesta según la casa asignada
											if (casa.equals("Gryffindor") && respuesta.contains("godric")) {
												esCorrecto = true;
											} else if (casa.equals("Slytherin") && respuesta.contains("salazar")) {
												esCorrecto = true;
											} else if (casa.equals("Ravenclaw") && respuesta.contains("rowena")) {
												esCorrecto = true;
											} else if (casa.equals("Hufflepuff") && respuesta.contains("helga")) {
												esCorrecto = true;
											}

											if (esCorrecto) {
												System.out.println("Neville: ¡Correcto! Mira y aprende...");
												System.out.println("--- ¡HAS APRENDIDO LUMOS! ---");
												System.out.println(
														"Ahora puedes entrar en zonas oscuras como el Bosque Prohibido.");

												inventarioHechizos.add("Lumos");
												// IMPORTANTE: Añadimos daño 0 o 5 para que no de error en combate
												daniosHechizos.add(5);
											} else {
												System.out.println(
														"Neville: Mmm... incorrecto. Deberías repasar 'Historia de Hogwarts'.");
											}
										}
									}
									// CASO 2: ERES MYRTLE O DOBBY (No necesitan Lumos)
									else {
										System.out.println("Neville: ¡Anda! Si no eres un estudiante normal.");
										if (esMyrtle) {
											System.out.println(
													"Neville: Los fantasmas veis en la oscuridad, Myrtle. No necesitas mi ayuda.");
										} else if (esDobby) {
											System.out.println(
													"Neville: Dobby, los elfos tienen ojos especiales. Puedes entrar al bosque sin luz.");
										}
									}
									break;

								case "2":
									System.out.println(
											"Miras por el telescopio... Ves una sombra moviéndose en el Bosque Prohibido.");
									break;

								case "3":
									zonaActual = "Gran Escalera";
									break;

								case "4":
									if (casa.equals("Ravenclaw")) {
										System.out.println(
												"La aldaba te pregunta: '¿Qué fue antes, el fénix o la llama?'.");
										System.out.println("Respondes con sabiduría: 'Un círculo no tiene principio'.");
										System.out.println(
												"La puerta se abre. Entras a una sala aireada con vistas a las montañas.");
										System.out.println("Te sientes más sabio y tranquilo. +20 de Moral.");
										moral += 20;
									} else {
										System.out.println(
												"La aldaba te plantea un acertijo filosófico que no entiendes.");
										System.out.println("Como no eres de Ravenclaw, la puerta permanece cerrada.");
									}
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

				// FINAL DEL JUEGO - COMBATE CONTRA EL MAGO (Versión completa de Mateo)
				System.out.println("\nLlegas a la Sala de los Menesteres. El ritual ha comenzado.");
				// aqui faltaria la escena de combate y algun dialogo con el mago malo maloso

				System.out.println("¡Comienza la batalla!");

				// DECIDIR QUIÉN EMPIEZA
				if (Math.random() < 0.5) {
					turnoJugador = true;
					System.out.println("\n>> Empieza el jugador");
				} else {
					turnoJugador = false;
					System.out.println("\n>> Empieza el Mago");
				}

				// ========================================================================
				// BUCLE DE COMBATE
				// ========================================================================
				while (vida > 0 && vidaMago > 0) {

					// ------------------- TURNO DEL JUGADOR -------------------
					if (turnoJugador) {
						System.out.println("\n------------------------------------------------");
						System.out.println("TU TURNO | Vida: " + vida + " | Mago: " + vidaMago);
						System.out.println("¿Qué quieres hacer?");
						System.out.println("1. Atacar");
						System.out.println("2. Usar Objeto");

						int accion = sc.nextInt();

						// --- OPCIÓN 1: ATACAR ---
						if (accion == 1) {
							System.out.println("=== Hechizos disponibles ===");
							for (int i = 0; i < inventarioHechizos.size(); i++) {
								System.out.println((i + 1) + ". " + inventarioHechizos.get(i) + " (Daño: "
										+ daniosHechizos.get(i) + ")");
							}
							System.out.println("Elige ataque:");
							int opcionAtaque = sc.nextInt();

							if (opcionAtaque >= 1 && opcionAtaque <= inventarioHechizos.size()) {
								// Recuperar datos de las listas del jugador
								String ataqueSeleccionado = inventarioHechizos.get(opcionAtaque - 1);
								int danioBase = daniosHechizos.get(opcionAtaque - 1);

								System.out.println("¡Has lanzado " + ataqueSeleccionado + "!");

								// Determinar acierto
								int resultado = rd.nextInt(3); // 0=Total, 1=Parcial, 2=Fallo
								int danioFinal = 0;

								// --- LÓGICA DE EFECTOS ---
								if (esDobby && ataqueSeleccionado == ("Desarmar")

										&& inventarioObjetosMago.contains("nariz") && resultado == 0
										|| resultado == 1) {
									inventarioObjetosMago.remove("nariz");
									danioBase = danioBase * 2;
								}

								if (resultado == 0) {
									danioFinal = danioBase;
									System.out
											.println(">> ¡Impacto Directo! El Mago recibe " + danioFinal + " de daño.");
								} else if (resultado == 1) {
									danioFinal = danioBase / 2;
									System.out.println(">> El Mago se cubre. Recibe " + danioFinal + " de daño.");
								} else {
									System.out.println(">> ¡El Mago esquivó tu ataque!");
								}

								// --- LÓGICA DE EFECTOS ---
								if (esDobby && ataqueSeleccionado == ("Desarmar")

										&& inventarioObjetosMago.contains("nariz") && resultado == 0
										|| resultado == 1) {
									System.out.println("La nariz del Mago cayó al suelo.");
								}

								vidaMago -= danioFinal;
								if (vidaMago < 0)
									vidaMago = 0;

								// --- LÓGICA DE EFECTOS ---
								if (esMyrtle && ataqueSeleccionado == ("Anima Vinculus") && resultado == 0
										|| resultado == 1 && vida < 45 && vidaMago < 75) {

									vida = (vida + vidaMago) / 2;
									vidaMago = (vida + vidaMago) / 2;
									System.out.println("¡Los combatientes compartieron su dolor!");
								}

								if (vidaMago < 38 && vidaMago > 0) {
									System.out.println("¡Los hechizos del Mago se han potenciado por la rabia!");
								}

								turnoJugador = false; // Turno finalizado

							} else {
								System.out.println("Ataque no válido. Vuelve a intentarlo.");
								continue; // Reinicia el bucle sin cambiar turno
							}

							// --- OPCIÓN 2: USAR OBJETO ---
						} else if (accion == 2) {
							if (inventarioObjetos.isEmpty()) {
								System.out.println("¡No tienes objetos en el inventario!");
								continue; // Vuelve al menú
							}

							System.out.println("=== Inventario ===");
							for (int i = 0; i < inventarioObjetos.size(); i++) {
								System.out.println((i + 1) + ". " + inventarioObjetos.get(i));
							}
							System.out.println("0. Cancelar");

							System.out.println("Elige objeto:");
							int opcionObjeto = sc.nextInt();

							if (opcionObjeto == 0) {
								continue; // Cancelar y volver al menú principal
							}

							if (opcionObjeto >= 1 && opcionObjeto <= inventarioObjetos.size()) {
								String objetoElegido = inventarioObjetos.get(opcionObjeto - 1);
								System.out.println("Usaste: " + objetoElegido);

								// --- LÓGICA DE EFECTOS ---
								if (objetoElegido.equals("Poción de Vida")) {
									int cura = 20; // Cantidad que cura
									vida += cura;
									System.out.println(">> ¡Recuperas " + cura + " de vida!");
								} else if (objetoElegido.equals("Calcetín")) {
									System.out.println(">> Te pones el calcetín. No pasa nada.");
								} else if (objetoElegido.equals("Vendas")) {
									int cura = 10; // Cantidad que cura
									vida += cura;
								} else if (objetoElegido.equals("Colmillo Acromántula")) {
									System.out.println(
											"Clavas el colmillo en el mago. Su vitalidad disminuye drásticamente.");
									vidaMago -= 25;
								} else {
									System.out.println(">> Este objeto no parece tener efecto en combate.");
								}

								// ELIMINAR EL OBJETO USADO
								inventarioObjetos.remove(opcionObjeto - 1);

								turnoJugador = false; // Turno finalizado tras usar objeto
							} else {
								System.out.println("Opción inválida.");
								continue;
							}

						} else {
							System.out.println("Acción no reconocida.");
							continue;
						}
					}
					// ------------------- TURNO DEL MAGO (ENEMIGO) -------------------
					else {
						System.out.println("\n------------------------------------------------");
						System.out.println("TURNO DEL MAGO");

						// Selección aleatoria del ataque usando el tamaño de su lista
						int indiceAleatorio = rd.nextInt(inventarioHechizosMago.size());

						// Extraer nombre y daño con el mismo índice
						String nombreAtaque = inventarioHechizosMago.get(indiceAleatorio);
						int danioBase = daniosHechizosMago.get(indiceAleatorio);

						// Si el mago tiene menos de la mitad de la vida, pega el doble
						if (vidaMago < 38) {
							danioBase = danioBase * 2;
						}

						System.out.println("El Mago ataca con: ¡" + nombreAtaque + "!");

						// Calcular acierto
						int resultado = rd.nextInt(3);
						int danioFinal = 0;

						if (resultado == 0) {
							danioFinal = danioBase;
							System.out.println(">> ¡Te golpea brutalmente! Recibes " + danioFinal + " de daño.");
						} else if (resultado == 1) {
							danioFinal = danioBase / 2;
							System.out.println(">> Te cubres a tiempo. Recibes solo " + danioFinal + " de daño.");
						} else {
							System.out.println(">> ¡Has esquivado el ataque!");
						}

						// --- LÓGICA DE EFECTOS ---
						if (nombreAtaque == ("Exanimus") && resultado == 0 || resultado == 1) {
							vidaMago += 12;
							System.out.println("El Mago te roba vitalidad y se cura 12 HP.");
						}

						vida -= danioFinal;
						if (vida < 0)
							vida = 0;
						System.out.println("Tu vida restante: " + vida);

						turnoJugador = true; // Le toca al jugador
					}
				}

				// ========================================================================
				// FIN DEL COMBATE
				// ========================================================================
				if (vida <= 0) {
					System.out.println("\n***********************************");
					System.out.println("      HAS SIDO DERROTADO...");
					System.out.println("***********************************");
					// Reset de vida del boss por si acaso
					vidaMago = 75;

				} else {
					System.out.println("\n***********************************");
					System.out.println(" ¡HAS VENCIDO AL MAGO!");
					System.out.println("***********************************");

				}

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

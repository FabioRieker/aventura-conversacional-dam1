package proyectoHarryPotter;

import java.util.Random;
import java.util.Scanner;

public class ProyectoHP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("╔══════════════════════════════════════════════════════════════════════╗");
		System.out.println(
				"                                                                                                 \n"
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
		System.out.println("╚══════════════════════════════════════════════════════════════════════╝");

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

				// inicio del juego
				boolean valido = false;
				String personaje;

				do {
					System.out.println("¿Qué personaje quieres jugar?");
					System.out.println("1. Myrtle la llorona");
					System.out.println("2. Dobby, el elfo doméstico");
					System.out.println("3. Personaje random");

					personaje = sc.nextLine();

					switch (personaje) {
						case "1":
							System.out.println("Has desbloqueado a Myrtle la llorona");
							valido = true;
							break;
						case "2":
							System.out.println("Has desbloqueado a Dobby");
							valido = true;
							break;
						case "3":
							System.out.println("Has desbloqueado personaje random");
							valido = true;
							System.out.println("¿Cómo te llamas?");
							String nombre = sc.nextLine();
							System.out.println("Era una mañana tranquila en Londres cuando de repente...");
							System.out.println("Viene un búho para entregarte un sobre");
							System.out.println("El sobre es para ti, " + nombre + ".");
							System.out.println("Está seleccionado para ir a Hogwarts");
							// gorro seleccionador. La mayoria está hecha con IA porque se me borró el
							// archivo y me gustaría ver por que hace ese booleano y no hace falta más
							// variables

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
								System.out.println("1. Herbología.");
								System.out.println("2. Defensa contra las Artes Oscuras.");
								System.out.println("3. Encantamientos.");
								System.out.println("4. Pociones.");
								String opcion3 = sc.nextLine();

								switch (opcion3) {
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

							// Pregunta 5
							do {
								valido1 = true;
								System.out.println("Si tuvieras que elegir un animal mágico, ¿cuál sería?");
								System.out.println("1. Niffler.");
								System.out.println("2. Hipogrifo.");
								System.out.println("3. Fénix.");
								System.out.println("4. Basilisco.");
								String opcion4 = sc.nextLine();

								switch (opcion4) {
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

							// Pregunta 6
							do {
								valido1 = true;
								System.out.println("¿Qué cualidad valoras más en un amigo?");
								System.out.println("1. Lealtad.");
								System.out.println("2. Valentía.");
								System.out.println("3. Inteligencia.");
								System.out.println("4. Ambición.");
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
								System.out.println("3. Tu valentía.");
								System.out.println("4. Tu poder.");
								String opcion6 = sc.nextLine();

								switch (opcion6) {
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

							// Pregunta 8
							do {
								valido1 = true;
								System.out.println("¿Qué camino elegirías en un bosque?");
								System.out.println("1. El más seguro y tranquilo.");
								System.out.println("2. El más oscuro y desafiante.");
								System.out.println("3. El más misterioso y lleno de enigmas.");
								System.out.println("4. El que lleva a un castillo imponente.");
								String opcion7 = sc.nextLine();

								switch (opcion7) {
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

							// Pregunta 9
							do {
								valido1 = true;
								System.out.println("Si pudieras tener un poder mágico, ¿cuál elegirías?");
								System.out.println("1. Curar a los demás.");
								System.out.println("2. Luchar contra cualquier enemigo.");
								System.out.println("3. Conocer todos los secretos.");
								System.out.println("4. Controlar a los demás.");
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
								System.out.println("4. Las mazmorras.");
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

							if (hufflepuff >= ravenclaw && hufflepuff >= gryffindor && hufflepuff >= slytherin) {
								System.out.println("Enhorabuena eres de Hufflepuff");
							} else if (ravenclaw >= hufflepuff && ravenclaw >= gryffindor && ravenclaw >= slytherin) {
								System.out.println("Enhorabuena eres de ravenclaw");
							} else if (gryffindor >= hufflepuff && gryffindor >= ravenclaw && gryffindor >= slytherin) {
								System.out.println("Enhorabuena eres de gryffindor");
							} else {
								System.out.println("Enhorabuena eres de slytherin");
							}

							break;
						default:
							System.out.println("Opción no válida. Intenta de nuevo.");
							break;
					}
				} while (!valido);

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
					Thread.sleep(50); // espera 50 milisegundos entre letras
				} catch (InterruptedException e) {
					e.printStackTrace(); // muestra el error si ocurre
				}
			}
		}
	}

}



fokodsfjosjfojsfo

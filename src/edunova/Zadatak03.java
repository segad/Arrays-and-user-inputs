package edunova;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class E07_Zadatak03_dodatno_prosiren {

	// Ulaz u program je niz znakova koji sadrži
	// imena gradova razdvojeno zarezom
	// Program ispisuje naziv grada koji u sebi ima najmanje znakova

	// Primjer ulaza: "Osijek, Zagreb, Varaždin, Sinj, Donji Miholjac"
	// Sinj

	public static void main(String[] args) {

		String[] gradovi = new String[5];

		// Zatraži od korisnika da unese pet gradova
		int i = 0, j = 0;
		while (i < 5) {

			// sa ovim ovdje cu napraviti da samo jednom može ispisati ovu prvu poruku

			while (j == 0) {
				gradovi[i] = JOptionPane
						.showInputDialog("Korisnik treba unjeti 5. gradova.\nUnesi " + (i + 1) + ". grad");
				j++;
			}

			// ovdje provjeravam je li korisnik unio grad
			if (gradovi[i].isEmpty()) {
				gradovi[i] = JOptionPane.showInputDialog("Nisi unio grad.\nUnesi " + (i + 1) + ". grad");

			} else if (!(gradovi[i].isEmpty())) {

				// Ovdje spremam prvo slovo
				char prvoSlovoMalo = gradovi[i].charAt(0);

				if (Character.isLowerCase(prvoSlovoMalo)) {
					gradovi[i] = JOptionPane
							.showInputDialog("Prvo slovo grada treba biti veliko.\nUnesi " + (i + 1) + ". grad");

				} else {// ovdje znam da su uvjeti zadovoljeni i idem na sljedeæi korak

					i++;
					j = 0;

				}

			}

		}

		System.out.println(Arrays.toString(gradovi));

		// Ovo je dio koda koji odvaja zarez ali nama neæe trebati
//	String gradovi = "Osijek, Zagreb, Varaždin, Sinj, Donji Miholjac";
//	
//	String[] gradoviBezZareza = gradovi.split(",");
//	
//	for(String grad: gradoviBezZareza) {
//		grad = grad.trim();
//		System.out.println(grad);
//	}

		// Ovdje provjeravam koji od ovih gradova ima najmanje znakova

		// Prvo me zanima koliko ima elemenaza u nizu te kreiram novi niz

		int[] brojSlova = new int[gradovi.length];

		// Ovdje si upisao koliko svaki pojedini zapis u nizu sadrži slova, raèunajuæi i
		// zareze
		for (i = 0; i < (gradovi.length); i++) {
			brojSlova[i] = gradovi[i].length();

		}

		// Ovdje cemo saznati koji ima najmanji broj slova
		int najmanjiBroj = brojSlova[0];
		int index = 0;

		// System.out.println(najmanjiBroj);

		for (i = 0; i < brojSlova.length; i++) {
			if (brojSlova[i] <= najmanjiBroj) {
				najmanjiBroj = brojSlova[i];
				index = i;
			}
		}

		// Ispis grada sa najmanje znakova

		System.out.println(gradovi[i - 1]);

	}

}

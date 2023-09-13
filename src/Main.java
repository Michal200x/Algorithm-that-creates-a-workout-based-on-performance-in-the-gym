

public class Main{

    public static void main(String[] args) {
        // Dane triathlonisty
        String plec = "mezczyzna"; // Płeć (mezczyzna lub kobieta)
        double waga = 100.0; // Waga w kg
        int wiek = 30; // Wiek
        double wzrost = 190.0; // Wzrost w cm
        String celTreningowy = "siła"; // Cel treningowy (siła lub kondycja)
        int poziomZaawansowania = 5; // Poziom zaawansowania (1, 2, 3, ... , 5)
        int iloscTreningowTygodniowo = 3; // Ilość dni treningowych

        stworzPlanTreningowy(plec, waga, wiek, wzrost, celTreningowy, poziomZaawansowania, iloscTreningowTygodniowo);
    }

    // Stworzenie planu treningowego na siłowni
    public static void stworzPlanTreningowy(String plec, double waga, int wiek, double wzrost, String celTreningowy, int poziomZaawansowania, int iloscTreningowTygodniowo) {
        //Random rand = new Random();  można dać losowość

        for (int dzien = 1; dzien <= iloscTreningowTygodniowo; dzien++) {
            System.out.println("Dzień " + dzien + " - Trening:");

            if (dzien == 1) {
                // Trening klatka, biceps, triceps, brzuch
                System.out.println("1. Trening:");
                System.out.println("Partia: Klatka piersiowa");
                double maksymalneObciazenieKlatka = obliczMaksymalneObciazenie(plec, waga, wiek, wzrost, "klatka");
                int iloscSeriiKlatka = obliczIloscSerii("klatka", celTreningowy);
                for (int seria = 1; seria <= iloscSeriiKlatka; seria++) {
                    double obciazenieTreningoweKlatka = obliczObciazenieTreningowe("klatka", maksymalneObciazenieKlatka, poziomZaawansowania);
                    int przerwaKlatka = obliczPrzerweMiedzySeriami(poziomZaawansowania);
                    System.out.println("Seria " + seria + ": Obciążenie: " + obciazenieTreningoweKlatka + " kg, Przerwa: " + przerwaKlatka + " sekundy");
                }

                System.out.println("Partia: Biceps");
                double maksymalneObciazenieBiceps = obliczMaksymalneObciazenie(plec, waga, wiek, wzrost, "biceps");
                int iloscSeriiBiceps = obliczIloscSerii("biceps", celTreningowy);
                for (int seria = 1; seria <= iloscSeriiBiceps; seria++) {
                    double obciazenieTreningoweBiceps = obliczObciazenieTreningowe("biceps", maksymalneObciazenieBiceps, poziomZaawansowania);
                    int przerwaBiceps = obliczPrzerweMiedzySeriami(poziomZaawansowania);
                    System.out.println("Seria " + seria + ": Obciążenie: " + obciazenieTreningoweBiceps + " kg, Przerwa: " + przerwaBiceps + " sekundy");
                }

                System.out.println("Partia: Triceps");
                double maksymalneObciazenieTriceps = obliczMaksymalneObciazenie(plec, waga, wiek, wzrost, "triceps");
                int iloscSeriiTriceps = obliczIloscSerii("triceps", celTreningowy);
                for (int seria = 1; seria <= iloscSeriiTriceps; seria++) {
                    double obciazenieTreningoweTriceps = obliczObciazenieTreningowe("triceps", maksymalneObciazenieTriceps, poziomZaawansowania);
                    int przerwaTriceps = obliczPrzerweMiedzySeriami(poziomZaawansowania);
                    System.out.println("Seria " + seria + ": Obciążenie: " + obciazenieTreningoweTriceps + " kg, Przerwa: " + przerwaTriceps + " sekundy");
                }

                System.out.println("Partia: Brzuch");
                double maksymalneObciazenieBrzuch = obliczMaksymalneObciazenie(plec, waga, wiek, wzrost, "brzuch");
                int iloscSeriiBrzuch = obliczIloscSerii("brzuch", celTreningowy);
                for (int seria = 1; seria <= iloscSeriiBrzuch; seria++) {
                    double obciazenieTreningoweBrzuch = obliczObciazenieTreningowe("brzuch", maksymalneObciazenieBrzuch, poziomZaawansowania);
                    int przerwaBrzuch = obliczPrzerweMiedzySeriami(poziomZaawansowania);
                    System.out.println("Seria " + seria + ": Obciążenie: " + obciazenieTreningoweBrzuch + " kg, Przerwa: " + przerwaBrzuch + " sekundy");
                }
            } else if (dzien == 2) {
                // Trening barki, gora plecow, dol plecow, przedramie
                System.out.println("2. Trening:");
                System.out.println("Partia: Barki");
                double maksymalneObciazenieBarki = obliczMaksymalneObciazenie(plec, waga, wiek, wzrost, "barki");
                int iloscSeriiBarki = obliczIloscSerii("barki", celTreningowy);
                for (int seria = 1; seria <= iloscSeriiBarki; seria++) {
                    double obciazenieTreningoweBarki = obliczObciazenieTreningowe("barki", maksymalneObciazenieBarki, poziomZaawansowania);
                    int przerwaBarki = obliczPrzerweMiedzySeriami(poziomZaawansowania);
                    System.out.println("Seria " + seria + ": Obciążenie: " + obciazenieTreningoweBarki + " kg, Przerwa: " + przerwaBarki + " sekundy");
                }

                System.out.println("Partia: Górna część pleców");
                double maksymalneObciazenieGoraPlecow = obliczMaksymalneObciazenie(plec, waga, wiek, wzrost, "gora plecow");
                int iloscSeriiGoraPlecow = obliczIloscSerii("gora plecow", celTreningowy);
                for (int seria = 1; seria <= iloscSeriiGoraPlecow; seria++) {
                    double obciazenieTreningoweGoraPlecow = obliczObciazenieTreningowe("gora plecow", maksymalneObciazenieGoraPlecow, poziomZaawansowania);
                    int przerwaGoraPlecow = obliczPrzerweMiedzySeriami(poziomZaawansowania);
                    System.out.println("Seria " + seria + ": Obciążenie: " + obciazenieTreningoweGoraPlecow + " kg, Przerwa: " + przerwaGoraPlecow + " sekundy");
                }

                System.out.println("Partia: Dolna część pleców");
                double maksymalneObciazenieDolPlecow = obliczMaksymalneObciazenie(plec, waga, wiek, wzrost, "dol plecow");
                int iloscSeriiDolPlecow = obliczIloscSerii("dol plecow", celTreningowy);
                for (int seria = 1; seria <= iloscSeriiDolPlecow; seria++) {
                    double obciazenieTreningoweDolPlecow = obliczObciazenieTreningowe("dol plecow", maksymalneObciazenieDolPlecow, poziomZaawansowania);
                    int przerwaDolPlecow = obliczPrzerweMiedzySeriami(poziomZaawansowania);
                    System.out.println("Seria " + seria + ": Obciążenie: " + obciazenieTreningoweDolPlecow + " kg, Przerwa: " + przerwaDolPlecow + " sekundy");
                }

                System.out.println("Partia: Przedramię");
                double maksymalneObciazeniePrzedramie = obliczMaksymalneObciazenie(plec, waga, wiek, wzrost, "przedramie");
                int iloscSeriiPrzedramie = obliczIloscSerii("przedramie", celTreningowy);
                for (int seria = 1; seria <= iloscSeriiPrzedramie; seria++) {
                    double obciazenieTreningowePrzedramie = obliczObciazenieTreningowe("przedramie", maksymalneObciazeniePrzedramie, poziomZaawansowania);
                    int przerwaPrzedramie = obliczPrzerweMiedzySeriami(poziomZaawansowania);
                    System.out.println("Seria " + seria + ": Obciążenie: " + obciazenieTreningowePrzedramie + " kg, Przerwa: " + przerwaPrzedramie + " sekundy");
                }
            } else if (dzien == 3) {
                // Trening pośladki, mięsień czterogłowy uda, mięsień dwugłowy uda, lydki
                System.out.println("3. Trening:");
                System.out.println("Partia: Pośladki");
                double maksymalneObciazeniePosladki = obliczMaksymalneObciazenie(plec, waga, wiek, wzrost, "posladki");
                int iloscSeriiPosladki = obliczIloscSerii("posladki", celTreningowy);
                for (int seria = 1; seria <= iloscSeriiPosladki; seria++) {
                    double obciazenieTreningowePosladki = obliczObciazenieTreningowe("posladki", maksymalneObciazeniePosladki, poziomZaawansowania);
                    int przerwaPosladki = obliczPrzerweMiedzySeriami(poziomZaawansowania);
                    System.out.println("Seria " + seria + ": Obciążenie: " + obciazenieTreningowePosladki + " kg, Przerwa: " + przerwaPosladki + " sekundy");
                }

                System.out.println("Partia: Mięsień czterogłowy uda");
                double maksymalneObciazenieCzteroglowyUda = obliczMaksymalneObciazenie(plec, waga, wiek, wzrost, "miecz czteroglowy uda");
                int iloscSeriiCzteroglowyUda = obliczIloscSerii("miecz czteroglowy uda", celTreningowy);
                for (int seria = 1; seria <= iloscSeriiCzteroglowyUda; seria++) {
                    double obciazenieTreningoweCzteroglowyUda = obliczObciazenieTreningowe("miecz czteroglowy uda", maksymalneObciazenieCzteroglowyUda, poziomZaawansowania);
                    int przerwaCzteroglowyUda = obliczPrzerweMiedzySeriami(poziomZaawansowania);
                    System.out.println("Seria " + seria + ": Obciążenie: " + obciazenieTreningoweCzteroglowyUda + " kg, Przerwa: " + przerwaCzteroglowyUda + " sekundy");
                }

                System.out.println("Partia: Mięsień dwugłowy uda");
                double maksymalneObciazenieDwuglowyUda = obliczMaksymalneObciazenie(plec, waga, wiek, wzrost, "miecz dwuglowy uda");
                int iloscSeriiDwuglowyUda = obliczIloscSerii("miecz dwuglowy uda", celTreningowy);
                for (int seria = 1; seria <= iloscSeriiDwuglowyUda; seria++) {
                    double obciazenieTreningoweDwuglowyUda = obliczObciazenieTreningowe("miecz dwuglowy uda", maksymalneObciazenieDwuglowyUda, poziomZaawansowania);
                    int przerwaDwuglowyUda = obliczPrzerweMiedzySeriami(poziomZaawansowania);
                    System.out.println("Seria " + seria + ": Obciążenie: " + obciazenieTreningoweDwuglowyUda + " kg, Przerwa: " + przerwaDwuglowyUda + " sekundy");
                }

                System.out.println("Partia: Lydki");
                double maksymalneObciazenieLydki = obliczMaksymalneObciazenie(plec, waga, wiek, wzrost, "lydki");
                int iloscSeriiLydki = obliczIloscSerii("lydki", celTreningowy);
                for (int seria = 1; seria <= iloscSeriiLydki; seria++) {
                    double obciazenieTreningoweLydki = obliczObciazenieTreningowe("lydki", maksymalneObciazenieLydki, poziomZaawansowania);
                    int przerwaLydki = obliczPrzerweMiedzySeriami(poziomZaawansowania);
                    System.out.println("Seria " + seria + ": Obciążenie: " + obciazenieTreningoweLydki + " kg, Przerwa: " + przerwaLydki + " sekundy");
                }
            }

            System.out.println();
        }
    }

    public static double obliczMaksymalneObciazenie(String plec, double waga, int wiek, double wzrost, String partiaMiesniowa) {
        double maksymalneObciazenie = 0;

        if (plec.equals("mezczyzna")) {
            // Formuła dla mężczyzn
            switch (partiaMiesniowa) {
                case "klatka", "miecz czteroglowy uda", "miecz dwuglowy uda" -> maksymalneObciazenie = ((waga + wzrost) * 0.5);
                case "brzuch", "posladki" -> maksymalneObciazenie = ((waga + wzrost) * 0.4);
                case "barki", "gora plecow", "dol plecow" -> maksymalneObciazenie = ((waga + wzrost) * 0.45);
                case "biceps", "triceps" -> maksymalneObciazenie = ((waga + wzrost) * 0.3);
                case "przedramie" -> maksymalneObciazenie = ((waga + wzrost) * 0.25);
                case "lydki" -> maksymalneObciazenie = ((waga + wzrost) * 0.35);
            }
        } else if (plec.equals("kobieta")) {
            // Formuła dla kobiet
            maksymalneObciazenie = switch (partiaMiesniowa) {
                case "klatka", "barki" -> ((waga + wzrost) * 0.4);
                case "brzuch" -> ((waga + wzrost) * 0.35);
                default -> maksymalneObciazenie;
            };
        }

        if (wiek >= 40) {
            maksymalneObciazenie -= 10; // Redukcja obciążenia dla osób powyżej 40 roku życia
        }

        return maksymalneObciazenie;
    }

    public static double obliczObciazenieTreningowe(String partiaMiesniowa, double maksymalneObciazenie, double poziomZaawansowania) {
        double obciazenieTreningowe = switch (partiaMiesniowa) {
            case "klatka" -> (maksymalneObciazenie * 0.7);
            case "brzuch" -> (maksymalneObciazenie * 0.6);
            case "barki" -> (maksymalneObciazenie * 0.8);
            case "biceps", "triceps" -> (maksymalneObciazenie * 0.4);
            case "przedramie" -> (maksymalneObciazenie * 0.3);
            case "gora plecow", "dol plecow", "miecz czteroglowy uda", "miecz dwuglowy uda" -> (maksymalneObciazenie * 0.75);
            case "posladki" -> (maksymalneObciazenie * 0.65);
            case "lydki" -> (maksymalneObciazenie * 0.5);
            default -> 0;
        };

        // Dostosowanie obciążenia w zależności od poziomu zaawansowania
        obciazenieTreningowe = obciazenieTreningowe + (poziomZaawansowania - 1) * 5;

        return obciazenieTreningowe;
    }

    public static int obliczIloscSerii(String partiaMiesniowa, String celTreningowy) {
        int iloscSerii = switch (partiaMiesniowa) {
            case "klatka" -> 4;

            case "brzuch" -> 3;

            case "barki" -> 4;

            case "biceps" -> 3;

            case "triceps" -> 3;

            case "przedramie" -> 2;

            case "gora plecow" -> 4;

            case "dol plecow" -> 4;

            case "posladki" -> 3;

            case "miecz czteroglowy uda" -> 4;

            case "miecz dwuglowy uda" -> 4;

            case "lydki" -> 3;

            default -> 4;
        };

        if (celTreningowy.equals("kondycja")) {
            iloscSerii += 2;
            // Dla celu kondycyjnego zwiększamy ilość serii
        }

        return iloscSerii;
    }

    public static int obliczPrzerweMiedzySeriami(int poziomZaawansowania) {
        int przerwaMiedzySeriami = 60;

        // Dostosowanie przerwy w zależności od poziomu zaawansowania
        if (poziomZaawansowania >= 3) {
            przerwaMiedzySeriami = 45;
        }

        return przerwaMiedzySeriami;
    }
}

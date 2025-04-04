 public class Main {
        public static void main(String[] args) {
            Pharmacien pharmacien = new Pharmacien("Alice", "PH123");
            Client client = new Client("Bob");
    
            Medicament paracetamol = new VenteLibre("Paracetamol", 5.99, 10, 12);
            Medicament antibiotique = new VenteSurOrdonnance("Antibiotique", 12.50, 5, true);
    
            pharmacien.ajouterMedicament(paracetamol, 5);
    
            client.acheterMedicament(paracetamol);
    
            Ordonnance ordonnance = new Ordonnance(101);
            VenteSurOrdonnance venteSurOrdonnance = (VenteSurOrdonnance) antibiotique;
    
            if (venteSurOrdonnance.validerOrdonnance(ordonnance)) {
                pharmacien.vendreMedicament(client, antibiotique);
            }
        }
    }

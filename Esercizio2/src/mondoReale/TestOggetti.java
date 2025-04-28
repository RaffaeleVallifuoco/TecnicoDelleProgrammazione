package mondoReale;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TestOggetti {

        public static void main(String[] args) {

                // DATE FORMATTER

                DateTimeFormatter dataFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

                // ISTANZE COSTRUTTORE VUOTO

                Cane dog = new Cane();
                dog.setName("Fuffi");
                dog.setAge(4);

                Albero tree = new Albero();
                tree.setTipo("Abete");
                tree.setSpecie("Specie degli Abeti");
                tree.setNumeroRami(356);
                tree.setHabitat("Casa mia a Natale ");

                Telecomando remote = new Telecomando();
                remote.setBrand("Samsung");
                remote.setModel("UE76876");
                remote.setProductionDate(LocalDateTime.now());
                remote.setSerialCode("112233445566778899");

                // ISTANZE COSTRUTTORE PARAM.

                Cane dog2 = new Cane("Zuzzolo", 2);

                Albero tree2 = new Albero("pino", "pinus", "pineta", 1293);
                Telecomando remote2 = new Telecomando(
                                "66453728364",
                                "lg4   g4",
                                "lg",
                                LocalDateTime.of(2025, 1, 31, 9, 0, 0));

                // STAMPE

                System.out.println(String.format("cane 1:\n%s, %d anni", dog.getName(), dog.getAge()));
                System.out.println("--------------------------------");

                System.out.println(String.format("cane 2:\n%s, %d anni", dog2.getName(), dog2.getAge()));
                System.out.println("--------------------------------");

                System.out.println(String.format("albero 1:\n%s della specie %s, vive in %s e ha %d rami",
                                tree.getTipo(), tree.getSpecie(), tree.getHabitat(), tree.getNumeroRami()));
                System.out.println("--------------------------------");

                System.out.println(String.format("albero 2:\n%s della specie %s, vive in %s e ha %d rami",
                                tree2.getTipo(), tree2.getSpecie(), tree2.getHabitat(), tree2.getNumeroRami()));
                System.out.println("--------------------------------");

                // STAMPA DATE FORMATTATE

                System.out.println(String.format("telecomando 1:\n%s, %s, codice %s, prodotto il %s",
                                remote.getBrand(), remote.getModel(), remote.getSerialCode(),
                                remote.getProductionDate().format(dataFormatter)));
                System.out.println("--------------------------------");

                System.out.println(String.format("telecomando 2:\n%s, %s, codice %s, prodotto il %s",
                                remote2.getBrand(), remote2.getModel(), remote2.getSerialCode(),
                                remote2.getProductionDate().toLocalDate()));
        }
}

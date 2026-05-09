package builder.exemplul2.classes;

import java.util.ArrayList;
import java.util.List;

public class Laptop {
    private final String procesor;
    private final float memorieRAM;
    private final int capacitateSSD;
    private final boolean placaVideoDedicata;
    private final String sistemOperare;
    private final List<String> aplicatiiPreinstalate;

    private Laptop(Builder builder) {
        this.procesor = builder.procesor;
        this.memorieRAM = builder.memorieRAM;
        this.capacitateSSD = builder.capacitateSSD;
        this.placaVideoDedicata = builder.placaVideoDedicata;
        this.sistemOperare = builder.sistemOperare;
        this.aplicatiiPreinstalate = new ArrayList<>(builder.aplicatiiPreinstalate);
    }

    public void afiseazaDetalii() {
        StringBuilder builder = new StringBuilder();
        builder.append("Laptop{");
        builder.append("procesor='").append(procesor).append('\'');
        builder.append(", memorieRAM=").append(memorieRAM);
        builder.append(", capacitateSSD=").append(capacitateSSD);
        builder.append(", placaVideoDedicata=").append(placaVideoDedicata);
        builder.append(", sistemOperare='").append(sistemOperare).append('\'');
        builder.append(", aplicatiiPreinstalate=").append(aplicatiiPreinstalate);
        builder.append('}');
        System.out.println(builder);
    }

    public static class Builder {
        private final String procesor;
        private final float memorieRAM;
        private int capacitateSSD;
        private boolean placaVideoDedicata;
        private String sistemOperare;
        private List<String> aplicatiiPreinstalate;

        public Builder(String procesor, float memorieRAM) {
            this.procesor = procesor;
            this.memorieRAM = memorieRAM;
            this.capacitateSSD = 0;
            this.placaVideoDedicata = false;
            this.sistemOperare = "Fara OS";
            this.aplicatiiPreinstalate = new ArrayList<>();
        }

        public Builder setCapacitateSSD(int capacitateSSD) {
            if (capacitateSSD < 0) {
                throw new RuntimeException("Capacitatea SSD nu poate fi negativa");
            }
            this.capacitateSSD = capacitateSSD;
            return this;
        }

        public Builder setPlacaVideoDedicata(boolean placaVideoDedicata) {
            this.placaVideoDedicata = placaVideoDedicata;
            return this;
        }

        public Builder setSistemOperare(String sistemOperare) {
            if (sistemOperare == null || sistemOperare.trim().isEmpty()) {
                throw new RuntimeException("Introduceti un sistem de operare valid");
            }
            this.sistemOperare = sistemOperare;
            return this;
        }

        public Builder adaugaAplicatie(String denumire) {
            if (denumire == null || denumire.trim().isEmpty()) {
                System.out.println("Adaugati o aplicatie valida");
                return this;
            }
            this.aplicatiiPreinstalate.add(denumire);
            return this;
        }

        public Laptop build() {
            if (this.procesor == null || this.procesor.trim().isEmpty()) {
                throw new RuntimeException("Introduceti un model de procesor valid");
            }
            if (this.memorieRAM <= 0) {
                throw new RuntimeException("Memoria RAM invalida");
            }
            return new Laptop(this);
        }
    }
}
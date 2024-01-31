package Model;

public class Animal {

        private long numerin;
        private String nombre;
        private int numero_caja;
        private double altura;

        public Animal() {
        }

        public Animal(long id, String nombre, int edad, double altura) {
            this.numerin = id;
            this.nombre = nombre;
            this.numero_caja = edad;
            this.altura = altura;
        }

        public long getId() {
            return numerin;
        }

        public void setId(long id) {
            this.numerin = id;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getNumero_caja() {
            return numero_caja;
        }

        public void setNumero_caja(int numero_caja) {
            this.numero_caja = numero_caja;
        }

        public double getAltura() {
            return altura;
        }

        public void setAltura(double altura) {
            this.altura = altura;
        }
    }

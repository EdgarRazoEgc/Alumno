package paqprincipal;

public class Alumno {
    private String nombre;
    private int[] calificaciones;

    public Alumno(String nombre, int[] calificaciones) {
        this.nombre = nombre;
        this.calificaciones = calificaciones;
    }

    public double calcularPromedio() {
        int sum = 0;
        for (int calificacion : calificaciones) {
            sum += calificacion;
        }
        return (double) sum / calificaciones.length;
    }

    public char obtenerCalificacion(double promedio) {
        if (promedio <= 50) {
            return 'F';
        } else if (promedio <= 60) {
            return 'E';
        } else if (promedio <= 70) {
            return 'D';
        } else if (promedio <= 80) {
            return 'C';
        } else if (promedio <= 90) {
            return 'B';
        } else {
            return 'A';
        }
    }

    public void imprimirResultados() {
        System.out.println("Nombre del estudiante: " + nombre);
        System.out.println("Calificación 1: " + calificaciones[0]);
        System.out.println("Calificación 2: " + calificaciones[1]);
        System.out.println("Calificación 3: " + calificaciones[2]);
        System.out.println("Calificación 4: " + calificaciones[3]);
        System.out.println("Calificación 5: " + calificaciones[4]);
        double promedio = calcularPromedio();
        char calificacion = obtenerCalificacion(promedio);
        System.out.println("Promedio: " + promedio);
        System.out.println("Calificación: " + calificacion);
    }
    public static class Main {
        public static void main(String[] args) {
            int[] calificaciones = {85, 76, 92, 80, 78};
            Alumno alumno = new Alumno("Edgar Razo", calificaciones);
            alumno.imprimirResultados();
        }
    }
}

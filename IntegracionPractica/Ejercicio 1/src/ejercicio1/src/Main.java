//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Punto p1 = new Punto(0.0f, 0.0f);
        Punto p2 = new Punto(0.0f, 5.0f);
        Punto p3 = new Punto(5.0f, 0.0f);

        Lado l1 = new Lado(p1, p2);
        Lado l2 = new Lado(p2, p3);
        Lado l3 = new Lado(p3, p1);

        Triangulo triangulo = new Triangulo();
        triangulo.agregarLado(l1);
        triangulo.agregarLado(l2);
        triangulo.agregarLado(l3);

        Circulo circulo = new Circulo();
        Cuadrado cuadrado = new Cuadrado();

        Figura figuraCompleja = new Figura();
        figuraCompleja.agregarFiguraBasica(triangulo);
        figuraCompleja.agregarFiguraBasica(circulo);
        figuraCompleja.agregarFiguraBasica(cuadrado);

        System.out.println("Dibujando todos los elementos");
        figuraCompleja.mostrarComponentes();
    }
}
package semana21a;

import java.util.ArrayList;

public class Tela {
    private ArrayList<FiguraGeometrica> figuras;

    public Tela() {
        figuras = new ArrayList<>();
    }

    public int numeroFiguras() {
        return figuras.size();
    }

    public void addFigura(FiguraGeometrica f) {
        figuras.add(f);
    }

    public double areaTotal() {
        double total = 0.0;

        for (FiguraGeometrica figura : figuras) {
            total += figura.calcularArea();
        }

        return total;
    }

    public double perimetroTotal() {
        double total = 0.0;

        for (FiguraGeometrica figura : figuras) {
            total += figura.calcularPerimetro();
        }

        return total;
    }

}

package practic1;

public class Rectangle {
    private double dlina = 0;

    public Rectangle(double dlina) {
        this.dlina = dlina;
    }

    public void setDlina(double dlina) {
        this.dlina = dlina;
    }

    public double getDlina() {
        return dlina;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "dlina=" + dlina +
                '}';
    }

    public double square() {
        return dlina*dlina;
    }


}
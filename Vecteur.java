import java.beans.Transient;

public class Vecteur {

    double positionX, positionY,incX,incY;
    double directionX,directionY; 

    public Vecteur(double pPosX, double pPosY) {
        System.out.println("Création vecteur");
        this.positionX = pPosX;
        this.positionY = pPosY;
        this.directionX = 1;
        this.directionY = 0;
    }

    public Vecteur() {
        System.out.println("Création vecteur positions à null");
        this.positionX = 0;
        this.positionY = 0;
        this.directionX = 1;
        this.directionY = 0;
    }

    public void acceleration(){
        this.incX++;
        this.incY++;
    }


}

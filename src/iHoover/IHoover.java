package iHoover;


import java.util.Scanner;

public class IHoover {
    private int x; //Position x
    private int y; //Position y
    private char orientation; //Orientation de l'aspirateur
    private int dimensionX; //Dimension de la grille en largeur
    private int dimensionY; //Dimention de la grille en hauteur

    //Constructeur de la grille
    public IHoover(int dimensionX, int dimensionY) {
        this.dimensionX = dimensionX;
        this.dimensionY = dimensionY;
    }

    //Méthode pour définir la position de l'aspirateur
    public void setPosition(int x, int y, char orientation) {
        this.x = x;
        this.y = y;
        this.orientation = orientation;
    }

    //Méthode pour exécuter une instruction
    public void executeInstruction(char instruction) {
        if (instruction == 'D') {
            turnRight();
        } else if (instruction == 'G') {
            turnLeft();
        } else if (instruction == 'A') {
            forward();
        }
        System.out.println(getPosition()); //Afficher la position de l'aspirateur
    }

    //Méthode pour tourner à droite
    private void turnRight() {
        switch (orientation) {
            case 'N':
                orientation = 'E';  //Nord -> Est
                break;
            case 'E':
                orientation = 'S';  //Est -> Sud
                break;
            case 'S':
                orientation = 'W';  //Sud -> Ouest
                break;
            case 'W':
                orientation = 'N';  //Ouest -> Nord
                break;
        }
    }

    //Méthode pour tourner à gauche
    private void turnLeft() {
        switch (orientation) {
            case 'N':
                orientation = 'W'; //Nord -> Ouest
                break;
            case 'E':
                orientation = 'N'; //Est -> Nord
                break;
            case 'S':
                orientation = 'E'; //Sud -> Est
                break;
            case 'W':
                orientation = 'S'; //Ouest -> Sud
                break;
        }
    }

    //Méthode pour avancer
    private void forward() {
        switch (orientation) {
            case 'N':
                //Si l'aspirateur n'est pas sur le bord supérieur de la grille
                if (y < dimensionY - 1) {
                    y++; //Avancer
                }
                break;
            case 'E':
                //Si l'aspirateur n'est pas sur le bord droit de la grille
                if (x < dimensionX - 1) {
                    x++; //Avancer
                }
                break;
            case 'S':
                //Si l'aspirateur n'est pas sur le bord inférieur de la grille
                if (y > 0) {
                    y--; //Avancer
                }
                break;
            case 'W':
                //Si l'aspirateur n'est pas sur le bord gauche de la grille
                if (x > 0) {
                    x--; //Avancer
                }
                break;
        }
    }

    //Méthode pour afficher la position de l'aspirateur
    public String getPosition() {
        return "x=" + x + " y=" + y + " orientation=" + orientation; //Retourner la position de l'aspirateur
    }

    //Méthode main
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Lire les entrées clavier

        System.out.print("Enter the grid dimension (x y) : ");
        int dimensionX = scanner.nextInt(); //Lire la dimension en largeur
        int dimensionY = scanner.nextInt(); //Lire la dimension en hauteur
        scanner.nextLine(); // Lire le retour à la ligne

        IHoover vacuum = new IHoover(dimensionX, dimensionY); //Création de la grille

        System.out.print("Enter the iHoover position and orientation (x y orientation) : ");
        int initialPositionX = scanner.nextInt(); //Lire la position x
        int initialPositionY = scanner.nextInt(); //Lire la position y
        char initialOrientation = scanner.next().charAt(0); //Lire l'orientation
        scanner.nextLine(); // Lire le retour à la ligne

        vacuum.setPosition(initialPositionX, initialPositionY, initialOrientation); //Définir la position de l'aspirateur
        System.out.println("Initial position : " + vacuum.getPosition()); //Afficher la position initiale de l'aspirateur

        char instruction; //Instruction à exécuter

        //Tant que l'instruction n'est pas quitter
        do {
            System.out.print("Enter an instruction (D for right, G for left, A for forward, Q for stop) : "); //Afficher les instructions
            instruction = scanner.nextLine().charAt(0); //Lire l'instruction
            //Si l'instruction n'est pas quitter
            if (instruction != 'Q') {
                vacuum.executeInstruction(instruction); //Exécuter l'instruction
            }
        } while (instruction != 'Q');

        System.out.println("Final position and orientation : " + vacuum.getPosition()); //Afficher la position finale de l'aspirateur
    }
}





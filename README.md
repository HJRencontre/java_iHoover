# iHoover
Réalisation d'un test technique dans le cadre d'un éventuel entretien auprès de la société Yanport.

## Documentation

### Execution de l'application
Exécuter l'application, à l'aide d'un IDE capable d'éxecuter Java à l'aide du JDK (Eclipse, VSCode, IntelliJ...).
Exécuter l'application avec le bouton ▶️.

![image](https://github.com/HJRencontre/java_iHoover/assets/93084483/3d1ff7b2-e14e-42d9-aa12-dbb6eba38c1c)

### Paramétrage de la grille et de la position de l'aspirateur
A l'affichage du message "Enter the grid dimension (x y) : " saisir la dimension de la grille en respectant l'espacement (exemple : 10 10) et appuyer sur entrée.
A l'affichage du message "Enter the iHoover position and orientation (x y orientation) : " saisir la position de l'aspirateur et son orientation (exemple : 5 5 N) et appuyer sur entrée. 
La position et orientation initiale sera retournée :
![image](https://github.com/HJRencontre/java_iHoover/assets/93084483/64c20420-8ae8-4107-a636-c31339fcf629)


### Entrer une instruction
A l'affichage du message "Enter an instruction (D for right, G for left, A for forward, Q for stop) :", entrer une instruction au choix (exemple : D pour aller à droite) et appuyer sur entrée.
La nouvelle position et orientation vous sera retournée :
![image](https://github.com/HJRencontre/java_iHoover/assets/93084483/f46be8ae-952b-4200-aa22-d49c4d20ee38)

Vous pouvez de nouveau inscrire une nouvelle instruction.

### Note
Des contrôles sont effectués afin de ne pas sortir de la grille.



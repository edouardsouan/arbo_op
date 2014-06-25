Fichier justifiant mes choix
____________________________



Pourquoi evaluer() est-il avec 2 paramètres (String ,double) ?
- Je suis partie du principe qu'on pouvait choisir plusieurs variables/inconnues différentes (x, y ...)
 Donc evaluer() doit pouvoir indiquer pour quel nombre la variable est évaluée, et ce uniquement pour la
 variable choisie.

 Pour les classes Composite (opérateurs numériques), pourquoi avoir choisi le type String
 pour le signe et pas Char ?
 - J'ai supposé que si le programme évolué, on pouvait indiquer "sqrt" pour la racine carré par exemple.

Pourquoi rajouter la fonction isCalculable() ?
- Le fait de juste utiliser les fonctions calculer() ou évaluler() me paraissait trop permissif.
Donc j'ai cherché à avoir plus de sécurité grâce à isCalculabl()e dans l'interface ICalculable
pour gérer la demande d'évaluation des variables.
La fonction vérifie si la variable n'est pas évaluée ou si on a une division par 0 est présente dans l'expression.
Je souhaite alors obliger l'utilisateur à évaluer correctement les vaiables.



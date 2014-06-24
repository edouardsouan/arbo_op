Justifications :
- peut avoir plusieurs variables/inconnues différentes (x, y ...)
- signe pourrait être sqrt pour racine carré d'où le signe en String et non en Char


Juste calculer() ou évaluler() me paraissait trop permissif.
Donc assure plus de sécurité en obligeant à évaluer puis à calculer.

Pour éviter d'évaluer plusieurs fois la même var, évaluer() prend en paramètre
la variable String que l'on veut remplacer et la valeur numérique

Rajout de isCalculable dans l'interface ICalculable pour gérer la demande d'évaluation des varibles
si ce n'est pas fait ou si on a une division par 0

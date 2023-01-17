# La guilde marchande de la contrée EdN

Bonjour et bienvenue dans la guilde marchande de la contrée EdN située à fort WeNov.

Dans notre guilde, nous avons des marchands qui vendent des produits et des acheteurs qui achètent des produits informatiques.
Malheureusement, le domaine du numérique avance à une vitesse folle, et les produits que nous vendons sont de plus
en plus obsolètes au fur et à mesure que les nouvelles technologies apparaissent.

Nous avons donc décidé de mettre en place un système de gestion de stock pour gérer les produits que nous vendons.
Il a été développé par un de nos meilleurs programmeurs, mais il a disparu depuis quelque temps...

Votre mission est de prendre le relais et de terminer le développement de ce système de gestion de stock.

Voici donc les spécifications du système de gestion de stock :
* Tous les produits ont une valeur `nbJoursRestant` qui représente le nombre de jours restant avant que le produit ne soit obsolète.
* Tous les produits ont une valeur `prix` qui représente le prix du produit.
* Chaque jour, la valeur `nbJoursRestant` de chaque produit est décrémentée de 1 (sauf pour les produits qui sont
  déjà obsolètes), ainsi que le `prix` de chaque produit.

L'application doit respecter les spécifications suivantes :
* Si le produit est obsolète, le prix diminue deux fois plus vite.
* Le prix d'un produit ne peut pas être négatif.
* Les produits `collector` augmentent le prix chaque jour même s'ils sont obsolètes. L'aspect collector du produit le
  rendant de plus en rare, les collectionneurs sont prêts à payer plus cher pour l'obtenir.
* Le produit `Ordinateur quantique` est tellement performant qu'il ne perd pas de valeur avec le temps.
  Il est donc impossible de le rendre obsolète et son prix ne diminue jamais.
* Le produit `Licence Copilot` est comme un produit `collector`, son prix augmente de 2 quand il reste moins de 10 jours
  avant qu'il ne soit obsolète et de 3 quand il reste moins de 5 jours avant qu'il ne soit obsolète. Cependant, son
  prix tombe à 0 quand il est obsolète (le monde des IA est un monde cruel).

Avec la crise économique actuelle, nous avons décidé de signer un partenariat avec `AliExpress` pour avoir des
produits moins chers. Notre système actuel n'en tient pas compte, il faut donc le modifier pour qu'il prenne en
compte en sachant que :
* Les produits `AliExpress` voient leur prix diminué deux fois plus vite que les autres produits (la qualité n'étant
  pas exceptionnelle, il est difficile de les revendre à un prix élevé).

Pour mettre à jour le système de gestion de stock, vous pouvez modifier autant que vous voulez la méthode `update`
et ajouter autant de méthodes que vous voulez tant que tout fonctionne correctement. Attention cependant, vous ne
devez surtout pas modifier le code de la classe `Produit`, c'est le responsable de la guilde qui l'a développé
(Le RP des SdN) et il ne veut pas qu'on touche à son code, il est certain
d'avoir fait le code parfait pour cette classe, et il le prendrait très mal si vous la modifiez.

PS: Le prix de nos produits ne dépasse jamais 500€, nos clients sont des gens modestes. Sauf pour l'ordinateur
quantique, qui à un prix de 100000€, mais il est tellement performant qu'il vaut le coup !
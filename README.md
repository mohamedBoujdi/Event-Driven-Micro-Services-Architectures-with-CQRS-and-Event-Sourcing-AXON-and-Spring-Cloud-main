
# CQRS & Event Driven Microservices
ce projet est une application basée sur microservices qui utilise les patterns CQRS et Event Driven

1. L'Event Sourcing consiste à enregistrer tous les événements qui se produisent dans un système, de manière à pouvoir reconstruire l'état du système à un moment donné en parcourant ces événements. Cela permet de traiter les commandes en enregistrant les événements correspondants et de reconstruire l'état du système en parcourant les événements enregistrés.

Voici quelques avantages de l'utilisation de l'Event Sourcing :

Il permet de retracer l'historique des modifications apportées à un système, ce qui peut être utile pour la résolution de problèmes ou pour la compréhension de la manière dont le système a évolué au fil du temps.

Il offre une certaine souplesse pour la modification de l'état du système, car il est possible de traiter les événements de manière différente selon le contexte.

Il peut aider à éviter les problèmes de concurrence lorsque plusieurs commandes peuvent être exécutées en même temps, car chaque commande est traitée séparément et enregistrée sous forme d'événement.

2. CQRS, pour Command Query Responsibility Segregation, consiste à séparer les commandes (qui modifient l'état du système) des requêtes (qui consultent l'état du système). Cela permet de séparer les préoccupations liées à la modification et à la consultation de l'état du système, ce qui peut améliorer les performances et la scalabilité du système.

Voici quelques avantages de l'utilisation de CQRS :

Il permet d'optimiser les performances en utilisant des bases de données différentes pour les commandes et les requêtes, selon les besoins de chaque partie du système.

Il peut simplifier la conception du système en séparant les préoccupations liées à la modification et à la consultation de l'état du système.

Il peut aider à éviter les problèmes de concurrence en s'assurant que les commandes et les requêtes ne sont pas exécutées en même temps.

Il est important de noter que l'Event Sourcing et CQRS ne sont pas adaptés à tous les types de systèmes et qu'il est important de bien comprendre leurs avantages et leurs limites avant de décider de les utiliser.

## Architecture
![Architecture](https://user-images.githubusercontent.com/57298219/199542569-0782f133-8b66-4412-a447-a21788b8f735.jpg)


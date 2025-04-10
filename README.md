This is a Kotlin Multiplatform project targeting Android, iOS, Web, Desktop.

* `/composeApp` is for code that will be shared across your Compose Multiplatform applications.
  It contains several subfolders:
  - `commonMain` is for code that’s common for all targets.
  - Other folders are for Kotlin code that will be compiled for only the platform indicated in the folder name.
    For example, if you want to use Apple’s CoreCrypto for the iOS part of your Kotlin app,
    `iosMain` would be the right folder for such calls.

* `/iosApp` contains iOS applications. Even if you’re sharing your UI with Compose Multiplatform, 
  you need this entry point for your iOS app. This is also where you should add SwiftUI code for your project.


Learn more about [Kotlin Multiplatform](https://www.jetbrains.com/help/kotlin-multiplatform-dev/get-started.html),
[Compose Multiplatform](https://github.com/JetBrains/compose-multiplatform/#compose-multiplatform),
[Kotlin/Wasm](https://kotl.in/wasm/)…

We would appreciate your feedback on Compose/Web and Kotlin/Wasm in the public Slack channel [#compose-web](https://slack-chats.kotlinlang.org/c/compose-web).
If you face any issues, please report them on [GitHub](https://github.com/JetBrains/compose-multiplatform/issues).

You can open the web application by running the `:composeApp:wasmJsBrowserDevelopmentRun` Gradle task.

Projet Android - Rick and Morty API

Ce projet Android implémente une application basée sur l'API Rick and Morty. L'architecture adoptée est une approche Clean Architecture combinée avec les principes de MVVM (Model-View-ViewModel) pour assurer une séparation claire des responsabilités, améliorer la testabilité et faciliter la maintenance.

Structure du Projet

L'application est structurée selon les couches suivantes :

1. Couche Domain

Models : Définit les modèles de données utilisés dans toute l'application.

Repositories : Interfaces définissant les contrats pour la récupération de données.

Use Cases : Contiennent la logique métier pure, indépendante des détails techniques.

2. Couche Data

Remote : Gère l'interaction avec l'API distante (Rick and Morty API).

Local : Utilise Room pour la persistance locale des données.

Entities : Représentation des tables SQLite.

DAOs : Interfaces permettant d'accéder à la base de données locale.

Database : Classe abstraite RoomDatabase définissant la configuration de la base de données.

Repository Implementation : Implémente les interfaces définies dans la couche Domain en combinant données locales et distantes.

3. Couche Présentation (UI)

Adopte le patron MVVM.

ViewModels : Gèrent l'état des vues et communiquent avec les couches Domain via les use cases.

Views (Compose) : Interfaces utilisateur réalisées avec Jetpack Compose.

States & Events : Gestion des états d'UI et des interactions utilisateurs.

Technologies et Bibliothèques utilisées

Jetpack Compose : Pour la création des vues déclaratives.

Room : Pour la persistance locale des données.

Retrofit : Pour l'interaction réseau avec l'API.

Coroutines / Flow : Gestion simplifiée des opérations asynchrones.

Hilt : Injection de dépendances.

Bonnes pratiques appliquées

Single Source of Truth : Les données proviennent d'une source unique (base locale ou API).

Séparation claire des responsabilités : Facilite les tests unitaires et l'évolution de l'application.

Injection de dépendances : Simplifie la gestion des dépendances et améliore la modularité.

Installation et Exécution

Clonez le projet puis ouvrez-le dans Android Studio :

git clone https://github.com/votre-utilisateur/rick-and-morty-api.git

Compilez et lancez l'application sur un émulateur ou un appareil physique.

Contribution

Les contributions sont les bienvenues ! Merci d'ouvrir une issue pour toute suggestion ou un pull request pour proposer des améliorations.


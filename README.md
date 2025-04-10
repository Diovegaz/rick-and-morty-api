Android Project - Rick and Morty API

This Android project implements an application based on the Rick and Morty API. The architecture follows a Clean Architecture approach combined with MVVM (Model-View-ViewModel) principles to ensure clear separation of concerns, improve testability, and facilitate maintenance.

Project Structure

The application is structured into the following layers:

1. Domain Layer

Models: Defines the data models used throughout the application.

Repositories: Interfaces defining contracts for data retrieval.

Use Cases: Contain pure business logic, independent from technical details.

2. Data Layer

Remote: Handles interaction with the remote API (Rick and Morty API).

Local: Uses Room for local data persistence.

Entities: Representation of SQLite tables.

DAOs: Interfaces to access the local database.

Database: Abstract RoomDatabase class defining the database configuration.

Repository Implementation: Implements the interfaces defined in the Domain layer by combining local and remote data.

3. Presentation Layer (UI)

Adopts the MVVM pattern.

ViewModels: Manage view state and communicate with the Domain layer via use cases.

Views (Compose): User interfaces created with Jetpack Compose.

States & Events: Handling of UI states and user interactions.

Technologies and Libraries Used

Jetpack Compose: For declarative UI creation.

Room: For local data persistence.

Retrofit: For network interaction with the API.

Coroutines / Flow: Simplified management of asynchronous operations.

Hilt: Dependency injection.

Best Practices Applied

Single Source of Truth: Data originates from a single source (local database or API).

Clear Separation of Concerns: Facilitates unit testing and application scalability.

Dependency Injection: Simplifies dependency management and enhances modularity.

Installation and Execution

Clone the project and open it in Android Studio:

git clone https://github.com/your-username/rick-and-morty-api.git

Compile and launch the application on an emulator or physical device.

Contribution

Contributions are welcome! Please open an issue for suggestions or submit a pull request for improvements.

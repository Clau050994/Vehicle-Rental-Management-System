# Vehicle-Rental-Management-System
## Project Overview

The Vehicle Rental Management System is a Java-based application that manages vehicle rentals. It models various vehicle types and their attributes using object-oriented principles, such as inheritance, to allow for easy expansion and management.

## Key Features

- **Vehicle Management:** Add, update, and remove various types of vehicles, like cars, bikes, and trucks, each with specific attributes.
- **Rental Process:** Manage rental agreements and calculate charges based on vehicle type and rental duration.
- **Customer Management:** Register and manage customer information, and track their rental history.
- **Pricing Strategy:** Define and apply different pricing strategies for vehicle types, including discounts for members or long-term rentals.
- **Maintenance Records:** Maintain a log for vehicle maintenance activities and schedule regular check-ups.

## Classes and Inheritance Structure

- `Vehicle`: Base class with common vehicle attributes.
- `Car`, `Bike`, `Truck`: Specialized vehicle classes derived from `Vehicle`.
- `Customer`: Class for customer information and rental history.
- `Rental`: Class for handling rental transactions.
- `RentalManagementSystem`: Main class for managing system operations and user interactions.

## Development Phases

1. **Base Structure:** Implementation of the `Vehicle` and `Customer` classes.
2. **Specialized Vehicles:** Creation of `Car`, `Bike`, and `Truck` classes with unique attributes.
3. **Rental Transactions:** Development of the `Rental` class for handling rental agreements.
4. **Maintenance Tracking:** System for scheduling and tracking vehicle maintenance.
5. **Interface and Testing:** Design of a user interface and comprehensive testing.

   ## Enhancements with Abstract Classes and Interfaces

To improve the flexibility and maintainability of our code, we have introduced abstract classes and interfaces:

- The `Vehicle` class has been made abstract to serve as a foundational class that defines common attributes and abstract methods for different types of vehicles.

- A `Maintainable` interface has been introduced to standardize maintenance operations across all vehicle types that require regular service.

- The `Rentable` interface ensures that all items that can be rented, including vehicles, adhere to the same rental process, providing a consistent experience.

These changes allow for better scalability and make our system more adaptable to future requirements.




### Prerequisites

- Java Development Kit (JDK) 8 or later.
- Any IDE that supports Java, like IntelliJ IDEA or Eclipse.



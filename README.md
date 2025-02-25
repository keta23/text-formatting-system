# Text Formatting System (Decorator Pattern)

## Overview

This Java project implements a **text formatting system** using the **Decorator Design Pattern**. It allows users to input text and apply formatting options such as **bold**, **italic**, and **underline** dynamically.

## Design Pattern Used

The **Decorator Pattern** is used to add formatting styles to the base text dynamically without modifying its core implementation. This promotes flexibility and scalability.

## Class Structure

### Concrete Class: `Text`

```java
package model;

public class Text {
    
    private String value;
    
    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
```

### Decorators

- `BoldDecorator`: Adds bold formatting.
- `ItalicDecorator`: Adds italic formatting.
- `UnderlineDecorator`: Adds underline formatting.

Each decorator class extends `Text` and enhances the functionality of an existing text object.

## Main Entry Point

### `Main.java`

```java
public class Main {
    public static void main(String[] args) {
        TextController.getInstance().runApp();
    }
}
```

### `TextController.java`

The `TextController` class manages user interaction and formatting selection.

- Implements Singleton pattern for a single instance.
- Uses `TextService` to manage text input and formatting.
- Provides a menu-driven interface for user interaction.

## Usage Example

```java
TextController.getInstance().runApp();
```

This starts the interactive text formatting system, where users can:

- Enter a **text string**
- Apply **bold, italic, or underline** formatting

## Features

- Accepts user input text
- Supports **bold, italic, and underline** formatting
- Uses **Decorator Pattern** for flexible formatting
- Singleton **TextController** for centralized management
- Menu-based user interaction

## How to Run

1. Clone the repository.
2. Compile Java files: `javac *.java`
3. Run the program: `java Main`

## Future Enhancements

- Support for more formatting styles (e.g., strikethrough, color)
- GUI-based text formatting system
- Save and load formatted text

## License

This project is open-source and available under the MIT License.


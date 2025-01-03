# Text-Processor Documentation

## Overview

**Text-Processor** is a simple text editing application built using Java and JavaFX. It provides basic text editing functionality including creating, opening, editing, saving, and formatting text documents. The application is designed to be user-friendly and can be run easily on any system with Java support.

## Features

- **Create New Document**: Start with a blank canvas to create a new text document.
- **Open Existing Document**: Open and edit previously saved documents.
- **Save Document**: Save the document with the desired filename.
- **Undo/Redo**: Revert or redo changes with simple keyboard shortcuts.
- **Find and Replace**: Easily search for text within the document and replace it.
- **Simple Interface**: Easy-to-use and intuitive user interface built with JavaFX.

## System Requirements

- **Java Version**: 17 or higher
- **Operating System**: Cross-platform (Windows, macOS, Linux)
- **JavaFX Runtime**: Ensure JavaFX is installed and configured correctly for the application to run.

## Installation

1. **Install Java**: Download and install Java (JDK 17 or above) from the official [Oracle website](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html).
2. **Install JavaFX**: Download and configure JavaFX. You can find the official installation instructions on the [JavaFX website](https://openjfx.io/).
3. **Download the Application**: 
   - Clone or download the Text-Processor source code from the repository (or use the provided `.jar` file).
   
## Running the Application

To run the Text-Processor application, follow these steps:

1. Open a terminal or command prompt.
2. Navigate to the directory where the application is located (or the folder containing the `TextProcessor.jar` file).
3. Execute the following command:

   ```bash
   java -jar TextProcessor.jar


## Usage

Upon launching the **Text-Processor** application, you will be greeted with the main interface, which contains the following elements:

### 1. Menu Bar
The menu bar is located at the top of the window, providing access to various functionalities such as file operations, editing options, and settings.

- **File Menu**:
  - **New**: Create a new, blank text document.
  - **Open**: Open an existing text document from your computer to edit.
  - **Save**: Save the current document with the chosen filename and location.
  - **Exit**: Close the application.

- **Menu**:
  - **Undo**: Undo the last action or change made in the document.
  - **Redo**: Redo the last undone action.
  - **Find**: Search for a specific text string within the document.
  - **Replace**: Find and replace a specific text string with another.

### 2. Text Area
The text area is the central part of the window where you can type and edit your text. This is where you can create or modify your document's content.


### 3. Status Bar (Optional)
At the bottom of the application window, the status bar may display helpful information such as:

- Current word count.
- Current line and column number for the cursor position.
- Whether the document has been modified since the last save.

### Basic Document Operations

- **Creating a New Document**: Click `File > New` or use the keyboard shortcut to start a new document.
- **Opening an Existing Document**: Click `File > Open` or use to open a file from your computer.
- **Saving the Document**: Save the document by selecting `File > Save` or pressing
  
### Search and Replace
To search or replace text within your document:

1. Type the text you want to find and press **Enter**.
3. A window will appear choose . Enter the text to find and replace with, and click **Replace All** or **Replace** to make the changes.


## Conclusion

**Text-Processor** is a lightweight and easy-to-use text editing application that provides essential features for creating and editing text documents. Whether you're writing simple notes, creating formatted content, or managing text documents for work or personal projects, Text-Processor offers a reliable and user-friendly solution. With its clean interface and straightforward functionality, it allows you to focus on your writing without distractions.

If you encounter any issues or have suggestions for new features, feel free to reach out. We are always happy to improve the application and appreciate your feedback.

---

## License

Text-Processor is released under the **MIT License**. You are free to use, modify, and distribute this software, provided that you include the original copyright notice and disclaimers.

See the [LICENSE](LICENSE) file for more information.

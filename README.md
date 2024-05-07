# Book Record Management System

## Overview
This Java program helps manage a large catalog of book records. It processes CSV-formatted input files containing book records, checks for syntax and semantic errors, and provides interactive navigation of serialized book data.

## Features
- **Syntax Checking**: Validates each book record for syntax errors and categorizes them by genre.
- **Semantic Validation**: Checks for semantic validity of fields like ISBN, price, and year.
- **Serialization**: Converts valid book records into binary format for efficient storage and access.
- **Interactive Navigation**: Allows users to navigate through deserialized book records and view details.

## How to Run
1. Ensure Java is installed on your system.
2. Compile the program using `javac driver.java` .
3. Run the program.
4. Follow the on-screen prompts to navigate through book records.

## Input Files
- Input files should be in CSV format with fields: title, authors, price, isbn, genre, year.
- Place all input CSV files in the `inputs/` directory before running the program.

## Output Files
- Valid records are serialized into binary files by genre.
- Error logs are generated for records with syntax or semantic issues.

## Dependencies
- Java SE Development Kit 8 or higher.

## License
This project is provided for educational purposes only and is not licensed for commercial use.



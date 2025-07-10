# 💰 Bank Account Management System

A console-based Java application that simulates basic banking operations. Users can create accounts, deposit and withdraw funds, and view account details through an interactive menu-driven system.

## 🏦 Overview

This project provides a simplified model of a banking system for educational or personal use. It features account creation, deposit and withdrawal functionality, and account detail display with a user-friendly interface.

## 🚀 Features

- Create new bank accounts with custom names and opening balances
- Deposit funds into an account using its account number
- Withdraw funds with validation
- Display account details (name, account number, balance)
- Graceful termination with data cleanup

## 🧱 Technologies Used

- **Language**: Java
- **Input**: `java.util.Scanner`
- **Object-Oriented Design**: Encapsulated `Bank` class (not shown, assumed present)

## 🧩 Project Structure

```bash
.
├── BankAccountManagementSystem.java   # Main class with interactive menu
├── Bank.java                          # Bank class handling account logic
└── Account.java                       # Account class modeling individual accounts
```

## 🛠️ How to Run

### 🧰 Prerequisites
- Java Development Kit (JDK) 8 or higher installed
- Terminal or Java IDE (like IntelliJ IDEA, Eclipse)

### 🔨 Compile
```bash
javac BankAccountManagementSystem.java Bank.java Account.java
```

### ▶️ Execute
```bash
java BankAccountManagementSystem
```

## 📌 Example Interaction

```text
=== JavaBank Management System ===
1. Create Account
2. Deposit Funds
3. Withdraw Funds
4. Display Account Details
5. Exit
Enter your choice (1-5): 1
Enter account holder name: Alice
Enter initial balance: $500.00
```

## 📎 Notes

- Ensure the `Bank` and `Account` classes are properly implemented with essential methods like `createAccount()`, `depositToAccount()`, etc.
- Input validation and error handling can be enhanced for production-level reliability.

## 💡 Enhancements (Suggestions)

- Persist account data to file or database
- Add PIN verification and login system
- Support transfers between accounts
- GUI via JavaFX or Swing for better UX

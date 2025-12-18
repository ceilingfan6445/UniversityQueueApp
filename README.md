## University Office Hours Queue

This full stack application manages a real-time waiting list for student office hours.

## Tech Stack
* **Frontend:** Angular 21 (TypeScript, HTML, CSS)
* **Backend:** Java Spring Boot (REST API)
* **Data Structure:** LinkedList (In-memory storage)

## Features
* **Join Queue:** Students can enter their Name and ID to join the line.
* **Real-time List:** The interface automatically updates to show the current waiting list.
* **Manage Queue:** The professor can click "Call Next Student" to remove the first person from the line (FIFO).
* **Validation:** Prevents invalid inputs and handles empty queue states.

## How to Run

### 1. Start the Backend (Java)
Open a terminal in the `queue-system` folder and run this command:

```bash
./gradlew bootRun
```

This server runs at http://localhost:8080

### 2. Start the Frontend 
Open a separate terminal in the `queue-frontend` folder and run this command:

```bash
npm start
```

Enter http://localhost:4200 in your browser to see the app!

Created by Jayden
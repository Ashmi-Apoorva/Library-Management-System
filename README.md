# Library Management System
  <h2>Introduction</h2>
  <p>
    The Library Management System is a software application developed in Java, using the Swing framework for the graphical user interface and MySQL for the backend database. This system provides an efficient way to manage library operations, including:
  </p>
  <ul>
    <li>Staff management - adding, removing, and viewing staff details</li>
    <li>Book management - adding, removing, and keeping a count of available books</li>
    <li>Book issue/return management - tracking issue dates, due dates, and return dates along with customer details</li>
  </ul>

  <h2>Technologies Used</h2>
  <ul>
    <li><strong>Java</strong> (Swing framework)</li>
    <li><strong>JDBC</strong> for database connectivity</li>
    <li><strong>MySQL</strong> for the backend database</li>
  </ul>

  <h2>Features Synopsis</h2>
  <p>The Library Management System offers a range of functionalities to streamline library operations and enhance efficiency. Key features include:</p>

  <h3>A. Login Page</h3>
  <p>
    Provides a secure login interface where users enter their username and password. Upon successful login, the system directs users to the dashboard. There is also a "close" option, which allows the user to exit the application upon confirmation.
  </p>

  <h3>B. Dashboard</h3>
  <p>The main interface for authenticated users, containing functionalities classified as follows:</p>

  <h4>Staff Management</h4>
  <ul>
    <li><strong>Add Staff:</strong> Enables the addition of new staff members to the system by filling in relevant details on a form.</li>
    <li><strong>Remove Staff:</strong> Allows removal of staff members by entering their staff ID or name.</li>
    <li><strong>View Staff Details:</strong> Displays staff information and allows users to search for specific staff members.</li>
  </ul>

  <h4>Book Management</h4>
  <ul>
    <li><strong>Add Books:</strong> Allows adding new books to the library inventory or updating the count of existing books.</li>
    <li><strong>Remove Books:</strong> Enables removal of books from the library inventory by entering the book name or ID.</li>
    <li><strong>Books Available:</strong> Provides a list of available books and allows users to search for books by specific details.</li>
  </ul>

  <h4>Book Issuing and Returning</h4>
  <ul>
    <li><strong>Issue Book:</strong> Allows librarians to issue a book to a customer, tracking the issue and due dates. The count of the book is decremented in the database upon successful issuance.</li>
    <li><strong>Return Book:</strong> Enables tracking of book returns. Upon return, the issue details are moved to the "return database," and the count of the specific book is incremented.</li>
  </ul>

  <h4>Administrator Details Editing</h4>
  <ul>
    <li><strong>Edit Admin Details:</strong> Allows modifications to the administrator's account details.</li>
  </ul>

  <h4>Logout Functionality</h4>
  <ul>
    <li><strong>Logout:</strong> Logs the user out, closing the dashboard and returning to the login page.</li>
  </ul>

  <h2>System Overview</h2>
  <img width="423" alt="lib" src="https://github.com/user-attachments/assets/1857480c-d898-44cf-bae7-9e1ee3bc63ea">

  <h2>Implementation</h2>
  <h4>Front-end<h4>
  LOGIN  <p><img width="294" alt="login" src="https://github.com/user-attachments/assets/08701692-42d6-453a-8fdc-8bba9b524dd1"></p>
  DASHBOARD  <p><img width="399" alt="dashboard" src="https://github.com/user-attachments/assets/46313c42-164f-4c1f-9b9f-c5de56c61ea5"></p>
  ADD BOOKS  <p> <img width="360" alt="add books" src="https://github.com/user-attachments/assets/e631d2cb-93f3-40f4-81ac-d8d55aad70ed"></p>
  REMOVE BOOKS <p> <img width="254" alt="remove books" src="https://github.com/user-attachments/assets/328c6652-28a6-4c9b-8d08-8c65cfc1318c"></p>
  BOOKS AVAILABLE <p><img width="340" alt="books available" src="https://github.com/user-attachments/assets/99986c0e-1bca-4ec1-95c8-0ac1d07cce92"></p>
  ADD STAFF<p><img width="309" alt="add staff" src="https://github.com/user-attachments/assets/114f0c7a-b5d4-442c-a121-d01c3c151fef"> </p>
 REMOVE STAFF <p> <img width="247" alt="remove staff" src="https://github.com/user-attachments/assets/5e7c9ae6-3448-4aca-b435-9a4e765a3c7c"> </p>
  STAFF DETAILS <p><img width="345" alt="staff details" src="https://github.com/user-attachments/assets/540eae95-d082-435e-a92d-709d4a07ce13"> </p>
 ISSUE BOOKS <p><img width="300" alt="issue book" src="https://github.com/user-attachments/assets/f4bc2349-f561-4878-872a-a8b13d04c38b"> &emsp;
   <img width="400" alt="show issue table" src="https://github.com/user-attachments/assets/a5572dd4-c5ea-4edd-9069-d3d1a828ba63">  </p>
  RETURN BOOKS <p> <img width="298" alt="return book" src="https://github.com/user-attachments/assets/df3227b3-6615-4ef1-b521-3e721e28127c"> &emsp;
    <img width="298" alt="show return table" src="https://github.com/user-attachments/assets/7721ee0f-c301-4f77-91c8-aa15193a74a1"> </p>
  EDIT ADMIN <p><img width="254" alt="edit admin" src="https://github.com/user-attachments/assets/57acf6ca-07f8-4f0a-8dbc-c8a1645eb26e"></p>
  CLOSE <p><img width="395" alt="close app" src="https://github.com/user-attachments/assets/94288f0a-ee62-4f14-ac45-8350698ac877"> </p>
    
  <h4>Database</h4>
<p><img width="340" alt="d1" src="https://github.com/user-attachments/assets/d22a7727-6df3-417e-b0cb-5d7a59ab22ad"></p>
<p><img width="365" alt="d2" src="https://github.com/user-attachments/assets/d2cf5ffc-3cc5-436b-8fcb-e1532ac53c1c"></p>
<p><img width="356" alt="d3" src="https://github.com/user-attachments/assets/a52ed6bb-8e15-45ff-969d-fe85bd4b7ac4"></p>



  <h2>Installation and Setup</h2>
  <p>To set up the Library Management System, follow these steps:</p>
  <ol>
    <li><strong>Install Java Development Kit (JDK):</strong> Make sure you have the latest version of the JDK installed.</li>
    <li><strong>Install MySQL:</strong> Set up MySQL and create a database for the library management system.</li>
    <li><strong>Configure JDBC:</strong> Ensure the MySQL JDBC driver is added to your project's classpath.</li>
  </ol>

  <h3>Database Configuration</h3>
  <p>Set up the database with tables for storing staff, books, issued books, and return records. Make sure to configure the database connection settings in the Java source code (update the MySQL URL, username, and password as necessary).</p>

  <h2>Usage</h2>
  <p>To start the application:</p>
  <ol>
    <li>Compile and run the Java application.</li>
    <li>Log in with a valid username and password.</li>
    <li>Use the dashboard to access various features for managing staff, books, and transactions in the library.</li>
  </ol>

